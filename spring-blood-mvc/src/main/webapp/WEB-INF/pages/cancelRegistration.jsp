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
                 background-color:red ;
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

 } h2{
 text-align:center;}
 
</style>
</head>
<body>
<div class=container>
 <form:form action="/deleteDonorById" modelAttribute="data" method="delete">
<div><label for="">Cancel Registrtion</label>
 <form:input path="donarId"/>
 </div> 
 <br>
 <input type="submit" class="button" value="Delete"/>
 </form:form>
 </div>
</body>
</html>