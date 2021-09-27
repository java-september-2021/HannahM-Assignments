<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dojo Survey</title>
</head>
<body>
	<h1>Dojo Survey</h1>
	<form method="POST" action="/survey">
	<p>
	<label for="name"> Your Name</label>
	<input type="text" name="name">
	</p>
	<p>
	<label> Location </label>
	<select name="location">
		<option value="Chicago">Chicago</option>
		<option value="San Jose">San Jose </option>
		<option value="Seattle"> Seattle </option>
	</select>
	</p>
	<p>
		<label>Language</label>
		<select name="language">
			<option value="Java">Java</option>
			<option value="Python">Python</option>
			<option value="Html">HTML</option>
		</select>
	</p>
	<p>
		<label>Comments (optional)</label>
		<textarea name="comment"></textarea>
	</p>
	
	<button>Submit</button>
	</form>
</body>
</html>