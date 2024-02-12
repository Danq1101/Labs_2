package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import service.impl.FileSearchServiceImpl;

import java.io.IOException;

@WebServlet(name = "FileSearch", urlPatterns = "http://localhost:8080/lab1_war_exploded/fileSearch")
public class FileSearchServlet extends HttpServlet {

    FileSearchServiceImpl fileSearch = new FileSearchServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("WordSearch.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int increment =  fileSearch.findWord(req.getParameter("wordAttribute"));
        String res = "Word '" + req.getParameter("wordAttribute") + "' increment is " + increment;
        req.setAttribute("res", res);
        req.getRequestDispatcher("show.jsp").forward(req, resp);
    }
}
