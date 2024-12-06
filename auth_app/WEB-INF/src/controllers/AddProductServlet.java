package controllers;

import javax.servlet.http.*;

import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;

import javax.servlet.*;
import javax.servlet.annotation.*;
import java.io.*;
import java.util.List;

import models.User;
import models.Product;

@WebServlet("/add_product.do")
public class AddProductServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        HttpSession session = request.getSession();

        User user = (User)session.getAttribute("user");

        String nextPage = "signin.jsp";

        if(user!=null) {
            nextPage = "add_product.jsp";
        }
        request.getRequestDispatcher(nextPage).forward(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        HttpSession session = request.getSession();

        User user = (User)session.getAttribute("user");

        String nextPage = "signin.do";

        if(user!=null) {
            String productName = null;
            Integer price = null;
            Float weight = null;
            Integer quantity = null;
            String description = null;
            String pic = null;

            //--------------------------------
            try {
                List<FileItem> fileItems = new ServletFileUpload(new DiskFileItemFactory()).parseRequest(request);
            
                String uploadPath = getServletContext().getRealPath("/WEB-INF/uploads/"+user.getEmail());
                        
                for(FileItem fileItem : fileItems) {
                    if(fileItem.isFormField()) {
                        String paramName = fileItem.getFieldName();
                        String paramValue = fileItem.getString();

                        switch(paramName) {
                            case "product_name":
                                productName = paramValue;
                                break;
                            case "price":
                                price = Integer.parseInt(paramValue);
                                break;
                            case "weight":
                                weight = Float.parseFloat(paramValue);
                                break;
                            case "quantity":
                                quantity = Integer.parseInt(paramValue);
                                break;
                            case "description":
                                description = paramValue;                                
                        }
                    } else {
                        pic = fileItem.getName();
                        File file = new File(uploadPath, pic);
                        try {  fileItem.write(file); } catch (Exception e) {e.printStackTrace();}
                    }
                }
            } catch(FileUploadException e) {
                e.printStackTrace();
            }
            
            //--------------------------------
            Product product = new Product(productName, price, weight, quantity, description, user, user.getEmail()+"/"+pic);
            product.saveProduct();

            nextPage = "products.do";
        }
        
        response.sendRedirect(nextPage);
    }
}
