<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>El Prac - 2</title>
</head>
<body>
    <h1 style="text-align: center;">El prac - 2</h1>
    <h3 style="text-align: center;">EL - Expression Language</h3>

    <hr>
    <br>

    <p>################ EL implicit objects ################</p>
    
    <p>1. Page Scope: Refers to attributes available within a single JSP page and not shared with other pages.</p>

<p>2. Request Scope: Refers to attributes available during a single HTTP request, accessible across multiple JSPs as long as the request is forwarded.</p>

<p>3. Session Scope: Refers to attributes stored in a user's session, accessible across multiple requests and pages by the same user.</p>

<p>4. Application Scope: Refers to attributes stored in the application context, shared across all users and pages for the application's lifetime.</p>

<p>5. Parameters: Represents request parameters passed from the client, accessed by name to retrieve single values.</p>

<p>6. Parameter Values: Refers to request parameters with multiple values, accessed as an array by name.</p>

<p>7. Headers: Represents HTTP request headers, accessed by name to retrieve single values.</p>

<p>8. Header Values: Refers to HTTP headers with multiple values, accessed as an array by name.</p>

<p>9. Initial Parameters(context-param): Refers to application-level parameters configured in web.xml, accessible across the application.</p>

<p>10. Cookies: Refers to cookies sent by the client, accessible by name for each cookie.</p>

<p>11. Page Context: Provides access to various page attributes, JSP implicit objects, and other information specific to the current page.</p>


    <hr><hr><br><br>
    <p>################  Print EL implicit objects ################</p>

    <p>Page Scope: ${pageScope}</p>

    <p>Request Scope: ${requestScope}</p>
    
    <p>Session Scope: ${sessionScope}</p>
    
    <p>Application Scope: ${applicationScope}</p>
    
    <p>Parameters: ${param}</p>
    
    <p>Parameter Values: ${paramValues}</p>
    
    <p>Headers: ${header}</p>
    
    <p>Header Values: ${headerValues}</p>
    
    <p>Initial Parameters(context-param): ${initParam}</p>
    
    <p>Cookies: ${cookie}</p>
    
    <p>Page Context: ${pageContext}</p>


</body>
</html>