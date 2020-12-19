<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="UTF-8">
    <title>用户表</title>
</head>
<body>
    <#list users as user>
    <h1>${user.id} ${user.username}</h1>
    </#list>
</body>
</html>