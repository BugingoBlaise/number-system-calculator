<%--
  Created by IntelliJ IDEA.
  User: blais
  Date: 9/25/2023
  Time: 10:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>AUCA REGISTRATION</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <form method="post" action="register">
        <div class="form-group mt-4">
            <label for="fullname">Fullname</label>
            <input type="text" class="form-control w-50" id="fullname" name="fullname" placeholder="Enter fullname">
            <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
        </div>
        <div class="form-group mt-2">
            <label for="email">Email</label>
            <input type="email" class="form-control w-60" id="email" name="email" placeholder="Enter Email">
        </div>
        <button type="submit" class="btn btn-primary mt-4">Submit</button>
    </form>
</div>
</body>
</html>