import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class TimeServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String year = request.getParameter("year");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Welcome to the Year " + year + "</h1>");
        if (Integer.parseInt(year) < 2024) {
            out.println("<p>You are in the past!</p>");
        } else {
            out.println("<p>Welcome to the future!</p>");
        }
        out.println("<a href='timeForm.html'>Travel Again</a>");
        out.println("</body></html>");
    }
}
