package com.example.servlets;

import com.example.service.impl.FileSearchImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "fileSearch", urlPatterns = "/index")
public class FileSearchServlet extends HttpServlet {

    FileSearchImpl fileSearch = new FileSearchImpl();

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException{
        int increment = fileSearch.findWord(request.getParameter("wordAttribute"));
        String res = "'Word " + request.getParameter("wordAttribute") + "' increment is " + increment;
        request.setAttribute("res", res);
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

}
