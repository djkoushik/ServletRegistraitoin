import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/HOME")
public class HomeHTML extends GenericServlet
{
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        PrintWriter pw = servletResponse.getWriter();
        pw.println("" +
                "  <form action='ADD'>" +
                "  <input type='submit' value='Add'></form>" +
                "  <form action='UPDATE'>" +
                "  <input type='submit' value='Update'></form>" +
                "  <form action='VIEW'>" +
                "<input type='submit' value='View Profile Details'>" +
                "  </form>" +
                "  <form action='DELETE'>" +
                "  <input type='submit' value='Delete'>" +
                "  </form>");
    }
}
