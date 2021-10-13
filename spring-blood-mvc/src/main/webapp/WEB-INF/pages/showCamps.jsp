<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">

table{
margin-left: auto;
margin-right:auto;
border:2px solid red;
border-collapse:collapse
}
th{
  padding:10px 12px;
}
td{
padding:10px 12px;
text-align:center;
}
</style>
</head>
<body>
<table>
	<tr>
		<th>Camp Id</th>
		<th>Camp Name</th>
		<th>Camp Date</th>
		<th>Camp Time</th>
		<th>Address</th>
		<th>Contact Number</th>
	</tr>
<c:forEach items ="${data}" var ="eachItem">
	<tr>
	    <td>${eachItem.campId}</td>
	    <td>${eachItem.campName}</td>
	    <td>${eachItem.campDate }</td>
	    <td>${eachItem.time}</td>
	    <td>${eachItem.address }</td>
	    <td>${eachItem.contactNo }</td>
	    <td><a href="/addDonar">Register here</a></td>
	</tr>
	
</c:forEach>
</table>
</body>
</html>