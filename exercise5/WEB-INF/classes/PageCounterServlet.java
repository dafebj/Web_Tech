import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class PageCounterServlet extends HttpServlet {
    private int visitCount = 0;

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        visitCount++;
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Time Traveler's Portal</h1>");
        out.println("<p>Number of visits: " + visitCount + "</p>");
        out.println("</body></html>");
    }
}
