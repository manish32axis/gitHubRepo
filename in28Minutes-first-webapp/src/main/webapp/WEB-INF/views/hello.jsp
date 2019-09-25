<%@ page language = "java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<title>HELLO JSP</title>
</head>
<body>This page is coming from hello user controler 
<form  action = "/spring-mvc/hello" method = "post">
<p><font color = "red">${errorMessage}</font></p>
Enter your name <input type = "text" name = "name"/>
password <input type = "password" name = "password"/>
<input type="submit" value = "login">
</form>
</body>
</html>