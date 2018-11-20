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

@WebServlet(urlPatterns = "/NAME")
public class UpdateName extends GenericServlet {

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        PrintWriter ww = servletResponse.getWriter();
        ww.println("<html><body> " +
                "<form action='UPDATENAME'>" +
                "Modified_Name:<input type='text' name='updated'>" +
                "Mobile_Number : <input type='text' name='old'>" +
                "<input type='submit' value='Update'></form> </html></body>");
    }
}

