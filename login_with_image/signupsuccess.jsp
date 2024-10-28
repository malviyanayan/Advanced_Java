<%@ page import="models.User"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Index Page</title>
    <style>
        *{
            margin: 0;
            padding: 0;
            box-sizing: border-box;
            color: #fff;
        }
        body{
            background-color: #222222;
        }

        h1{
            text-align: center;
            margin: 10px;
        }

        #hero{
            background-color: #000000;
            margin: 40px 38%;
            width: max-content;
            height: max-content;
            font-size: 18px;
            border: 2px solid #666666;
            padding: 20px;
            box-shadow: 0 0 20px #666666;
            display: flex;
            flex-direction: column;
            align-items: center;
        }

        #hero h2{
            text-align: center;
            margin: 20px;
        }

        #hero img{
            display: block;
            box-shadow: 0 0 15px #874728;
            border: 2px solid black;
            margin-top: 20px;
            border-radius: 100px;
            /* padding: 20px; */
            /* filter: drop-shadow(0 0 30px); */
        }

        #hero span{
            margin-bottom: 10px;
        }
        

        
    </style>
</head>
<body>
    <h1>Your Profile</h1>
    <% User user = (User) session.getAttribute("user");%>
    <div id="hero">
        <h2><%= user.getName()%></h2>

        <span>Your Email : <%= user.getEmail()%></span>
        <span>Your user ID : <%= user.getUserId()%></span>
        <img src="<%= user.getUrl()%>" width="200">

    </div>

</body>
<!-- </html> -->