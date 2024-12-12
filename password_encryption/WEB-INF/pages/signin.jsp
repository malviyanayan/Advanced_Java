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
            background-color: rgb(230, 230, 203);
            color: #0b0c1b;
        }

        form{
            width: 50%;
            height: max-content;
            background-color: #fff;
            padding: 10px;
            margin: 50px auto;
            display: flex;
            flex-direction: column;
            justify-content: center;
            align-items: center;
            border-radius: 12px;
            box-shadow: 0 0 12px #37383c;
        }

        form>h1{
            margin: 10px;
            margin-bottom: 20px;
        }

        form > div{
            width: 100%;
            display: flex;
            gap: 10px;
            margin: 8px;
            align-items: center;
        }
         
        form > div  label{
            width: 18%;
            font-size: 20px;
            font-weight: 500;
        }

        form input{
            width: 400px;
            font-size: 16px;
            padding: 8px;
            color: #37383c;
            outline: none   ;
        }

        #btn{
            width: max-content;
            padding: 5px 10px;
            margin-top: 10px;
            background-color: blue;
            color: #fff;
            border: none;
            font-size: 1.2rem;
            font-weight: 600;
            border-radius: 6px;
            margin-bottom: 20px;
        }

        #btn:hover{
            background-color: rgb(49, 49, 158);
        }

        .err_msg{
            position: relative;
            right: 90px;
            margin-bottom: 12px;
            color: rgb(212, 37, 6);
        }
    </style>
</head>
<body>
    <form action="signin.do" method="post">
        <h1>Sign In</h1>
        <div>
            <label for="email">Email : </label>
            <input type="text" name="email" id="email" placeholder="Enter Email...">
        </div>
        <!-- <small class="err_msg">Email Already Exist...!!</small> -->
        <div>
            <label for="password">Password : </label>
            <input type="password" id="password" name="password" placeholder="Password...">
        </div>
        <!-- <small class="err_msg">Email Already Exist...!!</small> -->
        <input type="submit" id="btn" value="Sign In">
    </form>
</body>
</html>