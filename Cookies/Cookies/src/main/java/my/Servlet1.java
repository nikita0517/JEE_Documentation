package my;
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Cookie;

@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=null;
		 try {
			 out=response.getWriter();
			 out.print("<!doctype html><html>");
			 out.print("<head><title>Cookies</title></head>");
			 out.print("<h1>Cookies</h1>");
			 out.print("<p>Servlet 1<p>");
			 Cookie ck1=new Cookie("name","Nikita");
			 Cookie ck2=new Cookie("phone","9789422827");
			 ck1.setMaxAge(60*60*12);
			 ck2.setMaxAge(60*60*12);
			 response.addCookie(ck1);
			 response.addCookie(ck2);
			 out.close();
		 }
		 catch(Exception ex) {
			 out.print(ex);
		 }
	}

}
