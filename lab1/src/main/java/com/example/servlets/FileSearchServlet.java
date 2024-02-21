package com.example.servlets;

import com.example.service.impl.FileSearchImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "fileSearch", urlPatterns = "/fileSearch/*")
public class FileSearchServlet extends HttpServlet {

    FileSearchImpl fileSearch = new FileSearchImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        req.getRequestDispatcher("fileSearch.jsp").forward(req, res);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
        throws ServletException, IOException{
        int increment = fileSearch.findWord(req.getParameter("wordAttribute"));
        String res;
        if (increment != 0)
            res = "'Word " + req.getParameter("wordAttribute") + "' increment is " + increment;
        else
            res = "Your word have no matches";
        req.setAttribute("res", res);
        req.getRequestDispatcher("fileSearch.jsp").forward(req, resp);
    }

}
