<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>게시판</title>
</head>
<body>
    <h1>게시글 작성</h1>
    <br/>
    <h2>내용은 10자 이상이어야 합니다</h2>

    <form>
        <label>제목 : </label>
        <input type="text" id="title" name="title"/><br/>
        <label>내용 : </label>
        <input type="text" id="content" name="content"/><br/><br/>
        <input type="submit" value="작성하기">

    </form>
</body>
</html>