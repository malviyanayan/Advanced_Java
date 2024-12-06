<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>:: ISRDC :: ADD Product</title>
    <link rel="stylesheet" href="static/css/form.css">
</head>
<body>
    <div id="main_container">
        <%@ include file="header.jsp" %>

        <%@ include file="menu.jsp" %>

        <div id="main_body">
            <form action="add_product.do" method="post" id="form_box" enctype="multipart/form-data">
                <h2>New Product</h2>
                <div>
                    <label for="product_name">Product Name</label>
                    <input type="text" name="product_name" id="product_name">
                </div>
                <div>
                    <label for="price">Price</label>
                    <input type="number" name="price" id="price">
                </div>
                <div>
                    <label for="weight">Weight</label>
                    <input type="number" name="weight" id="weight">
                </div>
                <div>
                    <label for="quantity">Quantity</label>
                    <input type="number" name="quantity" id="quantity">
                </div>
                <div>
                    <label for="description">Description</label>
                    <textarea name="description" rows="7" cols="40" id="description"></textarea>
                </div>
                <div>
                    <label for="pic">Upload Pic</label>
                    <input type="file" name="pic" id="pic">
                </div>
                <div style="text-align: center;">
                    <input type="submit" value="Add Product" id="btn">
                </div>                
            </form>
        </div>

        <%@ include file="footer.jsp" %>
    </div>
</body>
</html>