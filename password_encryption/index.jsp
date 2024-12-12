<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        *{
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }

        body{
            background-color: rgb(245, 245, 240);
            color: #0b0c1b;
        }
        
        div{
            margin: 50px auto;
            width: 300px;
            height: 100px;
            background-color: #fff;
            border: 1px solid rgb(134, 134, 134);
            border-radius: 12px;
            box-shadow: 0 0 8px #232424;
            display: flex;
            justify-content: space-evenly;
            align-items: center;
        }

        a{
            text-decoration: none;
            padding: 4px 8px;
            background-color: blue;
            border-radius: 6px;
            color: #fff;
            font-weight: 600;
            font-size: 1.1rem;
        }
        
    </style>
</head>
<body>
    <div>
        <a href="signup.do">SignUp</a>
        <a href="signin.do">SignIn</a>
    </div>
</body>
</html>