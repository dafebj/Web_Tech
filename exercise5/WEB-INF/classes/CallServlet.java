import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class CallServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Your Time Travel Begins Now!</h1>");
        out.println("<p>Click <a href='session.html'>here</a> to continue.</p>");
        out.println("</body></html>");
    }
}
