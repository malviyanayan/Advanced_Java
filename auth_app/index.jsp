<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    
    <title>:: ISRDC Welcome Page ::</title>

    <style>
        #main_body {
            /* border: 3px solid blue; */
        }

        #empty_box {
            width: 75%;
            height: 200px;
            border-radius: 12px;
            background-color: #eee;
            margin: 30px auto;
            text-align: center;
            padding-top: 50px;
            font-family: "comic sans ms";
            font-size: 24px;
            color: #444;
        }
    </style>
</head>
<body>

    <div id="main_container">
        <%@ include file="header.jsp" %>

        <div id="main_body">
            <div id="empty_box">
                No Content Planned So Far...
            </div>
        </div>

        
        <%@ include file="footer.jsp" %>
    </div>
</body>
</html>