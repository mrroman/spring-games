<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="p" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<p:page>
<div class="container">
	<f:form commandName="player">
		<f:label path="name">Name:</f:label>
		<f:input path="name"/>
		<f:label path="surname">Surname:</f:label>
		<f:input path="surname"/>
		<f:label path="age" >Age:</f:label>
		<f:input path="age"/>
		<f:label path="email">E-mail:</f:label>
		<f:input path="email"/>
		<button type="submit" class="btn">Submit</button>
	</f:form>
</div>
</p:page>