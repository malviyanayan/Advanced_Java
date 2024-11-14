package models;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class User {
    private Integer user_id; 
    private String fullName;
    private String email; 
    private String userName; 
    private String password;
    private Date dob;


    //   Methods...

    public static ArrayList<User> getRecords(){
        ArrayList<User> users = new ArrayList<>();
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbms?user=root&password=****"); // give database location 
            String query = "select * from users;";
            PreparedStatement ps = con.prepareStatement(query);

            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                users.add(new User(rs.getInt("user_id"),rs.getString("name"),rs.getString("email"),rs.getString("username"),rs.getDate("dob")));
            }
        }catch(SQLException|ClassNotFoundException e){
            e.printStackTrace();
        }
        return users;
    }


    public void signUp(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/nayancoaching?user=root&password=1234");
            String query = "insert into users (username,name,email,password,dob) value (?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, userName);
            ps.setString(2,  fullName); 
            ps.setString(3, email);
            ps.setString(4, password);
            ps.setDate(5, dob);

            ps.executeUpdate();

        }catch(SQLException|ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    

    public User(Integer user_id, String fullName, String email, String userName, Date dob) {
        this.user_id = user_id;
        this.fullName = fullName;
        this.email = email;
        this.userName = userName;
        this.dob = dob;
    }


    public User(String fullName, String email, String userName, String password, Date dob) {
        this.fullName = fullName;
        this.email = email;
        this.userName = userName;
        this.password = password;
        this.dob = dob;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }


    
}
