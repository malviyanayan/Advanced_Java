package models;

import java.util.ArrayList;
import java.sql.*;

public class Product {
    // #################### Properties #####################################################
    private Integer productId;
    private String productName;
    private Integer price;
    private Float weight;
    private Integer quantity;
    private Integer sold;
    private String description;
    private String pic;
    // private Integer userId;
    private User user;
    
    // #################### Constructors #####################################################
    public Product() {
        
    }

    public Product(Integer productId, String productName, Integer price, Float weight, Integer quantity, Integer sold, String description, String pic, User user) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.weight = weight;
        this.quantity = quantity;
        this.sold = sold;
        this.description = description;
        this.pic = pic;
        this.user = user;
    }
    
    public Product(String productName, Integer price, Float weight, Integer quantity, String description, User user, String pic) {
        this.productName = productName;
        this.price = price;
        this.weight = weight;
        this.quantity = quantity;
        this.description = description;
        this.user = user;
        this.pic = pic;
    }
    
    // #################### Other Methods #####################################################
    public boolean saveProduct() {
        boolean flag = false;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/authdb?user=root&password=1234");

            String query = "insert into products (product_name,price,weight,quantity,description,user_id,pic) value (?,?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, productName);
            ps.setInt(2, price);
            ps.setFloat(3, weight);
            ps.setInt(4, quantity);
            ps.setString(5, description);
            ps.setInt(6, user.getUserId());
            ps.setString(7, pic);

            if(ps.executeUpdate()==1) 
                flag = true;

            con.close();
        } catch(SQLException|ClassNotFoundException e) {
            e.printStackTrace();
        }

        return flag;
    }
    
    public static ArrayList<Product> collectAllProducts(User user) {
        ArrayList<Product> products = new ArrayList<>();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/authdb?user=root&password=1234");

            String query = "select * from products where user_id=?";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, user.getUserId());

            ResultSet rs = ps.executeQuery();

            while(rs.next()) {
                int productId = rs.getInt("product_id");
                String productName = rs.getString("product_name");
                int price = rs.getInt("price");
                float weight = rs.getFloat("weight");
                int quantity = rs.getInt("quantity");
                int sold = rs.getInt("sold");
                String description = rs.getString("description");
                String pic = rs.getString("pic");                

                Product product = new Product(productId, productName, price, weight, quantity, sold, description, pic, user);

                products.add(product);
            }

            con.close();
        } catch(SQLException|ClassNotFoundException e) {
            e.printStackTrace();
        }

        return products;
    }


    // ##################### Getter-Setters #################################################
    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getPic() {
        return pic;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setSold(Integer sold) {
        this.sold = sold;
    }

    public Integer getSold() {
        return sold;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    } 

    public Float getWeight() {
        return weight;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getPrice() {
        return price;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }    

    public String getProductName() {
        return productName;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getProductId() {
        return productId;
    }
}
