<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
</head>
<body>
<h3>Welcome, Enter The Car Details</h3>
<form:form method="POST"
           action="/cars" modelAttribute="carCreateRequest">
    <table>
        <tr>
            <td><form:label path="model">Model</form:label></td>
            <td><form:input path="model"/>${carCreateRequest.model}</td>
        </tr>
        <tr>
            <td><form:label path="color">Color</form:label></td>
            <td><form:input path="color"/></td>
        </tr>
        <tr>
            <td><form:label path="creation">
                Creation</form:label></td>
            <td><form:input path="creation"/></td>
        </tr>
        <tr>
            <td><form:label path="price">
                Price</form:label></td>
            <td><form:input path="price"/></td>
        </tr>
        <tr>
            <td><input type="submit" value="Submit"/></td>
        </tr>
    </table>
</form:form>
</body>
</html>