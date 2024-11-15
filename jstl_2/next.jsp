<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>Next Page</h1>
    
    <hr>

    <h2>${aaa}</h2>

    <h1><c:out value="${aaa}" /></h1>
    
    <h1><c:out value='<%= session.getAttribute("aaa") %>' /></h1>
</body>
</html>