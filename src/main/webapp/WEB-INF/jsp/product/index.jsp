<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<body>
  <h1>Product list</h1>
  <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>

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
