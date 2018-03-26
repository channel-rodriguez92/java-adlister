import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

@WebServlet(name = "CounterServlet", urlPatterns = "/count")
public class CounterServlet extends HttpServlet {

    private int counterHolder = 1;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("text/html");

        try {

            PrintWriter out = response.getWriter();
            out.println("<h1>Times viewed: "+counterHolder+"</h1>");
            counterHolder++ ;

        }catch (Exception e){
            System.out.println(e.getMessage());
        }


    }
}




