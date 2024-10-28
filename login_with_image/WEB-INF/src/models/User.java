package models;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class User {
    private int user_id;
    private String name ;
    private String email;
    private String password;
    private String url;
    
    // methods ############

    public boolean signin() {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/database?user=root&password=xxxx");
            String query = "select * from users where email = ? and password = ?;";

            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, email);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();

            if(rs.next()){
                this.user_id = rs.getInt("user_id");
                this.name = rs.getString("name");
                this.url = rs.getString("url");
                return true;
            }

        }catch(SQLException|ClassNotFoundException e){
            e.printStackTrace();
        }
        return false;
    }

    public void signUp(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/savedp?user=root&password=1234");
            String query = "insert into users (name,email,password,url) value (?, ?, ?, ?);";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, password);
            ps.setString(4, url);

            ps.executeUpdate();
        }catch(SQLException|ClassNotFoundException e){
            e.printStackTrace();
        }
    }
    
    

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }


    public User(String name, String email, String password, String url) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.url = url;
    }



    public User(int user_id, String name, String email, String password, String url) {
        this.user_id = user_id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.url = url;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getUserId() {
        return user_id;
    }

    public void setUserId(int user_id) {
        this.user_id = user_id;
    }
    
}
