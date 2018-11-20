import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet(urlPatterns = "/DELETEPROFILE")
public class DeleteProfile extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String mobi = servletRequest.getParameter("mob");
        jdbc(servletResponse, mobi);
    }

    public void jdbc(ServletResponse servletResponse, String mobi) throws IOException {

        PrintWriter pw = servletResponse.getWriter();
        String url = "jdbc:mysql://localhost:3306?user=root&password=09080706@As";
        String query = "delete from d.admin where Mobile=?";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url);
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, mobi);
            ps.executeUpdate();
            pw.println("Your account has been successfully deleted , Feel free to register once again");
            pw.println("<html><body><form action='HOME'><input type='submit' value='Home'></form></body></html>");
        } catch (SQLException e) {
            pw.println(e);
        } catch (ClassNotFoundException e) {
            pw.println(e);
        }
    }
}
