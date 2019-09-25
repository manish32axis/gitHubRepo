<%@ include file="common/header.jspf" %>
	<div class="container">
		<h1 id="display">Add a Todo</h1>
		<form:form method="post" commandName="todo">
			<!-- commandName is command object used for easy data binding and validation  -->
			<form:hidden path="user" />
			<fieldset class="form-group">
				<form:label path="id">UserId</form:label>
				<form:input path="id" type="number" class="form-control"
					required="required" min="1" max="10" />
			</fieldset>

			<!-- <fieldset class="form-group">
				<label>User</label> <input type="text" name="user"
					class="form-control" required="required">
			</fieldset> -->


			<fieldset class="form-group">
				<form:label path="desc">Description</form:label>
				<form:input path="desc" type="text" class="form-control"
					required="required" />
				<form:errors path="desc" cssClass="text-warning" />
			</fieldset>
			
			<fieldset class="form-group">
			<form:label path="targetDate">TargetDate</form:label>
			<form:input path="targetDate" type="text" class="form-control" required="required"/>
			<form:errors path="targetDate" cssClass="text-warning" />
			</fieldset>
			
			<input id="btn" type="button" value="Clear" onClick="myFunct()"/>
			<script type="text/javascript">
			function myFunct(){
				var message;
				var result=confirm("Do you want to clear data");
			}
			if(result==true){
				message="Data is cleared";
			}else{
				message="data is not cleared";
			}
			document.getElemetById("display").innerHTML=message;
			</script>

			<input class="btn btn-success" type="submit" value="submit" />

		</form:form>
	</div>
	<%@ include file="common/footer.jspf"%>