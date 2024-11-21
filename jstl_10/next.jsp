<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Next Page</title>
</head>
<body>
    <h1>Next Page</h1>
    <hr>
    
    <select>
        <c:forEach var="next" items="${set}">
            <option>${next}</option>
        </c:forEach>
    </select>
</body>
</html>