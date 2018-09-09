<%@ taglib prefix="s" uri="/struts-tags" %>
<%@page language="java" contentType="text/html; UTF-8" pageEncoding="UTF-8" %><%--修改字符集--%>
<html>
<title>登陆界面</title>
<body>
    <form action="loginaction_login" method="post">
        用户名：<input type="text" name="username"><s:fielderror name="username"></s:fielderror>
        密码：<input type="password" name="password">
        书籍一：<input type="text" name="bookList[0]">
        书籍二：<input type="text" name="bookList[1]">
        年龄：<input type="text" name="age">
        <input type="submit" value="提交">
    </form>
</body>
</html>