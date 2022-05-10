<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <body>
    
    <form action="/loginAction" method="post">
        로그인<br>
        <P>
        ${errMsg}
    	</P>
        id : <input type="text" name="id" value="test"><br>
        pw : <input type="text" name="pw" value="1234"><br>
        <button type="submit">로그인</button>
    </form>
    
    </body>
</html>
