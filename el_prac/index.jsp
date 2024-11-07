<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>El Practice</title>
</head>

<body>
    <h1 style="text-align: center;">This is Index Page</h1>
    <hr>
    <br>

    <!-- First El tag -->
    <!-- 
        The EL (Expression Language) tag in Java is part of JavaServer Pages (JSP), allowing developers to access and manipulate data within the JSP page. EL tags simplify the syntax required for data access by providing a concise way to embed expressions directly in the HTML, making it easier to work with JavaBeans, data from request, session, and application scopes, and to perform conditional operations within JSP.
     -->

    <h2>######--- El practice from start here ---######</h2>

    <!-- ham el ke ander constant likh sakte hai -->
    <p>${12}</p>
    <p>${90.90}</p>
    <p>${'a'}</p>
    <p>${"abbas"}</p>
    <p>${'kartik'}</p>

    <!-- yaha null print nhi hoga kyuki el null ko aur kai sare code ko khud se handle karta hai aur kuchh problem hone per print koi error bhi nhi deta aur kuchh print bhi nhi karta -->

    <p>${null}</p>
    <!-- ise bhi el library khud se handle ker legi jabki ye undefined hai (gopal) -->
     <p>${gopal}</p>
    <p>${true}</p>

    <hr>

    <!-- el kaise kaam karta hai -->
     <%-- This is el => ${} --%>
     <%-- This is scriptlet => <%  %> --%>
     <%-- This is also scriptlet => <%=  %> --%>

     <hr>

     <%-- ham scriptlet ke ander define kiye variables ko el(${}) ke ander access nhi kar sakte  --%>



     <!-- ye y naam ka variable jsp ki java file ke ander banega aur ham sirf ise scriptlet ke ander hi access ker sakte hai -->
    <% int y=23; %>
    
    <p><%= y %> #######</p>
    <p>${y} ******</p>

    <hr>


    <!-- el me ye kuchh cheeje kaam nhi karti hai (scriptlet comment ko open karo) -->

    <p>${232 + 1}</p>

    <p>${2.34 + 1}</p>
    
    <%--<p>${'j' + 1}</p>
    
    <p>${"mohan" + 1}</p>
    
    <p>${true + 1}</p>

    <p>${'kartik' + 1}</p>--%>

    <p>${null + 1}</p>

    <br><br><br><br>
</body>

</html>