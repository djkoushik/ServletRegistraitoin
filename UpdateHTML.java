import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@WebServlet(urlPatterns = "/UPDATE")
public class UpdateHTML extends GenericServlet
{
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        PrintWriter pw = servletResponse.getWriter();
        pw.println("<html><body>" +
                "<form action='NAME'><input type='submit' value='Modify Name'></form>" +
                "<form action='MOBILE'><input type='submit' value='Modify Mobile'></form>" +
                "<form action='EMAIL'><input type='submit' value='Modify Email'></form>" +
                "</body></html>");
    }
}

