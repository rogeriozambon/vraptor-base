<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8"/>
    <title>Products</title>
  </head>
  <body>
    <table width="100%" border="0" cellspacing="0" cellpadding="0">
      <thead>
        <tr>
          <td>Name</td>
          <td>Description</td>
          <td>Price</td>
        </tr>
      </thead>
      <tbody>
        <c:forEach items="${productList}" var="product">
          <tr>
            <td>${product.name}</td>
            <td>${product.description}</td>
            <td>${product.price}</td>
          </tr>
        </c:forEach>
      </tbody>
    </table>
  </body>
</html>
