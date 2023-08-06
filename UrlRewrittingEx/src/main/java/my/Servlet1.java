package my;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=null;
		try {
			out=response.getWriter();
			
			out.print("<!doctype html>");
			out.print("<html>");
			out.print("<head><title>My App</title></head>");
			out.print("<body>");
			out.print("<h1>Hello Servlet 1</h1>");
			out.print("<p>This is Servlet 1 Page</p>");
			String n=request.getParameter("name");
			String a=request.getParameter("age");
			out.print("<p>Name: "+n+"</p>");
			out.print("<p>Age: "+a+"</p>");
			out.print("</body>");
			out.print("</html>");
			
			out.close();
		}catch (Exception e) {
			out.print(e);
		}
	}

}
