import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "LoggedServlet", urlPatterns = "/logged")
public class LoggedServlet extends HttpServlet {
    // Show the results page
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/LoggedIn.jsp").forward(request, response);
    }
    // Handle the post data sent from the name form
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("firstName");
        if (name.equals("bob")) {
            response.sendRedirect("/logged?error=That+Name+is+not+valid");
        } else {
            response.sendRedirect("/logged?firstName=" + name);
        }
    }
}