import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "guesserServlet", urlPatterns = "/guess")
public class guesserServlet extends HttpServlet {
    public int counter = 0;
    public String magicNum = "5";
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if(req.getParameter("reset")!=null || req.getParameter("incorrect")==null){
            counter =0;
        }
//        System.out.println(req.getRequestURI());
//        System.out.println(req.getRequestURL());
        req.setAttribute("count",counter);
        req.getRequestDispatcher("/guesser.jsp").forward(req,resp);
    }
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        counter++;
        if(req.getParameter("userGuess").equals(magicNum)){
            resp.sendRedirect("/correctGuess.jsp?count=" + counter+"&magicNum=" + magicNum);
        }else{
            resp.sendRedirect("/guess?incorrect=" + true);
        }
    }
}
