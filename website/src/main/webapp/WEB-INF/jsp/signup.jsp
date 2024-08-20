<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
	<h1>sign up Page</h1>
	<form:form action = "registerUser" modelAttribute = "user">
		Name:
		<form:input path = "name"/>
		<br/>
		<br/>
		gender:
		Male <form:radiobutton path = "gender" value = "male"/>
		Female <form:radiobutton path = "gender" value = "female"/>
		<br/>
		<br/>
		Location:
		<form:select path = "location">
			<form:option value = "India"></form:option>
			<form:option value = "NRI"></form:option>
		</form:select>
		<br/>
		<br/>
		College:
		<form:select path="college">
			<form:option value="Jadabpur"></form:option>
			<form:option value="Bankura"></form:option>
			<form:option value="Durgapur"></form:option>
			<form:option value="Hooghly"></form:option>
		</form:select>
		<input type="submit">
	</form:form>
</html>