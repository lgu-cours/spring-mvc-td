<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<!-- 
<link rel="stylesheet" type="text/css" href="./static/css/style.css">
 -->
<link rel="stylesheet" type="text/css" href="<c:url value='/static/css/style.css'/>">

</head>

<body>
<h1>Hello ${name} (JSP)</h1>

<h2>JSP (with Spring MVC taglib for CSS style)</h2>
</body>
</html>