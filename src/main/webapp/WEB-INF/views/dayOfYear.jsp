<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="p" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<p:page>
<div class="container">

<form method="GET">
<input type="date" name="date">
<input type="submit">
</form>

<div>Day of year: ${dayNumber}</div>

</div>
</p:page>