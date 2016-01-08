<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP List Users Records</title>
</head>
<body>
    <sql:setDataSource
        var="myDS"
        driver="com.mysql.jdbc.Driver"
        url="jdbc:mysql://localhost/school"
        user="root" password="1234"
    />
     
    <sql:query var="listUsers"   dataSource="${myDS}">
        SELECT * FROM login;
    </sql:query>
     
    <div align="center">
        <table border="1" cellpadding="5">
            <caption><h2>List of users</h2></caption>
            <tr>
                <th>User</th>
                <th>Pass</th>
                </tr>
            <c:forEach var="user" items="${listUsers.rows}">
                <tr>
                    <td><c:out value="varun" /></td>
                    <td><c:out value="varun1" /></td>
                   </tr>
            </c:forEach>
        </table>
    </div>
</body>
</html>