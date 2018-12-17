<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>中国所有的省份</title>
</head>
<body>
<table id="table">
    <tr>
        <td>序号</td>
        <td>编码</td>
        <td>名称</td>
    </tr>
    <c:forEach items="${requestScope.list}" var="uu">
        <tr>
            <td>${uu.id}</td>
            <td>${uu.code}</td>
            <td>${uu.name}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>