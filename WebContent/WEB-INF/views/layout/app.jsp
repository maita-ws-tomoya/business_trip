<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ja">
    <head>
        <meta charset="UTF-8">
        <title>出張管理</title>
        <link rel="stylesheet" href="<c:url value='/css/reset.css' />">
        <link rel="stylesheet" href="<c:url value='/css/style.css' />">
    </head>
    <body>
        <div id="wrapper">
            <div id="header">
                <a href="${pageContext.request.contextPath}/index"><h1>出張管理 アプリケーション</h1></a>
            </div>
            <div id="content">
                ${param.content}
            </div>
            <div id="footer">
                by Maita Tomoya.
            </div>
        </div>
    </body>
</html>