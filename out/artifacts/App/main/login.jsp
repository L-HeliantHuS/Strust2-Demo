<%--
  Created by IntelliJ IDEA.
  User: HeliantHuS
  Date: 11/30/2019
  Time: 4:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Login</title>
  </head>
  <body>
  <form action="checkLogin.action" method="post">
    <label for="username">
      Username: <input id="username" type="text" name="username">
    </label>
    <br>
    <label for="password">
      Password: <input type="password" id="password" name="password">
    </label>
    <br>
    <label for="submit">
      <input type="submit" value="提交!" id="submit">
    </label>
  </form>

  Not Account? <a href="register.action">Register</a>

  </body>
</html>
