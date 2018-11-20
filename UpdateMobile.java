import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/MOBILE")
public class UpdateMobile extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        PrintWriter ww = servletResponse.getWriter();
        ww.println("<html><body> " +
                "<form action='UPDATEMOBILE'>Modified_Mobile:<input type='text' name='updated'>" +
                "Old_Mobile_Number : <input type='text' name='old'>" +
                "<input type='submit' value='change'></form> </html></body>");
    }
}