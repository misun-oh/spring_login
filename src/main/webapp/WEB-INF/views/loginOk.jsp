<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <body>
    
    <form action="/logoutAction">
        ${user.getId()} 님 환영 합니다. <br>        
        <button type="submit">로그아웃</button>
    </form>
    <form action="/login">
    <button type="submit">메인페이지로 이동</button>
    </form>
    </body>
</html>
