<%--
  Created by IntelliJ IDEA.
  User: HeliantHuS
  Date: 12/1/2019
  Time: 2:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register</title>
</head>
<body>
<form action="checkRegister.action" method="post">
    <label for="username">
        Username: <input type="text" id="username" name="username">
    </label>

    <br>

    <label for="password">
        password: <input type="password" id="password" name="password">
    </label>

    <br>
    <label for="confirmPassword">
        confrim_password: <input type="password" id="confirmPassword" name="confirmPassword">
    </label>

    <br>

    <label for="submit">
        <input type="submit" id="submit" name="submit" value="提交！">
    </label>

</form>
</body>
</html>
