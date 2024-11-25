import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HttpSessionServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        HttpSession session = request.getSession();
        String travelerName = request.getParameter("travelerName");
        session.setAttribute("travelerName", travelerName);

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Welcome, " + travelerName + "!</h1>");
        out.println("<a href='ExploreTime'>Explore Time</a>");
        out.println("</body></html>");
    }
}
