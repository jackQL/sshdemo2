<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/12/12
  Time: 15:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>REG</title>
</head>
<body>

<form action="/user_doReg" method="post">
    name:<input type="text" name="username"><br>
    password:<input type="password" name="password"><br>
    address:<input type="text" name="address"><br>
    photo:<input type="file" name="photo">
    <input type="submit" value="reg"><input type="reset" value="reset">
</form>>
</body>
</html>
