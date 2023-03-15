import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServelet extends HttpServlet{

	//@Override
//	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		String rs="<button>click here this was Get request"+"post request Http</button>";
//		resp.getWriter().write(rs);
//	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher dispatcher= req.getRequestDispatcher("login.html");
		dispatcher.forward(req,resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String rs="<button>click here this was Post request"+"post request Http</button>";
		resp.getWriter().write(rs);
	}

//	@Override
//	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		HttpServletRequest request=(HttpServletRequest)arg0;
//		String method =request.getMethod();
//		
//		System.out.println("Login Servlet called");
//		String resp="";
//		if(method.equals("POST")) {
//			resp="<button>click here this was pot request"+"post request Http</button>";
//		}
//		else if(method.equals("GET")) { 
//			resp="<button>this was get request</button>";
//		}
//		
//		//System.out.println(request.getMethod());
//		//above sentence used to check if request if post or get
//		PrintWriter Writer =arg1.getWriter();
//		//Writer.write("<button>Click here</button>");
//		Writer.write(resp);
//		Writer.flush();
//		Writer.close();
//	
//	}

}
