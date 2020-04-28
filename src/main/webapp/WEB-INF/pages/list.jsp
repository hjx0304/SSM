<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 23518
  Date: 2020/4/23
  Time: 18:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户列表</title>
</head>
<body>

<h1>欢迎：${ sessionScope.loginAccount.name }</h1>

<h3><a href="insertPages">跳转到添加页面</a></h3>
<h1>list</h1>
<c:forEach items="${testBeanList}" var="testBean">
    ${testBean.name}-----<a href="delete/${testBean.id}">删除</a>-----
    <a href="queryById?id=${testBean.id}">修改</a><br/>
</c:forEach>
<c:if test="${current>1}">
    <a href="queryAllByPages?current=${current-1}">上一页</a>
</c:if>
<c:if test="${current<totalPages}">
    <a href="queryAllByPages?current=${current+1}">下一页</a>
</c:if>
共${totalPages}页

</body>
</html>
