<%@ page import="java.util.ArrayList" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Index Page</title>
</head>
<body>
    <h1>Index page</h1>
    <hr>
    <% 
    ArrayList<String> cities = new ArrayList<>();
        cities.add("Chhindwara");    
        cities.add("Jabalpur");    
        cities.add("Narsinghpur");    
        cities.add("katni");    
        cities.add("burhanpur");    
        cities.add("dubai");
        
        session.setAttribute("cities",cities);
    %>

    <a href="next.jsp">Next Page</a>
</body>
</html>