<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<h1>This is the signup page</h1>

<%--@elvariable id="Vehicle" type="Car"--%>
<form:form action="done" modelAttribute="Vehicle">
    Car Number:<form:input path="RegisterationNumber"/>
    <br/>
    <br/>
Car Name<form:select path="CarName">
    <form:option value="Seltos"></form:option>
    <form:option value="sonnet"></form:option>
    </form:select>
    <br/>
    <br/>
    Covered In Warranty:
    <form:select path="CarDetails">
        <form:option value="YES"></form:option>
        <form:option value="NO"></form:option>
    </form:select>
    <br/>
    <br/>
    Any remarks :<form:input path="CarWork"/>
    <br/>
    <br/>
    <input type="submit">


</form:form>
</html>
