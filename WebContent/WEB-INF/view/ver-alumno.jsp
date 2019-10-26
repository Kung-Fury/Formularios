<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Procesar alumno</title>
</head>
<body>
<h1>Alumno</h1>
<p>Nombre:${alumno.nombre}</p>
<p>DNI:${alumno.dni}</p>
<p>email:${alumno.email}</p>
<p>Becado:${alumno.becado}</p>
<p>	Asignaturas: </p>
	<ul>
		<c:forEach var="asignaturas" items="${alumno.asignaturas}">
		<li>${asignaturas}</li>
		</c:forEach>
	</ul>
</body>
</html>