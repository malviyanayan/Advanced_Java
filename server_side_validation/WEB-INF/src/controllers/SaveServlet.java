package controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Validator;

@WebServlet("/save.do")
public class SaveServlet extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String password = req.getParameter("password");

        System.out.println(Validator.isValidName(name));
        System.out.println(Validator.isValidEmail(email));
        System.out.println(Validator.isValidPassword(password));

        resp.sendRedirect("index.html");
    }
    
}
