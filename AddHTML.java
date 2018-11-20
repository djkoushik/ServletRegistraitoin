import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/ADD")
public class AddHTML extends GenericServlet
{

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        PrintWriter pw = servletResponse.getWriter();
        pw.println("<html><body> " +
                "<form action='REGISTER'>" +
                "Name:<input type='text' name='n'> " +
                "MobileNumber: <input type='text' name='mn'>" +
                "EmailId: <input type='text' name='eid'>" +
                "Gender: " +
                "<input type='radio' name='g' value='Male'> Male" +
                "<input type='radio' name='g' value='Female'> Female" +
                "<input type='radio' name='g' value='Others'> Others" +
                "Courses Known:" +
                "<input type='checkbox' name='c' value='Java'>Java" +
                "<input type='checkbox' name='c' value='C++'>C++" +
                "<input type='checkbox' name='c' value='Python'> Python" +
                "<input type='checkbox' name='c' value='DataStructures'> DataStructures" +
                "<select name='co'>"+
                "<option>Pakisthan</option>"+
                "<option>Afghanisthan</option>"+
                "<option>Gopikisthan</option>"+
                "<option>Shivakisthan</option>"+
                "<option>Ravindhrakisthan</option>"+
                "<option>Koushikisthan</option>"+
                "<option>Priyaisthan</option>"+
                "<option>Mounikaisthan</option>"+
                "</select>"+
                "<input type='submit' value='save'>"+
                "</form>"+
                "</body></html>");
    }
}


