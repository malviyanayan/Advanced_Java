<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>JSTL - prac</title>

</head>
<body>
    <h1>index Page</h1>
    <% session.setAttribute("aaa",677); %>
    <hr>
    <form action="next.jsp">
        <p>Are You Crazy : <input type="radio" name="ans" value="yes">Yes  &nbsp;&nbsp;&nbsp; <input type="radio" value="no" name="ans">No</p>
        <input type="submit" value="Next Page">
    </form>

    
</body>
</html>