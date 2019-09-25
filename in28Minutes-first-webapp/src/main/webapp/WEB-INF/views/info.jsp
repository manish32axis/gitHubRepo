<%@ include file="common/header.jspf" %>
<nav class="navbar navbar-default" ></nav>
<div class="container">
This is get method response 
<form action = "/mvc" method = "post">
<p><font color = "red">${errorMessage}</font></p>
Enter your name <input type = "text" name = "name"/>
password <input type = "password" name = "password"/>
<input class="btn btn-success" type="submit" value="login"><br>
<input type="submit" value = "clear" id="submit">
</form>
<%@ include file="common/footer.jspf"%>