import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class URLRewriteServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String travelerName = request.getParameter("travelerName");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Hello, " + travelerName + "!</h1>");
        out.println("<a href='WelcomeServlet?travelerName=" + travelerName + "'>Proceed to Explore Time</a>");
        out.println("</body></html>");
    }
}
