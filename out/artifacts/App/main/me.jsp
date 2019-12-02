<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: HeliantHuS
  Date: 12/1/2019
  Time: 2:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Me</title>
</head>
<body>
    <p>当前登录的用户名为: <s:property value="#session.username"/> </p>

    <br>

    <a href="Logout.action">Logout</a>
</body>
</html>
