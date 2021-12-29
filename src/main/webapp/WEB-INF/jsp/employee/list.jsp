<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>직원 리스트</title>
<style type="text/css">
	table {
		width: 100%;
		border-collapse: collapse;
	}
	th, td {
		border: 1px solid #dddddd;
		text-align: left;
		paddingL 8px;
	}
	
	tr:nth-child(even) {
		background-color: #dddddd;
	}
</style>
</head>
<body>
	<h1>직원 리스트</h1>
	<div style="text-align: right; margin-bottom: 10px;">
		<a href="insert.do">새 직원 등록</a>
	</div>
	<table>
		<thead>
			<tr>
				<th>아이디</th>
				<th>이름</th>
				<th>전화번호</th>
				<th>직종</th>
				<th>급여</th>
				<th>입사일</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="emp" items="${employees }">
				<tr>
					<td>${emp.id }</td>
					<td><a href="detail.do?id=${emp.id }">${emp.firstName } ${emp.lastName }</a></td>
					<td>${emp.phoneNumber }</td>
					<td>${emp.jobId }</td>
					<td><fmt:formatNumber value="${emp.salary }" pattern="##,###"></fmt:formatNumber> 달러</td>
					<td><fmt:formatDate value="${emp.hireDate }" pattern="yyyy년 M월 d일"/></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>