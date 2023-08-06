package my;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;


@WebServlet("/MyListener")
public class MyListener extends HttpServlet {
	
		public void contextDestroyed(ServletContextEvent sce) {
			System.out.println("Hello App");
		}
		public void contextIntialise(ServletContextEvent sce) {
		System.out.println("Bye Bye App");
		}


	
}
