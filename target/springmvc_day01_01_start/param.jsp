<%--
  Created by IntelliJ IDEA.
  User: pactera
  Date: 2020/6/2
  Time: 11:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <!--
    <a href="param/testParam?name=william&pass=123456">测试请求参数绑定</a>
    -->

<%--
    <!--  数据封装在一个类中  -->
    <form action="param/saveAccount" method="post">
        姓名：<input type="text" name="name"><br>
        密码：<input type="text" name="pass"><br>
        金额：<input type="text" name="money"><br>
        用户姓名：<input type="text" name="user.uname"><br>
        用户年龄：<input type="text" name="user.age"><br>
        <input type="submit" value="提交">
    </form>

     --%>

<%--
    <!--  数据封装在一个类中，但是对象中有list和map集合  -->
    <form action="param/saveAccount" method="post">
        姓名：<input type="text" name="name"><br>
        密码：<input type="text" name="pass"><br>
        金额：<input type="text" name="money"><br>
        用户姓名：<input type="text" name="list[0].uname"><br>
        用户年龄：<input type="text" name="list[0].age"><br>

        用户姓名：<input type="text" name="map['one'].uname"><br>
        用户年龄：<input type="text" name="map['one'].age"><br>
        <input type="submit" value="提交">
    </form>

    --%>

<%--
    <!--  自定义类型转换器  -->
    <form action="param/saveUser" method="post">
        用户姓名：<input type="text" name="uname"><br>
        用户年龄：<input type="text" name="age"><br>
        用户生日：<input type="text" name="birthday"><br>
        <input type="submit" value="提交">
    </form>--%>

    <a href="param/testServlet">获取servlet原生API</a>

</body>
</html>
