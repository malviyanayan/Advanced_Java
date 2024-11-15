<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>Index Page</h1>
    
    <hr>

    <h1><c:out value="12" /></h1>
    <h1><c:out value="true" /></h1>
    <h1><c:out value="2.34" /></h1>
    <h1><c:out value="null" /></h1>
    <h1><c:out value="mohan" /></h1>
    <h1><c:out value="%$#@" /></h1>
</body>
</html>