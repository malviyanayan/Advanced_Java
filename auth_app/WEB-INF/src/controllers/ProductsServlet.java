package controllers;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

import java.io.*;
import java.util.ArrayList;

import models.Product;
import models.User;

@WebServlet("/products.do")
public class ProductsServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        HttpSession session = request.getSession();
        User user = (User)session.getAttribute("user");

        String nextPage = "signin.do";

        if(user!=null) {
            // collect all products ...
            ArrayList<Product> products = Product.collectAllProducts(user);
            request.setAttribute("products", products);
            nextPage = "products.jsp";
        }
        
        request.getRequestDispatcher(nextPage).forward(request, response);
    }
}