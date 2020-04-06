<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 4/5/2020
  Time: 11:39 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Customer Management Application</title>
</head>
<body>
<h1 style="text-align: center">Customer</h1>
<h2 style="text-align: center">
    <a href="#">Add New Customer</a>
    <a href="#">List All Customer</a>
</h2>
<div align="center">
    <table border="1" cellpadding="5">
        <caption><h2>List Customer</h2></caption>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Email</th>
            <th>Address</th>
            <th>Action</th>
        </tr>
        <c:forEach var="customer" items="${listCustomer}" >
            <tr>
                <td>
                    <c:out value="${customer.getId()}"></c:out>
                </td>
                <td>
                    <c:out value="${customer.getName()}"></c:out>
                </td>
                <td>
                    <c:out value="${customer.getEmail()}"></c:out>
                </td>
                <td>
                    <c:out value="${customer.getAddress()}"></c:out>
                </td>
                <td>
                    <a href="#">Edit</a>
                    <a href="#">Delete</a>
                </td>


            </tr>
        </c:forEach>


    </table>

</div>
<table>
    <tr>

    </tr>

</table>
</body>
</html>
