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

}
th{
  padding:10px 8px;
}
td{
padding:10px 8px;
text-align:center;
}
</style>
</head>
<body>
<table>
<tr>
	<th>Donar Id</th>
	<th>Full Name</th>
	<th>Gender</th>
	<th>Age</th>
	<th>Blood Group</th>
	<th>Last Time Donated</th>
	<th>Email</th>
	<th>Phone Number</th>
	<th>City</th>
	<th>State</th>

</tr>
<c:forEach items ="${data}" var ="eachItem">
	<tr>
		<td>${eachItem.donarId}</td>
		<td>${eachItem.fullName}</td>
		<td>${eachItem.gender}</td>
		<td>${eachItem.age}</td>
		<td>${eachItem.bloodgroup}</td>
		<td>${eachItem.lastTimeDonated}</td>
		<td>${eachItem.email}</td>
		<td>${eachItem.phoneNo}</td>
		<td>${eachItem.city}</td>
		<td>${eachItem.state}</td>
	</tr>
</c:forEach>
</table>
</body>
</html>