<%@ page import="java.util.ArrayList,models.User" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Messages</title>
    <style>
        th{
            padding: 5px;
        }
        table{
            margin: 0 auto;
        }

        h1{
            text-align: center  ;
        }
    </style>
</head>
<body>
    
    <% 
        ArrayList<User> users = (ArrayList<User>)request.getAttribute("users");
        int count = 1;
     %>

    <h1>User here with messages : </h1>
    <%-- <p><%= users %></p> --%>
    <table border="1" width="50%">
        <tr align="center">
            <th>S. No. </th>
            <th>UserName </th>
            <th>Message</th>
        </tr>

        <% for(User user : users){ %>
            <tr align="center">
                <td><%= count++ %></td>
                <td><%= user.getName()  %></td>
                <td><%= user.getMessage() %></td>
            </tr>
        <% } %>
    </table>

</body>
</html>