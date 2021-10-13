<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>BBM</title>
	<style>
* {
  box-sizing: border-box;
}

body {
  font-family: Arial, Helvetica, sans-serif;
}

/* Style the header */
header {
  background-color: maroon;
  padding: 20px;
  text-align: center;
  
  color: white;
}


nav {
  float: left;
  width: 20%;
  background-color:white;
  height: 450px; 
  padding: 20px;
  background-color:rgba(241, 172, 172, 0.247);
}

/* Style the list inside the menu */
nav ul {
  list-style-type: none;
  padding: 0;
}
nav li {
  list-style-type: none;
  padding: 10px;
}

article {
  float: left;
  padding: 20px;
  width: 80%;
  height:450px;
  background-color: #f1f1f1;
  height: 300px; /* only for demonstration, should be removed */
}

/* Clear floats after the columns */
section::after {
  content: "";
  display: table;
  clear: both;
}

/* Style the footer */
footer {
  background-color: maroon;
  padding: 10px;
  text-align: left;
  color: white;
}

/* Responsive layout - makes the two columns/boxes stack on top of each other instead of next to each other, on small screens */
@media (max-width: 600px) {
  nav, article {
    width: 100%;
    height: auto;
  }
}
</style>
</head>
<body>

<header>
  <h1>Avenue Blood Bank</h1>
</header>

<section>
  <nav>
    <ul>
      <li><a href="/addDonar">Regiter to Donate</a></li>
      <li><a href="/getAllDonars">Show Donar</a></li>
      <li><a href="/addCamp">Add Camp</a></li>
      <li><a href="/getAllCamps">Show Camps Details</a></li>
      <li><a href="/searchByBloodGroup">Find Donar</a></li>
      <li><a href="/cancelRegistration">Cancel Registration</a></li>
      <li><a href="/update">Upadate Donar Details</a></li>
    </ul>
  </nav>
  

</section>

<footer>
  <p> &#169; Copyright from 2021 of Avenue Blood Bank Mysuru</p>
  
</footer>



</body>
</html>