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

        form{
            background-color: #000000;
            margin: 40px 30%;
            width: max-content;
            height: max-content;
            font-size: 18px;
            border: 2px solid #666666;
            padding: 20px;
            box-shadow: 0 0 20px #666666;
        }

        form h2{
            text-align: center;
            margin: 20px;
        }

        form input{
            margin: 10px;
            font-size: 13px;
            color: black;
            padding: 3px;
        }

        
    </style>
</head>
<body>
    <h1>Upload Your Information Here</h1>
<!--  -->

    <form action="upload.do" method="post" enctype="multipart/form-data">
        <h2>Sign-Up</h2>
        Enter Name : <input type="text" name="name"><br>
        Enter Email : <input type="email" name="email"><br>
        Enter Password : <input type="password" name="password"><br>
        Enter Your Pic : <input type="file" name="pic">
        <br>
        <input type="submit" value="Upload"><br><br>

        <div id="login">If you have already an account please .. <a href="signin.do">Sign In</a></div>
    </form>

</body>
<!-- </html> -->