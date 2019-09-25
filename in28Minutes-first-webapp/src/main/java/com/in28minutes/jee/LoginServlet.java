package com.in28minutes.jee;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.in28minutes.login.LoginService;

/*
 * Browser sends Http Request to Web Server
 * 
 * Code in Web Server => Input:HttpRequest, Output: HttpResponse
 * JEE with Servlets
 * 
 * Web Server responds with Http Response
 */

//Java Platform, Enterprise Edition (Java EE) JEE6

//Servlet is a Java programming language class 
//used to extend the capabilities of servers 
//that host applications accessed by means of 
//a request-response programming model.

//1. extends javax.servlet.http.HttpServlet
//2. @WebServlet(urlPatterns = "/login.do")
//3. doGet(HttpServletRequest request, HttpServletResponse response)
//4. How is the response created?

@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {
	
	private LoginService obj = new LoginService();

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		
		request.getRequestDispatcher("/WEB-INF/views/info.jsp").forward(request, response);
		System.out.println("doget");
		request.getServerName();
		System.out.println(request.getServerName());
		/*PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>manish!!!!!!!!</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("rishabh san hi ");
		out.println("</body>");
		out.println("</html>");
*/
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String name = request.getParameter("name");
		request.setAttribute("name", name);
		String password = request.getParameter("password");
		request.setAttribute("password", password);
		boolean istrue = obj.validation(name, password);
		if(istrue) {
		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
		System.out.println("mansihs");
		}else
		{
			request.setAttribute("errorMessage", "wrong crendentials");
			request.getRequestDispatcher("/WEB-INF/views/info.jsp").forward(request, response);
		}
	}
	

}