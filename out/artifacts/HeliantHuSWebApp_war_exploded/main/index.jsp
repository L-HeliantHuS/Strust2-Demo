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
    <title>$Title$</title>
  </head>
  <body>
  <form action="checkLogin.action" method="post">
    <label for="username">
      Username: <input id="username" type="text" name="username">
    </label>

    <label for="password">
      <input type="password" id="password" name="password">
    </label>

    <input type="submit" value="提交!">
  </form>
  </body>
</html>
