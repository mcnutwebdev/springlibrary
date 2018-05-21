<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Show Customers</title>
<link href="/css/style.css" rel="stylesheet"></link>
</head>
<body>

<h1>Customers</h1>
	
	<table>
		<tr>
			<th>Customer ID</th>
			<th>Name</th>
			<th>Loans</th>
			
		</tr>
		<c:forEach items="${customer}" var="customer">
			<tr>
				<td>${customer.cId}</td>
				<td>${customer.cName}</td>
				<td>loans: coming soon</td>
			</tr>
		</c:forEach>
	</table>
		
	<a href="/">Home</a>



</body>
</html>