<%--
  Created by IntelliJ IDEA.
  User: h
  Date: 2017/11/13
  Time: 11:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html;charsest=UTF-8"/>
    <title>论坛登录</title>
</head>
<body>
<c:if test="${!empty error}">
    <font color="red"><c:out value="${error}"/></font>
</c:if>

<form action="<c:url value="/loginCheck.html"/>" method="post">
    用户名：<input type="text" name="userName"><br/>
    密 码：<input type="password" name="password"><br/>
    <input type="submit" value="登录" />
    <input type="reset" value="重置"/>
</form>
</body>
</html>
