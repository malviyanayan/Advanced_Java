<%@ page import="java.util.HashSet" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Index Jsp</title>
</head>
<body>
    <h1>Index Page</h1>   
    <hr>

    <% 
        HashSet<String> set = new HashSet<>();
        set.add("Nayan Soni");
        set.add("Anshul Namdeo");
        set.add("Nayan Malviya");
        set.add("Anuj Vishwakarma");
        session.setAttribute("set",set);
    %>

    <a href="next.jsp">Next Page</a>
</body>
</html>