
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Collection search</title>
</head>
<body>
<form>
    <input type="text" placeholder="input key" name="findInfo">
    <input type="text" placeholder="input to change" name="changeText">
    <input type="checkbox" name="ifChange" value="True">
    <input type="submit" formmethod="post" value="ok">
</form>
<h2>Res</h2>
<h2>${requestScope.res}</h2>
</body>
</html>
