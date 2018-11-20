import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet(urlPatterns = "/VIEWPROFILE")
public class Profile extends GenericServlet
{
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String mobi = servletRequest.getParameter("mob");
        jdbc(servletResponse, mobi);
    }
    public void jdbc(ServletResponse servletResponse, String mobi) throws IOException {
        PrintWriter pw = servletResponse.getWriter();
        String url = "jdbc:mysql://localhost:3306?user=root&password=09080706@As";
        String query="select * from d.admin where Mobile=?";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url);
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1,mobi);
            ResultSet rs = ps.executeQuery();
            if(rs.next())
            {
                pw.println(rs.getString("Name"));
                pw.println(rs.getString("Mobile"));
                pw.println(rs.getString("Email"));
                pw.println(rs.getString("Gender"));
                pw.println(rs.getString("Courses"));
            }
            pw.println("<html><body><form action='HOME'><input type='submit' value='Home'></form></body></html>");
        }
        catch (SQLException e) {
            pw.println();
        }
        catch (ClassNotFoundException e) {
            pw.println(e);
        }
    }
}
