<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>File search</title>
</head>
<body>
<form>
    <input type="text" placeholder="Input word" name="wordAttribute"/>
    <input type="submit" formmethod="post" value="Search"/>
</form>
<h2>Res</h2>
<h2>${requestScope.res}</h2>
</body>
</html>
