package my;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Servlet1
 */
@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=null;
		try {
			HttpSession s=request.getSession();
			s.setAttribute("cname", "Mango");
			out=response.getWriter();
			out.print("<!doctype html>");
			out.print("<html>");
			out.print("<head><title>Http Session Request.</title></head>");
			out.print("<body>");
			out.print("<h1>Servlet 1</h1>");
			out.print("HttpSession s=request.setSession('sname','mango')");
			out.print("</body>");
			out.print("</html>");
			
		}catch(Exception ex) {
			out.print(ex);
		}
	}

}
