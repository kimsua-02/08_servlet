<%--
  Created by IntelliJ IDEA.
  User: 803-04
  Date: 2024-10-16
  Time: 오후 2:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Membership</title>
</head>
<body>
    <h1>회원가입</h1>
    <form action="membership" method="post">
        <input type="text" name="username" placeholder="User ID" required/>
        <input type="password" name="password" placeholder="Password" required/>
        <input type="email" name="email" placeholder="Email" required/>
        <button type="submit">가입하기</button>
    </form>
<a href="login.jsp">로그인 화면</a>
</body>
</html>
