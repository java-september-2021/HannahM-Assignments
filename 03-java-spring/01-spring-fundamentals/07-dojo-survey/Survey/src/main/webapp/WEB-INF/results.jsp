<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dojo Survey Results</title>
</head>
<body>
	<c:set var="result" value="${ result }"/>
	<h1>Submitted Info</h1>
	<p>Name: <c:out value="${ result.getName() }"/></p>
	<p>Language: <c:out value="${ result.getLanguage() }"/></p>
	<p>Location: <c:out value="${ result.getLocation() }"/></p>
	<p>Comment: <c:out value="${ result.getComment() }"/></p>
</body>
</html>