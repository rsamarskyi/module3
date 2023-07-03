<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="app.service.GameService"  %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<% GameService service = new GameService();%>

<h2><%= service.displayResult(request.getParameter("id"))%></h2>
<br><br>
<button onclick="location.href='question1'">Начать игру заново</button>

</br>
</br>
<div id="result">
    SessionId: <%= session.getId()%>
    </br>
    Player's name: <%= session.getAttribute("userName")%>
    </br>
    Number of games played: <%= session.getAttribute("gameCounter")%>
</div>
</body>
</html>
