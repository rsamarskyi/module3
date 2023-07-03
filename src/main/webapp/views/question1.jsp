<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List of something</title>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
</head>
<body>
<script>
    var selectedValue;

    function getValue(myValue) {
        selectedValue = myValue;
    }
    function submutValue() {
        if("1" == selectedValue) {
            return window.location.href='/Module_3_game_war_exploded/question2';
        } else {
            return window.location.href='/Module_3_game_war_exploded/end?id=1';
        }
    }
</script>
    <div id="forma1">
        <H2>Ты потерял память. Принять вызов НЛО?</H2>
        <FORM action="question2.jsp" method="post">
            <INPUT TYPE="radio" NAME="radios" VALUE="1" onclick="getValue(this.value)">
            Принять вызов
            <BR>
            <INPUT TYPE="radio" NAME="radios" VALUE="-1" onclick="getValue(this.value)">
            Отклонить вызов
            <BR>
            <BR>
            <input TYPE="button" id="submit" VALUE="Submit" onclick="submutValue()" >
        </FORM>
    </div>
<% String name = request.getParameter("name");
    if ((session.getAttribute("userName") == null || session.getAttribute("userName") != name) && name != null) {
        session.setAttribute("userName", name);
    } else {
        session.setAttribute("userName", session.getAttribute("userName"));
    };
    int numberOfGames = 0;
    if (session.getAttribute("gameCounter") == null) {
        session.setAttribute("gameCounter", numberOfGames+1);
    } else {
        numberOfGames = (int) session.getAttribute("gameCounter") +1;
        session.setAttribute("gameCounter", numberOfGames);
    }
%>
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
