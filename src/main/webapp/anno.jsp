<%--
  Created by IntelliJ IDEA.
  User: pactera
  Date: 2020/6/2
  Time: 15:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>常用注解</title>
</head>
<body>

    <!--常用注解-->

    <!--RequestParam-->
    <a href="anno/testRequestParam?name=林作亮">RequestParam</a><br/>

    <!--RequestBody-->
    <form action="anno/testRequestBody" method="post">
        用户姓名：<input type="text" name="uname"><br/>
        用户年龄：<input type="text" name="age"><br/>
        <input type="submit" value="提交"><br/>
    </form>


    <!--PathVarible-->
    <a href="anno/testPathVarible/1">PathVarible</a><br/>

    <!--RequestHeader-->
    <a href="anno/testRequestHeader">RequestHeader</a><br/>

    <!--CookieValue-->
    <a href="anno/testCookieValue">CookieValue</a><br/>

    <!--ModelAttribute-->
    <form action="anno/testModelAttribute" method="post">
        用户姓名：<input type="text" name="uname"><br/>
        用户年龄：<input type="text" name="age"><br/>
        <input type="submit" value="提交"><br/>
    </form>


    <!--SessionAttributes-->
    <a href="anno/testSessionAttributes">testSessionAttributes</a><br/>
    <a href="anno/getSessionAttributes">getSessionAttributes</a><br/>
    <a href="anno/delSessionAttributes">delSessionAttributes</a><br/>


</body>
</html>
