<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>PLace to edit</title>
</head>
<body>
<h1>Language Editor</h1>
	<form:form action="/edit/${language.id}" method="POST" modelAttribute="Language">
	<p>
	<form:label path="name">Name</form:label>
	<form:errors path="name"/>
	<form:input path="name"/>
	</p>
	<p>
	<form:label path="creator">Creator</form:label>
	<form:errors path="creator"/>
	<form:input path="creator"/>
	</p>
	<p>
	<form:label path="currentVersion">Current Version</form:label>
	<form:errors path="currentVersion"/>
	<form:input path="currentVersion"/>
	</p>
	
	<input type="hidden" name="put">
	<button>Edit</button>
</form:form>
</body>
</html>