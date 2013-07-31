<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="p" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<p:page>
	<div class="container">
		<div class="pull-left">
		<a class="btn" href="."><i class="icon-plus"></i> Add</a><br>
		</div>
		<div class="pull-right">
			<form method="GET" class="form-search">
			<div class="input-append">
			    <input type="text" name="name" class="span2 search-query">
		    	<button type="submit" class="btn">Search</button>
		    </div>
			</form>
		</div>
		
		<table class="table">
		<thead>
			<tr>
				<th>Name</th>
				<th>Surname</th>
				<th>Age</th>
				<th>Discipline</th>
				<th></th>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${players}" var="player">
			<tr>
				<td>${player.name}</td>
				<td>${player.surname}</td>
				<td>${player.age}</td>
				<td>${player.discipline.name}</td>
				<td>
					<a href="${player.id}/"><i class="icon-pencil"></i> Edit</a>
					<a href="${player.id}/delete"><i class="icon-trash"></i> Delete</a>
				</td>
			</tr>
		</c:forEach>
		</tbody>
		</table>
	</div>
</p:page>