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

@WebServlet(urlPatterns = "/UPDATENAME")
public class ModifyName extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String modify_element = servletRequest.getParameter("updated");
        String base_element = servletRequest.getParameter("old");
        PrintWriter pw = servletResponse.getWriter();
        jdbc(modify_element,base_element, pw);
    }
    public void jdbc(String n,String mn, PrintWriter pw)
    {
        String query = "update d.admin set Name=?  where Mobile=?";
        try{

            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306?user=root&password=09080706@As";
            Connection conn= DriverManager.getConnection(url);
            PreparedStatement p=conn.prepareStatement(query);
            p.setString(1,n);
            p.setString(2,mn);
            p.executeUpdate();
            pw.println("<html><body><form action='HOME'><input type='submit' value='Home'></form></body></html>");
        }
        catch (ClassNotFoundException e1) {
            System.out.println(e1);
        }
        catch (SQLException e1) {
            System.out.print(e1);
        }
    }
}

