package firstapp;
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FirstApp")
public class FirstApp extends HttpServlet {
	
    public FirstApp() {
        super();
        // TODO Auto-generated constructor stub
    }
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=null;
		try {
			out=response.getWriter();
			out.print("<!doctype html>");
			out.print("<html>");
			out.print("<head><title>First App</title></head>");
			out.print("<body>");
			out.print("<h1>First App </h1>");
			out.print("<p>Hello world!</p>");
			out.print("<p> Date:"+java.time.LocalDateTime.now()+"</p>");
			out.print("</body>");
			out.print("</html>");
			out.close();
		}
		catch(Exception ex) {
			out.print(ex);
		}
		
		
		
	}

}