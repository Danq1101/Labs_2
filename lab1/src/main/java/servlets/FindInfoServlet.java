package servlets;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

@WebServlet(name = "findInfo", urlPatterns = "/test")
public class FindInfoServlet extends HttpServlet {
}
