import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class CookieSessionServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String travelerName = request.getParameter("travelerName");

        // Create a cookie
        Cookie travelerCookie = new Cookie("travelerName", travelerName);
        travelerCookie.setMaxAge(3600); // Set expiry time to 1 hour
        response.addCookie(travelerCookie);

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Welcome, " + travelerName + "!</h1>");
        out.println("<a href='RetrieveCookieServlet'>Retrieve Cookie Data</a>");
        out.println("</body></html>");
    }
}
