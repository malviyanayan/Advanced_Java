<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        #hero{
            width: 100%;
            height: max-content;
            background-color: antiquewhite;
        }

        .box > div{
            height: 60px;
            background-color: green;
            color: #fff;
            font-size: 22px;
            font-weight: 500;
        }
    </style>
</head>
<body>
    <h1>Next Page</h1>
    <hr>

    <div id="hero">
        <div class="box">
            <p>Physics : </p>
            <div style="width: ${param.ph}%;">${param.ph} %</div>
        </div>
        <div class="box">
            <p>Chemestry : </p>
            <div style="width: ${param.cm}%;">${param.cm} %</div>
        </div>
        <div class="box">
            <p>Methematics : </p>
            <div style="width: ${param.mt}%;">${param.mt} %</div>
        </div>
    </div>


</body>
</html>