import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HiddenFormServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String travelerName = request.getParameter("travelerName");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<form action='ProcessHiddenForm' method='post'>");
        out.println("<h1>Welcome, " + travelerName + "!</h1>");
        out.println("<input type='hidden' name='travelerName' value='" + travelerName + "'>");
        out.println("<button type='submit'>Proceed</button>");
        out.println("</form>");
        out.println("</body></html>");
    }
}
