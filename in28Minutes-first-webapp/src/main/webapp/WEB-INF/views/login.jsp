
<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>
<div class="container">
	<p1> <font color="blue">this is Post method response</font></p1>
	<br>
	<p2 id="display"> <font color="red">welcome successfully</font></p2>
	<br> name is ${name} AND password is ${password}</br> if you want to
	check you toDos then click here <a href="/to_list"><i><b>to
				dos are</b></i></a><br> 
				<input id="btn" type="button" value="clear" onClick="myFunct()">
				<script type="text/javascript">
				function myFunct(){
					var user;
					user = prompt("Enter Username","Manish");
					alert('alert opernt');
					/* document.write("Trying javascript"); */
					document.getElementById("display").innerHTML="hello" +" " +user+" " +"!";
				}</script>




</div>
<%@ include file="common/footer.jspf"%>