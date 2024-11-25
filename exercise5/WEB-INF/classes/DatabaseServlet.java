import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class DatabaseServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");

        String url = "jdbc:mysql://localhost:3306/TimeTravelersPortal";
        String user = "root";
        String password = "password";

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, user, password);
            String query = "INSERT INTO travelers (name, email) VALUES (?, ?)";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, name);
            stmt.setString(2, email);
            stmt.executeUpdate();

            out.println("<html><body>");
            out.println("<h1>Traveler Registered Successfully!</h1>");
            out.println("</body></html>");

            conn.close();
        } catch (Exception e) {
            out.println("<html><body>");
            out.println("<h1>Error: " + e.getMessage() + "</h1>");
            out.println("</body></html>");
        }
    }
}
