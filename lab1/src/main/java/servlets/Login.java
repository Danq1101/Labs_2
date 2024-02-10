package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "text", urlPatterns = "/lab1/*")
public class Login extends HttpServlet
{
    protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
    {
    PrintWriter pw=res.getWriter();
    res.setContentType("text/html");
    String user=req.getParameter("userName");
    String pass=req.getParameter("userPassword");
    pw.println("Login Success...!");
    if(user.equals("edureka") && pass.equals("edureka"))
        pw.println("Login Success...!");
    else
        pw.println("Login Failed...!");
    pw.close();
    }
}