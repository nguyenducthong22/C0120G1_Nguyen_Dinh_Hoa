<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 4/4/2020
  Time: 4:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product List</title>
</head>
<body>
<h1>Product List</h1>
<p>
    <a href="/product?action=create">Create New Product</a>
</p>

<form action="/findByName" method="get">
    <div >
        <h2>Find Product By Name</h2>
        <input type="text" name="inputName" id="inputName" >
        <input type="submit" value="Search"/>
    </div>
</form>

<%--<p>--%>
<%--    &lt;%&ndash;        <c:set scope="request" var="inputname" value="" />&ndash;%&gt;--%>
<%--    <a href="/product?action=findByName&inputName=${}">Find Product By Name</a>--%>
<%--</p>--%>



<table border="1">
    <tr>
        <td>Name</td>
        <td>Price</td>
        <td>Description</td>
        <td>Producer</td>
        <td>Edit</td>
        <td>Delete</td>
    </tr>
    <c:forEach items='${requestScope["products"]}' var="product">
        <tr>
            <td><a href="/product?action=view&id=${product.getId()}">${product.getName()}</a></td>
            <td>${product.getPrice()}</td>
            <td>${product.getDescription()}</td>
            <td>${product.getProducer()}</td>
            <td><a href="/product?action=edit&id=${product.getId()}">edit</a></td>
            <td><a href="/product?action=delete&id=${product.getId()}">delete</a></td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
