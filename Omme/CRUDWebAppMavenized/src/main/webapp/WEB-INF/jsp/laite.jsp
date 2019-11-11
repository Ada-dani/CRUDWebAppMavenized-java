<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/jsp/includes.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Laitteen Tiedot</title>
</head>
<body>
	<h1>Laitteet Data</h1>
	<form:form action="laite.do" method="POST" commandName="laite">
		<table>
			<tr>
				<td>Laitteen ID:</td>
				<td><form:input path="laiteId" /></td>
			</tr>
			<tr>
				<td>Nimi:</td>
				<td><form:input path="nimi" /></td>
			</tr>
			</tr>
			<tr>
				<td>Kuvaus:</td>
				<td><form:input path="kuvaus" /></td>
			</tr>
			<tr>
				<td>Hinta:</td>
				<td><form:input path="hinta" /></td>
			</tr>
			<tr>
				<td>Ostopäivämäärä:</td>
				<td><form:input path="ostopäivämäärä" /></td>
			</tr>
			<tr>
				<td>Takuu:</td>
				<td><form:input path="takuu" /></td>
			</tr>
			<tr>
			<td colspan="2">
				<input type="submit" name="action" value="Add" />
				<input type="submit" name="action" value="Edit" />
				<input type="submit" name="action" value="Delete" />
				<input type="submit" name="action" value="Search" />
			</td>
		</tr>
		</table>


	</form:form>
<br>
<table border="1">
	<th>ID</th>
	<th>Nimi</th>
	<th>Kuvaus</th>
	<th>Hinta</th>
	<th>Ostopäivämäärä</th>
	<th>Takuu</th>
	<c:forEach items="${laiteList}" var="laite">
		<tr>
			<td>${laite.laiteId}</td>
			<td>${laite.nimi}</td>
			<td>${laite.kuvaus}</td>
			<td>${laite.hinta}</td>
			<td>${laite.ostopäivämäärä}</td>
			<td>${laite.takuu}</td>
		</tr>
	</c:forEach>
</table>	
	
</body>
</html>