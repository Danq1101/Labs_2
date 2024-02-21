package com.example.servlets;

import com.example.service.impl.ChangeStyleImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "changeStyle", urlPatterns = "/changeStyle/*")
public class ChangeStyleServlet extends HttpServlet {

    private final ChangeStyleImpl changeStyleService = new ChangeStyleImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("changeStyle.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String res = changeStyleService.changeStyle(Integer.parseInt(req.getParameter("textAmount")));
        req.setAttribute("fontSize", req.getParameter("textSize"));
        req.setAttribute("res", res);
        req.getRequestDispatcher("changeStyle.jsp").forward(req, resp);
    }
}
