<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
	<h1>This is the signup page</h1>
	<form:form action="done" modelAttribute="vehicle">
		Car Number:
		<form:textarea path="RegisterationNumber"/>
		<br/>
		<br/>
		Car Name:
		<form:select path="CarName">
			<form:option value="Seltos"></form:option>
			<form:option value="Thar"></form:option>
			<form:option value="Ford"></form:option>
			<form:option value="Rolls-Royce"></form:option>
		</form:select>
		<br/>
		<br/>
		Covered In Warranty:
		<form:select path="CarDetails">
			<form:option value="Yes"></form:option>
			<form:option value="No"></form:option>
		</form:select>
		<br/>
		<br/>
		Any remarks:
		<form:textarea path="CarWork"/>
		<br/>
		<br/>
		<input type = "Submit">
	</form:form>
</html>
