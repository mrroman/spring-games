<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="p" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<p:page>
<div class="container">
	<f:form commandName="discipline">
		<p:field path="name" label="Name">
			<f:input path="name"/>
		</p:field>
		<p:field path="playersNumber" label="Number of players">
			<f:input path="playersNumber"/>
		</p:field>
		<button type="submit" class="btn">Submit</button>
	</f:form>
</div>
</p:page>