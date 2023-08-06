package my;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/S2")
public class Servlet2 extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=null;
		try {
			out=response.getWriter();
			
			out.print("<!doctype html>");
			out.print("<html>");
			out.print("<head><title>My App</title></head>");
			out.print("<body>");
			out.print("<h1>Hello Servlet 2</h1>");
			out.print("<p>This is Servlet 2 Page</p>");
			String n=request.getParameter("uname");
			String a=request.getParameter("age");
			String c=(String)request.getAttribute("cname");
			out.print("<p>Name: "+n+"</p>");
			out.print("<p>Age: "+a+"</p>");
			out.print("<p>Company Name: "+c+"</p>");
			out.print("</body>");
			out.print("</html>");
			
			out.close();
		}catch (Exception e) {
			out.print(e);
		}
	}
}