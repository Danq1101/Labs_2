package servlets;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

@WebServlet(name = "output", urlPatterns = "test")
public class OutputServlet extends HttpServlet {
}
