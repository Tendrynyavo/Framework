import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

// Extend HttpServlet class
public class FrontServlet extends HttpServlet {

    public void processRequest(HttpServletRequest request, HttpServletResponse response)
        throws IOException, ServletException {
        PrintWriter out = response.getWriter();
        out.println(request.getQueryString());
        // out.println(request.getHttpServletMapping().getMatchValue());
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
        throws IOException, ServletException {
        processRequest(request, response);
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response)
        throws IOException, ServletException {
        processRequest(request, response);
    }

}