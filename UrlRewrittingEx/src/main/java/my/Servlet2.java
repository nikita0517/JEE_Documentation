package my;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/Servlet2")
public class Servlet2 extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=null;
		try {
			out=response.getWriter();
			out.print("<!doctype html>");
			out.print("<html>");
			out.print("<head><title>My App</title></head>");
			out.print("<body>");
			out.print("<h1>Hello Servlet 1</h1>");
			String n=request.getParameter("name");
			out.print("<p>Name:"+n+"</p>");
			out.print("<p>This is Servlet 1 Page</p>");
			
			out.close();
		}
		catch(Exception e) {
			out.print(e);
	}

}
}
