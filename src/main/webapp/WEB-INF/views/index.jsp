<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h3>Spring MVC GitHub</h3>

<h3> ${msg}</h3>

<form action="upload" method="post" enctype="multipart/form-data">

   Please select a file to upload: <input type="file" name="file">

    <input type="submit" value="upload">

</form>
</body>
</html>