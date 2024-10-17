<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Page</title>
</head>
<body>
    <h1>로그인 페이지</h1>
    <form action="login" method="post">
        <input type="text" name="userName" placeholder="User ID" required/>
        <input type="password" name="password" placeholder="Password" required/>
        <button type="submit">로그인</button>
    </form>
    <p style="color: red">${param.error}</p>
<a href="membership.jsp">가입하기</a>
</body>
</html>
