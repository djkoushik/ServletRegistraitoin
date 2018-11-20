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

@WebServlet(urlPatterns = "/UPDATEMOBILE")
public class ModifyMobile extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        try {
            PrintWriter pw = servletResponse.getWriter();
            String n = servletRequest.getParameter("updated");
            String mn = servletRequest.getParameter("old");
            String query = "update d.admin set Mobile= ?  where Mobile=?";
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306?user=root&password=09080706@As";
            Connection conn= DriverManager.getConnection(url);
            PreparedStatement p=conn.prepareStatement(query);
            p.setString(1,n);
            p.setString(2,mn);
            p.executeUpdate();
            pw.println("<html><body><form action='HOME'><input type='submit' value='Home'></form></body></html>");
        }
        catch (ClassNotFoundException e1)
        {
            System.out.println(e1);
        }
        catch (SQLException e1)
        {
            System.out.print(e1);
        }
    }
}