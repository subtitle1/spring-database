<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>직원 등록</title>
</head>
<body>
	<h1>신규 직원 등록 폼</h1>
	<form action="insert.do" method="post">
		<div style="margin-bottom: 10px;">
			<label style="display: block;">First Name</label>
			<input type="text" name="firstName" style="width: 50%"/>
		</div>
		<div style="margin-bottom: 10px;">
			<label style="display: block;">Last Name</label>
			<input type="text" name="lastName" style="width: 50%"/>
		</div>
		<div style="margin-bottom: 10px;">
			<label style="display: block;">Phone Number</label>
			<input type="text" name="phoneNumber" style="width: 50%"/>
		</div>
		<div style="margin-bottom: 10px;">
			<label style="display: block;">Email</label>
			<input type="text" name="email" style="width: 50%"/>
		</div>
		<div style="margin-bottom: 10px;">
			<button type="submit">등록</button>
		</div>
	</form>
</body>
</html>