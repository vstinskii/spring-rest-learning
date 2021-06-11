<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 10.06.2021
  Time: 14:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Index</title>
</head>
<body>
Spring REST
<br><br>
<a href="${pageContext.request.contextPath}/ships">Get starships</a>
<br><br>
<a href="${pageContext.request.contextPath}/ships/get-ship-by-id/1">Get starship by id</a>
</body>
</html>
