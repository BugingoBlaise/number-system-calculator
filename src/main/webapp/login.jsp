<%--
  Created by IntelliJ IDEA.
  User: blais
  Date: 9/25/2023
  Time: 11:48 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home-AUCA</title>
</head>
<body>
<form method="post" action="loginServlet">

    <label>
        <input type="text" name="username" placeholder="Enter username"><br>
    </label>
    <label>
        <input type="password" name="password" placeholder="Enter password"><br>
    </label>
    <input type="submit" name="submit" value="Login">
    <div>
        <ul>
            <li style="color: red">${message}</li>
        </ul>
    </div>
</form>
</body>
</html>
