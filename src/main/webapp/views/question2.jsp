<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List of something</title>
</head>
<body>
<script>
    var selectedValue;

    function getValue(myValue) {
        selectedValue = myValue;
    }
    function submutValue() {
        if("1" == selectedValue) {
            return window.location.href='/Module_3_game_war_exploded/question3';
        } else {
            return window.location.href='/Module_3_game_war_exploded/end?id=2';
        }
    }
</script>
<div id="forma1">
    <H2>Ты принял вызов. Поднимешься на мостик к капитану?</H2>
    <FORM action="question3.jsp" method="post">
        <INPUT TYPE="radio" NAME="radios" VALUE="1" onclick="getValue(this.value)">
        Подняться на мостик
        <BR>
        <INPUT TYPE="radio" NAME="radios" VALUE="-1" onclick="getValue(this.value)">
        Отказаться подниматься на мостик
        <BR>
        <BR>
        <input TYPE="button" id="submit" VALUE="Submit" onclick="submutValue()" >

    </FORM>

</div>
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

