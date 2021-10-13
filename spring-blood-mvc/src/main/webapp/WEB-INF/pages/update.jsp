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
           width: 400px;
           margin:auto;
           margin: 10 2 3 450px;
           overflow: hidden;
           padding: 50px;
           background: rgb(236, 230, 230);
           
            }
            input.button{
                 background-color:green ;
                   width: 100px;
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
<div class =container>
<h2>Update Donar Location</h2>
 <form:form action="/updateDonorById" modelAttribute="data" method="">
 <div><label for="">Enter Donar Id</label>
  <form:input path="donarId"/></div>
  <br>
  <div>
 <label for="">Update Donar location</label>
 
 <form:input path="city"/>
 </div>
 <br>
 <br>
 <input type="submit" class="button" value="Update"/>
 </form:form>
 </div>
</body>
</html>