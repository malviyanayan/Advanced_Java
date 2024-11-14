<!-- This is practice application where user can comment on any post
    but any user write sum millissious script so that script can run 
    on browser and this can be generate problems in client machine 


    in its next application (milicious_script_1.jsp) we can overcome this problem
-->


<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Message Page</title>

    <style>
        body{
            overflow-y: hidden;
        }

        #hero{
            width: 60%;
            height: max-content;
            padding: 20px;
            margin: 10px auto;
            border: 1px solid brown;
        }

        form{
            margin-left: 20px;
            font-size: 20px;
        }

    </style>
</head>

<body>

    <div id="hero">
        <div id="post">
            <h2>Amhitabh bacchan : </h2>
            Lorem ipsum dolor, sit amet consectetur adipisicing elit. Dolor provident cum ad nulla quae illum molestias
            officiis eaque rerum repellendus vero sunt maxime, quam molestiae eos ea amet asperiores nemo voluptatem quas
            est mollitia debitis adipisci accusantium? Molestias, nulla magni?Lorem ipsum dolor sit amet, consectetur
            adipisicing elit. Quis maiores molestiae optio exercitationem vero error ab doloribus blanditiis, tempore
            corrupti?
        </div>
        <hr>
        <form action="save.do">
            <span>Name : </span><br>
            <input type="text" name="name" placeholder="Enter Name ... ">
            <br>
            <span>Enter Message : </span><br>
            <textarea name="message" id="txt" rows="5" cols="75"></textarea>
            <br><br>
            <input type="submit">
        </form>
        <br><br>
        <a href="chack.do">chack massages</a>
    </div>
</body>

</html>