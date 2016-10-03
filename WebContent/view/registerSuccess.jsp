<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>register success</title>
</head>
<body>
	<ul>
		<li>ID: ${customer.id}</li>
		<li>Name: ${customer.name}</li>
		<li>Email: ${customer.email}</li>
		
	</ul>
	<p>register success</p>
	<p><a href=/helloMVC/index.jsp>try home</a></p>
</body>
</html>