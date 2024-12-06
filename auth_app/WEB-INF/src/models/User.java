package models;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class User {
    // ############################ Properties ########################################
    private Integer userId;
    private String fullName;
    private String email;
    private String password;
    private String gender;
    private String city;
    private Date dob;
    private String address;
    
    // ############################# Constructors #######################################
    public User() {
        
    }     

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }
    
    public User(String fullName, String email, String password) {
        this(email, password);
        this.fullName = fullName;
        // this.email = email;
        // this.password = password;
    }
    
    // ############################## Other Mothods ######################################
    public boolean signinUser() {
        boolean flag = false;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/authdb?user=root&password=1234");
            
            String query = "select * from users where email=? and password=?";

            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, email);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();

            if(rs.next()) {
                userId = rs.getInt("user_id");
                fullName = rs.getString("full_name");
                gender = rs.getString("gender");
                dob = rs.getDate("dob");
                city = rs.getString("city");
                address = rs.getString("address");

                flag = true;
            }

            con.close();
        } catch(SQLException|ClassNotFoundException e) {
            e.printStackTrace();
        }

        return flag;
    }
    
    public boolean signupUser() {
        boolean flag = false;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/authdb?user=root&password=1234");

            String query = "insert into users (full_name,email,password) value (?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, fullName);
            ps.setString(2, email);
            ps.setString(3, password);

            int result = ps.executeUpdate();

            if(result == 1) {
                flag = true;
            }

            con.close();
        } catch(SQLException|ClassNotFoundException e) {
            e.printStackTrace();
        }

        return flag;
    }
    
    // ############################# Getter - Setters #######################################
    public void setAddress(String address) {
        this.address = address;
    }    

    public String getAddress() {
        return address;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    } 

    public Date getDob() {
        return dob;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }
    
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getUserId() {
        return userId;
    }
}
