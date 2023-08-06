package my;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServlet;


@WebServlet("/Servlet2")
public class Servlet2 extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=null;
		try {
			out=response.getWriter();
			HttpSession sc=request.getSession();
			String s=(String)sc.getAttribute("cname");
			out.print("<!doctype html>");
			out.print("<html>");
			out.print("<head><title>Http Session Request.</title></head>");
			out.print("<body>");
			out.print("<h1>Company Name:</h1>");
			out.print("<p>Company Name: "+s+"</p>");
			out.print("</body>");
			out.print("</html>");

		}
		catch(Exception ex) {
			out.print(ex);
		}
	}

}
