<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>:: ISRDC :: Dashboard</title>

    <style>
        #main_body {
            text-align: center;
            padding-top: 50px;
        }

        .thumbnails {
            border: 1px solid #ccc;
            padding: 20px;
            padding-bottom: 5px;
            border-radius: 7px;
            display: inline-block;
            width: 220px;
            margin-right: 70px;
            background-color: rgb(241, 241, 207);
            color: rgb(86, 10, 10);
        }   
    </style>
</head>
<body>
    <div id="main_container">
        <%@ include file="header.jsp" %>

        <%@ include file="menu.jsp" %>

        <div id="main_body">
            <a href="products.do">
                <div id="products" class="thumbnails">
                    <img src="static/media/images/products.png" height="200">
                    <h2>Products</h2>
                </div>
            </a>
            
            <a href="orders.do">
                <div id="orders" class="thumbnails">
                    <img src="static/media/images/orders.png" height="200">
                    <h2>Orders</h2>
                </div>
            </a>
        </div>

        
        <%@ include file="footer.jsp" %>
    </div>
</body>
</html>