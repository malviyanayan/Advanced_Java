<%@ page import="java.util.ArrayList,models.Product" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>:: ISRDC :: Products Page</title>
    
    <style>
        #main_body {
            display: flex;
            flex-wrap: wrap;
            justify-content: space-evenly;       
            padding: 30px;     
        }

        .product_box {
            width: 18%;
            display: inline-block;
            border: 1px solid #ccc;
            border-radius: 12px;
            padding: 12px;
            margin-left: 10px; 
            margin-right: 10px;
            box-shadow: 10px 10px 15px #ccc; 
            background-color: #f5f5d5;
            margin-bottom: 30px;
        
        }

        .record {            
            padding: 12px;
            border-top: 1px solid #ccc;
        }

        .product_name {
            font-weight: bold;
            font-size: 18px;
        }

        .product_img {
            border-radius: 5px;
            width: 95%;
        }

        .img_box {
            text-align: center;
        }

        #new_product_box {
            /* border: 1px solid red; */
            text-align: right;
            padding-right: 50px;
        }

        #new_product_box a {
            border: 1px solid #555;
            border-radius: 8px;
            padding: 7px 12px;
            text-decoration: none;
            background-color: #eee;
            color: #555;
        }
    </style>
</head>
<body>
    <div id="main_container">
        <%@ include file="header.jsp" %>

        <%@ include file="menu.jsp" %>

        <div id="new_product_box">
            <a href="add_product.do">Add New Product</a>
        </div>

        <div id="main_body">
            <% ArrayList<Product> products = (ArrayList)request.getAttribute("products"); %>
              
            <% if(products.size() != 0) { %>    
                <% for(Product product : products) { %>
                    <div class="product_box">
                        <div class="img_box">
                            <img src="<%= product.getPic() %>" class="product_img">
                        </div>
                        <div class="record">
                            <div class="product_name"><%= product.getProductName() %></div>
                            <div><span>Price:</span> <%= product.getPrice() %></div> 
                            <div><span>Quantity/Sold:</span> <%= product.getQuantity() %>/<%= product.getSold() %></div>
                        </div>                        
                    </div>
            <% }} else { %>
                <div id="empty">
                    No Records Found...
                </div>
            <% } %>
        </div>
        
        <%@ include file="footer.jsp" %>
    </div>
</body>
</html>