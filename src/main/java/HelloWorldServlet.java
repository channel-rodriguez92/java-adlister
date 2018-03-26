import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;


@WebServlet(name = "HelloWorldServlet", urlPatterns = "/hello")
public class HelloWorldServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("text/html");

        try {

            PrintWriter out = response.getWriter();

            if(request.getParameter("name") ==null || request.getParameter("name").length() < 1 ){
                out.println("<h1>Hello, World!</h1>");
            }else {
                out.println("<h1>Hello " + request.getParameter("name") + "</h1>");
            }


        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
