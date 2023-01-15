<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
    <head>
        <title>List Todos Page</title>
    </head>

    <body>
        <h3>Welcome ${name}</h3>
        <hr>
        <h1>Your todos</h1>
        <table>
            <thead>
                <tr>
                  <th>id</th>
                  <th>Description</th>
                  <th>Target Date</th>
                  <th>Is Done?</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${todos}" var="todo">
                    <tr>
                        <td>${todo.id}</td>
                        <td>${todo.description}</td>
                        <td>${todo.targetDate}</td>
                        <td>${todo.done}</td>
                    </tr>
                </c:forEach>
        </table>
    </body>
</html>