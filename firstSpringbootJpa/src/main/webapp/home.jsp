<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="addAlien" , commandName="alien" , method="post">
		<h1>welcome Alien</h1>
		Alien id : <input type="text" name="aid" required="required"></br>
		</br> Alien password : <input type="text" name="apass" required="required"></br>
		</br> <input type="submit">add</br>
		<td><a type="button" class="btn btn-success"
			href="/update-todo?id=${todo.id}">Update</a></td>
		<td><a type="button" class="btn btn-warning"
			href="/delete-todo?id=${todo.id}">Delete</a></td>
	</form>
</body>
</html>