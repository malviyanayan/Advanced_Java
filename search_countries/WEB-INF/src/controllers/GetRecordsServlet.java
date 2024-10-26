package controllers;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import models.Country;

@WebServlet("/select.do")
public class GetRecordsServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String inp = req.getParameter("inp");
        
        List<Country> countries = Country.getCountries(inp);
        Gson gson = new Gson();
        String json = gson.toJson(countries);

        resp.getWriter().write(json);
    }
}