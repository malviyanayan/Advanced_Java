package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.jasypt.util.password.StrongPasswordEncryptor;

public class User{
    // Properties....
    private String name;
    private String email;
    private String password;
    private Integer userId;

    static StrongPasswordEncryptor spe = new StrongPasswordEncryptor();



    // Member Methods
    public boolean signUp(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/passencryt?user=root&password=    ");
            String query = "insert into users (name, email, password) value (?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, spe.encryptPassword(password));

            if(ps.executeUpdate() != 0)return true;
        }catch(SQLException|ClassNotFoundException e){
            e.printStackTrace();
        }
        return false;
    }

    public boolean signIn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/passencryt?user=root&password=    ");
            String query = "select password,name,id from users where email = ?;";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, email);
            
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                String encryptPass = rs.getString("password");
                if (spe.checkPassword(password, encryptPass)) {
                    name = rs.getString("name");
                    userId = rs.getInt("id");
                    return true;
                }
            }
        }catch(SQLException|ClassNotFoundException e){
            e.printStackTrace();
        }
        return false;
    }

    // Constructors
    public User(String email,String password){
        this.email = email ;
        this.password = password;
    }

    public User(String name,String email,String password){
        this(email,password);
        this.name = name;
    }

    public User(Integer userId,String name ,String email,String password){
        this(name, email, password);
        this.userId = userId;
    }

    // Default constructor
    public User(){

    }

    // Getters and setters here
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

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


    
}