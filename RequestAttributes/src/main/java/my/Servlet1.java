package my;

import java.io.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/S1")
public class Servlet1 extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=null;
		try {
			/*out=response.getWriter();
			request.setAttribute("cname", "INCAPP");
			RequestDispatcher rd=request.getRequestDispatcher("S2");
			//rd.forward(request, response);
			rd.include(request, response);
			out.print("<html><body><h1>Code after request dispatcher to servlet 1 to servlet 2.</h1></body></html>");   */
			
			out=response.getWriter();
			out.print("<!doctype html>");
			out.print("<html>");
			out.print("<head><title>My App</title></head>");
			out.print("<body>");
			out.print("<h1>Hello Servlet 1</h1>");
			request.setAttribute("cname","xyz");
			RequestDispatcher rd=request.getRequestDispatcher("S2");
			//rd.forward(request, response);
			rd.include(request, response);
			out.print("<p>This is Servlet 1 Page</p>");
			out.print("</body>");
			out.print("</html>");
			out.close();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
