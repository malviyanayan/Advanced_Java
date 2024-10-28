package controllers;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import models.User;

@WebServlet("/signin.do")
public class SignInServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("signin.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email = req.getParameter("email");
        String password = req.getParameter("password");

        System.out.println("##############  : " + email + " - " + password);
        User user = new User(email, password);
        String nextPage = "index.jsp";
        if(user.signin()){
            HttpSession session = req.getSession();
            session.setAttribute("user", user);
            System.out.println("##############  : " + "Sign Up successfully .... Good");
            nextPage = "signupsuccess.jsp";
        }

        resp.sendRedirect(nextPage);
    }
}
