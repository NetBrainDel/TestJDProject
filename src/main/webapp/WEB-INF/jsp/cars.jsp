<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>System Cars</title>
</head>
<body>
<div>
    <h1>System Cars</h1>
</div>
<div>
    <table>
        <tr>
            <td>Car Id</td>
            <td>Car Model</td>
            <td>Car Color</td>
            <td>Creation</td>
            <td>Capacity_l</td>
            <td>Country_of_creation</td>
            <td>Guarantee_expiration_date</td>
            <td>Price</td>
            <td>Dealer_id</td>
            <td>Edit</td>
            <td>Delete</td>
        </tr>
        <c:forEach var="cars" items="${cars}">
            <tr>
                <td>${cars.id}</td>
                <td>${cars.model}</td>
                <td>${cars.color}</td>
                <td>${cars.creation}</td>
                <td>${cars.capacity_l}</td>
                <td>${cars.country_of_creation}</td>
                <td>${cars.guarantee_expiration_date}</td>
                <td>${cars.price}</td>
                <td>${cars.dealer_id}</td>
                <td><button>Edit</button></td>
                <td><button>Delete</button></td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>