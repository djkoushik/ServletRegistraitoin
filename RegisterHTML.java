import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet(urlPatterns = "/REGISTER")
public class RegisterHTML extends GenericServlet
{
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String nam = servletRequest.getParameter("n");
        String mn = servletRequest.getParameter("mn");
        String email = servletRequest.getParameter("eid");
        String gen = servletRequest.getParameter("g");
        PrintWriter pw= servletResponse.getWriter();
        String[] s1 = servletRequest.getParameterValues("c");
        String temp = "";
        for (int i=0; i<s1.length;i++)
            temp = temp+s1[i];
        pw.println(servletRequest.getParameter("co"));
        jdbc(pw,nam,mn,email,gen,temp);
    }
    public void jdbc(PrintWriter ww,String n,String mn, String em, String gen, String temp)  {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=09080706@As");
            PreparedStatement p=conn.prepareStatement("insert into d.admin value(?,?,?,?,?)");
            p.setString(1,n);
            p.setString(2,mn);
            p.setString(3,em);
            p.setString(4,gen);
            p.setString(5,temp);
//            ResultSet rs =
            p.executeUpdate();
            ww.println("<html><body><form action='HOME'><input type='submit' value='Home'></form></body></html>");
        }
        catch (SQLException e) {
            ww.println(e);
        }
        catch (ClassNotFoundException e) {
            ww.println(e);
        }
    }
}
