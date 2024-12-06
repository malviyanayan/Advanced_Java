<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>:: ISRDC :: Signup Success</title>

    <style>
        #main_container {
            /* border: 4px solid red; */
        }

        #message {
            padding: 100px 0px;
            background-color: rgb(223, 244, 223);
            border: 1px solid green;
            width: 50%;
            margin: 50px auto;
            text-align: center;
            border-radius: 12px;
            color: green;
            font-size: 1.2em;
        }
    </style>
</head>
<body>
    <div id="main_container">
        <%@ include file="header.jsp" %>
        

        <div id="main_body">
            <div id="message">Congratulations! Your Account is created successfully....</div>
        </div>

        
        <%@ include file="footer.jsp" %>
    </div>
</body>
</html>