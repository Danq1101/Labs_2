<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p name="text">
    Lorem ipsum dolor sit amet, consectetuer adipiscing elit.<br>
    Aenean commodo ligula eget dolor. Aenean massa.<br>
    Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus.<br>
    Donec quam felis, ultricies nec, pellentesque eu, pretium quis, sem.<br>
    Nulla consequat massa quis enim. Donec pede justo, fringilla vel, aliquet nec, vulputate eget, arcu.<br>
    In enim justo, rhoncus ut, imperdiet a, venenatis vitae, justo.<br>
    Nullam dictum felis eu pede mollis pretium. Integer tincidunt.<br>
    Cras dapibus. Vivamus elementum semper nisi. Aenean vulputate eleifend tellus.<br>
    Aenean leo ligula, porttitor eu, consequat vitae, eleifend ac, enim.<br>
    Aliquam lorem ante, dapibus in, viverra quis, feugiat a, tellus.<br>
    Phasellus viverra nulla ut metus varius laoreet. Quisque rutrum.<br>
    Aenean imperdiet. Etiam ultricies nisi vel augue.<br>
    Curabitur ullamcorper ultricies nisi. Nam eget dui.<br>
    Etiam rhoncus. Maecenas tempus, tellus eget condimentum rhoncus,<br>
    sem quam semper libero, sit amet adipiscing sem neque sed ipsum.<br>
    Sed consequat, leo eget bibendum sodales, augue velit cursus nunc,<br>
</p>
<form>
    <input type="text" name="textSize" placeholder="Input font size">
    <input type="text" name="textAmount" placeholder="Input number of row">
    <input type="submit" formmethod="post" value="ok">
</form>
<h2>Res</h2>
<p style="font-size:${requestScope.fontSize}px">${requestScope.res}</p>
</body>
</html>
