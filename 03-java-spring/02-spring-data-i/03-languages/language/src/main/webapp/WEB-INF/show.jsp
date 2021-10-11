<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href="/">Dashboard</a>

<p><c:out value="${thisLang.name}"/></p>
<p><c:out value="${thisLang.creator}"/></p>
<p><c:out value="${thisLang.currentVersion}"/></p>

<p><a href="/edit/${lang.id}">Edit</a>|</p>
<form method="POST" action="/delete/${thisLang.id}">
<input type="hidden" name="_method" value="delete">
<p><a href="/delete/${lang.id}">Delete</a></p>
</form>
</body>
</html>