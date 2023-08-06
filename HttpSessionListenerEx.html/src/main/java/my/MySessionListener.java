package my;

import java.io.*;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/MySessionListener")
public class MySessionListener extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=null;
		try {
		out=response.getWriter();	
		out.print("<!doctype html>");
		out.print("<html>");
		out.print("<head><title>Sesssion APP</title><head>");
		out.print("<body>");
		out.print("<h1>Session Listener App.</h1>");
		HttpSession ctx=request.getSession();
		out.print("</body>");
		out.print("</html>");
		}catch(Exception ec) {
			out.print(ec);
		}
	}

}
