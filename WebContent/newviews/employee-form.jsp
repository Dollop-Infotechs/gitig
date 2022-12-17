<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1><p>
<% 
out.println("${pageContext.request.contextPath}");
if(request.getAttribute("NOTIFICATION")!=null)
	out.println(request.getAttribute("NOTIFICATION"));
%>
</p></h1>
<form action = "./EmployeeNewServlet" method="GET">
				
					<div class = "form-group">
						<input type = "text" class = "form-control" name = "name" placeholder = "Enter Name" value = "${employee.name}"/>
					</div>
				
					<div class = "form-group">
						<input type = "date" class = "form-control" name = "dob" value = "${employee.dob}"/>
					</div>
				
					<div class="form-group">
					  	<input type = "text" class = "form-control" name = "department" placeholder = "Enter Department" value = "${employee.department}"/>
					</div>
				
					<button type = "submit" class = "btn btn-primary">Save</button>
				</form>
				
				<a href="./EmployeeController">Employee LIST</a>
</body>
</html>