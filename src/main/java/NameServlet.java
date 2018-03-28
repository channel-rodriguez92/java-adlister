import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "NameServlet", urlPatterns = "/name")
public class NameServlet extends HttpServlet {
    // Show the name form
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/Name.jsp").forward(request, response);
    }
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        String name = request.getParameter("firstName");
//        if(name.equals("bob")){
//            response.sendRedirect("/LoggedIn.jsp?error=That+Name+is+not+valid" );
//        }else{
//            response.sendRedirect("/LoggedIn.jsp?firstName=" + name);
//        }        request.setAttribute("name",request.getParameter("firstName"));
//        request.getRequestDispatcher("/LoggedIn.jsp").forward(request, response);
//        response.sendRedirect("/LoggedIn.jsp?firstName=" + request.getParameter("firstName"));
//    }


}
