package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class User {
    // ######## Properties ###########
    private Integer userId;
    private String name;
    private String email;
    private String password;


    // ######### Methods #########
    public boolean signUp(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/temp?user=root&password=1234");
            String query = "insert into users (name,email,password) value (?, ?, ?);";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, password);

            if(ps.executeUpdate()!=0)return true;
        }catch(SQLException|ClassNotFoundException e){
            e.printStackTrace();
        }
        return false;
    }


    // ######### Constructors #########
    public User(){

    }

    public User(Integer userId,String name,String email){
        this.userId = userId;
        this.name = name;
        this.email = email;
    }

    public User(String name, String email , String password){
        this.name = name;
        this.email = email;
        this.password = password;
    }



    // ##### Getters and Setters ########
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }


    
}
