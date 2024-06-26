<%@ page contentType="text/html;charset=UTF-8" language="java"%>
  <%@ taglib prefix="c" uri="jakarta.tags.core"%>

  <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
  <html>

  <head>
  <!-- Required meta tags -->
  <meta charset="utf-8">
  <meta name="viewport"
    content="width=device-width, initial-scale=1, shrink-to-fit=no">

  <!-- Bootstrap CSS -->
  <link rel="stylesheet"
    href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css"
    integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS"
    crossorigin="anonymous">

  <title>Students Listing</title>
  </head>

  <body>

    <div class="container">

      <h3>Students Listing</h3>
      <hr>

      <table class="table table-bordered table-striped">
        <thead class="thead-dark">
          <tr>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Course</th>
            <th>Country</th>
            <th>Action</th>
          </tr>
        </thead>

        <tbody>
          <c:forEach items="${students}" var="studentObj">
            <tr>
              <td><c:out value="${studentObj.firstName}" /></td>
              <td><c:out value="${studentObj.lastName}" /></td>
              <td><c:out value="${studentObj.course}" /></td>
              <td><c:out value="${studentObj.country}" /></td>
            </tr>
          </c:forEach>

        </tbody>
      </table>

    </div>

  </body>

  </html>
