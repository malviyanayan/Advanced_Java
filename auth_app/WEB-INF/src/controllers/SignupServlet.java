package controllers;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.*;
import javax.servlet.annotation.WebServlet;

import models.User;

@WebServlet("/signup.do")
public class SignupServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.getRequestDispatcher("signup.jsp").forward(request, response);
    }
    
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String fullName = request.getParameter("full_name");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        String nextPage = "signup.jsp";

        User user = new User(fullName, email, password);
        if(user.signupUser()) {
            String uploadPath = getServletContext().getRealPath("/WEB-INF/uploads");
            File file = new File(uploadPath, email);
            file.mkdir();

            nextPage = "signup_success.jsp";
        }

        response.sendRedirect(nextPage);
    }
}