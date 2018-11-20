import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/EMAIL")
public class UpdateEmail extends GenericServlet {

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        PrintWriter ww = servletResponse.getWriter();
        ww.println("<html><body> " +
                "<form action='UPDATEEMAIL'>" +
                "Modified_Email:<input type='text' name='modified_mail'>" +
                "Old_Email_Id: <input type='text' name='old'>" +
                "<input type='submit' value='Update'></form>" +
                "</html></body>");
    }
}