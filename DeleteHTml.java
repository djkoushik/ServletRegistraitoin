import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/DELETE")
public class DeleteHTml extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        PrintWriter pw = servletResponse.getWriter();
        pw.println("<html><body>" +
                "<form action='DELETEPROFILE'>" +
                "Please Enter your Mobile to delete corresponding Account <input type='text' name='mob'>" +
                "<input type='submit' value='Delete Profile'>" +
                "</form>" +
                "</html></body>");
    }
}
