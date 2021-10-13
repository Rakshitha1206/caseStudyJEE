<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Camps</title>
<style>
div.container
   {    
           width: 350px;
           margin:auto;
           margin: 10 2 3 450px;
           overflow: hidden;
           padding: 50px;
           background: rgb(236, 230, 230);
           
            }

 
input.button{
                 background-color:green ;
                   width: 200px;
                   height: 30px;
                   border :none;
                   border-radius: 10px;
                   padding :5px;
                   color:white;
                  font-size: 16px; 
                  align:center;           
 }
 label{
 color:black;
padding:15px;

 }
 div{
 margin-top:15px;
 }
 h2{
 text-align:center;}

</style>
</head>
<body>
<div class=container>
<h2>Camp Registration Form</h2>
 <form:form action="/addCamp" modelAttribute="command" method="post">
<div >
		<label for="">Camp Id</label>
		<form:input path="campId"/>
		
	</div>
	<div>
		<label for="">Camp Name</label>
		<form:input path="campName"/>
		
	</div>
	<div>
		<label for="">Camp Date</label>
	<form:input type="date" path="campDate"/>
	</div>
	<div>
		<label for="">Camp Time</label>
		<form:input path="time"/>
		
	</div>
	
	
	<div>
	<label for="">Address</label>
	<form:input  path="address"/>
      </div> 
      
       <div>
		<label for="">Contact Number</label>
		<form:input path="contactNo"/>
		
	</div>
	<br>
	
     <br>  
	<input class="button" type ="submit" value="Add Camp">
	
 </form:form>	
</div>

</body>
</html>