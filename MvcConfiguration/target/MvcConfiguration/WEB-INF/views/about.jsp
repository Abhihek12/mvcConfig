<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.List" %> <!-- Import List -->
    <%@page isELIgnored="false"%>
         <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>About</title>
</head>
<body>
<h1>${name}</h1>
<h3>${array}</h3>
<c:forEach var="item" items="${array}">
<h1>${item}</h1>
</c:forEach>
</body>
</html>
