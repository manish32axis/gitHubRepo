
<%@ include  file="common/header.jspf" %>
	<%@ include file="common/navigation.jspf"%>
	<div class="container">
		<b>my name is ${name} </br> my to do list are ::::::
		</b></br>
		<table class="table table-striped">
			<caption>
				<em><b>my todo list</b></em>
			</caption>
			<thead>

				<tr>
					<th>Id</th>
					<th>UserName</th>
					<th>Description</th>
					<th>TargetDate</th>
					<th>Is Completed</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${todo}" var="to">

					<tr>
						<td>${to.id}</td>
						<td>${to.user}</td>
						<td>${to.desc}</td>
						<td><fmt:formatDate pattern="dd/MM/yyyy"
								value="${to.targetDate}" /></td>
						<!--fmt tag is used for a particular date format  -->
						<td>${to.done}</td>
						<td><a class="btn btn-success"
							href="/update-todo?id=${to.id}">Update</a> <a
							class="btn btn-danger" href="/delete-todo?id=${to.id}">Delete</a></td>
					</tr>
				</c:forEach>


			</tbody>
		</table>


		<div>
			<a class="btn btn-success" href="/add-todo">Add</a>
		</div>
	</div>
<%@ include file="common/footer.jspf"%>