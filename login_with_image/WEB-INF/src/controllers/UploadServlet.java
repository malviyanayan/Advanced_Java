package controllers;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.fileupload.servlet.ServletFileUpload;

import models.User;

import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;

@WebServlet("/upload.do")
public class UploadServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        if(ServletFileUpload.isMultipartContent(request)){
            DiskFileItemFactory dfif = new DiskFileItemFactory();
            ServletFileUpload sfu = new ServletFileUpload(dfif);
            String name = "";
            String email = "";
            String password = "";
            String url = "static/loginphotos/";

            try{
                List<FileItem> fileitems = sfu.parseRequest(request);
                
                Iterator<FileItem> iterator = fileitems.iterator();


                String uploadPath = getServletContext().getRealPath("/static/loginphotos");
                while(iterator.hasNext()){
                    FileItem item = iterator.next();

                    if(item.isFormField()){
                        switch (item.getFieldName()) {
                            case "name":
                                name = item.getString();
                                break;
                            case "email":
                                email = item.getString();
                                break;
                            case "password":
                                password = item.getString();
                                break;
                        
                            default:
                                System.out.println("unexpected Form Field.." + item.getFieldName());
                                break;
                        }
                    }else{
                        // handle File upload ...
                        String clientFileName = item.getName();
                        File file = new File(uploadPath, clientFileName);

                        item.write(file);
                        url = url +  clientFileName;
                    }
                }
            }catch(FileUploadException e){
                e.printStackTrace();
            }catch(Exception e){
                e.printStackTrace();
            }

            // System.out.println("##################### : "+name + " - " + email  + " - " + password + " - " + url);
            User user = new User(name, email, password, url);
            user.signUp();

            response.sendRedirect("index.jsp");

        }
 
    }
}