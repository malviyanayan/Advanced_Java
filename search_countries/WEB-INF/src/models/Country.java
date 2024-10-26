package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Country {
    private Integer countryId ;
    private String country;
    private String capital;


    public Country(Integer countryId, String country,String capital){
        this.countryId = countryId;
        this.country = country;
        this.capital = capital;
    }


    public static List<Country> getCountries(String inp){
        ArrayList<Country> countries = new ArrayList<>();

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/worlddbms?user=xxxx&password=xxxx"); // give your database name user and password and run your code

            String query = "select * from countries where country like '" + inp + "%'";
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                countries.add(new Country(rs.getInt("country_id"),rs.getString("country"),rs.getString("capital")));
            }

        }catch(SQLException|ClassNotFoundException e){
            e.printStackTrace();
        }

        return countries;
    }


    public Integer getCountryId() {
        return countryId;
    }


    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }


    public String getCountry() {
        return country;
    }


    public void setCountry(String country) {
        this.country = country;
    }


    public String getCapital() {
        return capital;
    }


    public void setCapital(String capital) {
        this.capital = capital;
    }

    
}
