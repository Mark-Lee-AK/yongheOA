<%@ page language="java" pageEncoding="UTF-8"%>
<!-- 引入JSTL标签库 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8"/>
    <title></title>
</head>
<body>
    <h1>Path:yonghe-ssm/WEB-INF/pages/test.jsp</h1>
    <c:forEach items="${list}" var="door" varStatus="sta" >
    	${ sta.count} : ${ door } <br>
    </c:forEach>
</body>
</html>
