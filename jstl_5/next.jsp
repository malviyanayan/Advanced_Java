<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Next Page</title>
</head>
<body>
    <h1>This is Next Page</h1>
    <hr>

    <%-- <c:out value="${aaa}" /> --%>

    <c:if test="${param.ans == 'yes'}">
        <img width="200" src="yes.jpg" >
    </c:if>
    <c:if test="${param.ans == 'no'}">
        <img width="200" src="no.jpg" >
    </c:if>


</body>
</html>