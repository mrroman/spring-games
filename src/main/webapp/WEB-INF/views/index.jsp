<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="p" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<p:page>
<div class="container">
<form action="<c:url value="/"/>" method="POST">
<input type="text" name="a">
<input type="text" name="b">
<div>Wynik: ${c}</div>
<input type="submit">
</form>
</div>
</p:page>