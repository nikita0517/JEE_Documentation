package my;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Cookie;

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
		out.print("<h1>Hello Servlet 2</h1>");
		out.print("<p>This is Servlet 2 Page</p>");
		Cookie c[]=request.getCookies();
		if(c!=null) {
			for(Cookie x:c) {
		out.print("<p>"+x.getName()+"&nbsp&nbsp&nbsp&nbsp"+x.getValue()+"</p>");
		out.print("</body>");
		out.print("</html>");
		out.close();
	}
		} }
		catch(Exception e) {
		out.print(e);
	}
	}
}
