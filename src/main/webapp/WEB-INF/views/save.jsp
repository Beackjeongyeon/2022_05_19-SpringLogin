<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2022-05-19
  Time: 오전 9:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>회원가입 페이지입니다.</title>
</head>
<body>





<form action="save1" method="post">
    <a>아이디</a><input type="text" name="memberId" placeholder="아이디"><br>
    <a>비밀번호</a><input type="text" name="memberPassword" placeholder="비밀번호"><br>
    <a>이름</a><input type="text" name="memberName" placeholder="이름"><br>
    <a>나이</a><input type="int" name="memberAge" placeholder="나이"><br>
    <a>핸드폰번호</a><input type="text" name="memberPhone" placeholder="핸드폰번호"><br>
    <input type="submit" value="확인">
</form>

</body>
</html>
