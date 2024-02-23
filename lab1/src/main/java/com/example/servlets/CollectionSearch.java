package com.example.servlets;

import com.example.service.impl.CollectionSearchImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "collectionSearch", urlPatterns = "/collectionSearch")
public class CollectionSearch extends HttpServlet {

    CollectionSearchImpl collectionSearch = new CollectionSearchImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("collectionSearch.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String res;
        String findInfo = (req.getParameter("findInfo"));
        String isChange = req.getParameter("ifChange");
        if (findInfo.isEmpty()) {
            req.setAttribute("res", "Error: empty 'input key' field");
            req.getRequestDispatcher("collectionSearch.jsp").forward(req, resp);
        }
        else {
            if (isChange == null) {
                String infoVal = collectionSearch.findInfoByKey(Integer.valueOf(findInfo));
                if (infoVal == null) {
                    res = "No such key: " + findInfo;
                }
                else {
                    res = findInfo + " value is " + infoVal;
                }
                req.setAttribute("res", res);
                req.getRequestDispatcher("collectionSearch.jsp").forward(req, resp);
            }
            else {
                String newValueInfo = req.getParameter("changeText");
                if (newValueInfo.isEmpty()) {
                    req.setAttribute("res", "Error: empty 'change' field");
                    req.getRequestDispatcher("collectionSearch.jsp").forward(req, resp);
                }
                else {
                    String prevInfoVal = collectionSearch.findInfoByKey(Integer.valueOf(findInfo));
                    if (prevInfoVal == null) {
                        res = "No such key: " + findInfo;
                    }
                    else {
                        collectionSearch.changeInfo(Integer.valueOf(findInfo), newValueInfo);
                        res = "Info from key '" + findInfo + "' changed from " + prevInfoVal + " to " + newValueInfo;
                    }
                    req.setAttribute("res", res);
                    req.getRequestDispatcher("collectionSearch.jsp").forward(req, resp);
                }
            }
        }
    }
}