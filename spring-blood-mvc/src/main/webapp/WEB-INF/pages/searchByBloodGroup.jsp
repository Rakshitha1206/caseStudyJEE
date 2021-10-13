<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
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
  h2{
 text-align:center;}
 
</style>
</head>
<body>
<div class=container>
<h2>Find Donar</h2>
 <form:form action="/getDonorByBloodGroup" modelAttribute="data" method="get">
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
        
        </form:select> </div>
 <br>
 <input type="submit" class="button"value="Search"/>
 </form:form>
 </div>
</body>
</html>