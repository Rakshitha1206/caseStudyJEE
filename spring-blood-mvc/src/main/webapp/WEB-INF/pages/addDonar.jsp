<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Donar</title>
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
                  align:auto;           
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

<article>
<div class=container>
<h2>Registration Form</h2>
 <form:form action="/addDonar" modelAttribute="command" method="post">
<div >
		<label for="">DonarId</label>
		<form:input path="donarId" class="txt" disabled="disabled"/>
		
	</div>
	<div>
		<label for="">Donar Name</label>
		<form:input path="fullName" class="txt"/>
		
	</div>
	<div>
		<label for="">Gender</label>
		Male <form:radiobutton path="Gender" value="Male"/>  
        Female <form:radiobutton path="Gender" value="Female"/>  
	</div>
	<div>
		<label for="">Age</label>
		<form:input path="age" class="txt"/>
		<form:errors path="age" cssStyle="color:#ff0000"/>
	</div>
	<div><label for="">Blood Group</label>
	<form:select path="bloodgroup">  
        <form:option value="A+ve" label="A+ve"/>
        <form:option value="A-ve" label="A-ve"/>    
        <form:option value="B+ve" label="B+ve"/>  
        <form:option value="B-ve" label="B-ve"/>  
        <form:option value="AB+ve" label="AB+ve"/>  
        <form:option value="AB-ve" label="Ab-ve"/> 
        <form:option value="O+ve" label="O+ve"/>  
        <form:option value="O-ve" label="O-ve"/> 
        <form:option value="Bombay Blood" label="Bombay Blood"/>   
        
        </form:select>  
	</div>
	
	<div>
	
	<label for="">Last Time Donated</label>
	<form:input type="date" path="lastTimeDonated"/>
      </div> 
       <div>
		<label for="">Email</label>
		<form:input path="email"/>
		
	</div>
	<div>
		<label for="">Phone Number</label>
		<form:input path="phoneNo"/>
		
	</div>
        <div>
        <label for="">City</label>
        <form:input path="city"/>
        </div>
          <div>
        <label for="">State</label>
        <form:input path="state"/>
        </div>
       <br>
	<input class=button type ="submit" value="Add Donar">
	
 </form:form>	
</div>
</article>
</body>
</html>