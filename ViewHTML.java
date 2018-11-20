import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/VIEW")
public class ViewHTML extends GenericServlet
{
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        PrintWriter pw = servletResponse.getWriter();
        pw.println("<html><body>" +
                "<form action='VIEWPROFILE'>" +
                "Please Enter your Mobile_Number to display the details of corresponding account <input type='text' name='mob'>" +
                "<input type='submit' value='View Profile'>" +
                "</html></body>");
    }
}
