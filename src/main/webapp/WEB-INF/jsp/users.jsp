<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>System Users</title>
</head>
<body>
<div>
    <h1>System Users</h1>
</div>
<div>
    <table>
        <tr>
            <td>User Id</td>
            <td>User Username</td>
            <td>User Surname</td>
            <td>Birth date</td>
            <td>Gender</td>
            <td>Country</td>
            <td>Created</td>
            <td>Changed</td>
            <td>Weight</td>
            <td>Edit</td>
            <td>Delete</td>
        </tr>
        <c:forEach var="users" items="${users}">
            <tr>
                <td>${users.id}</td>
                <td>${users.username}</td>
                <td>${users.surname}</td>
                <td>${users.birthDate}</td>
                <td>${users.gender}</td>
                <td>${users.created}</td>
                <td>${users.changed}</td>
                <td>${users.weight}</td>
                <td><button>Edit</button></td>
                <td><button>Delete</button></td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>