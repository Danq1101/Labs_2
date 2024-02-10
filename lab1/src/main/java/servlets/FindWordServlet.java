package servlets;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

@WebServlet(name = "findWord", urlPatterns = "/test")
public class FindWordServlet extends HttpServlet {
}
