package app.service;

public class GameService {
    public String displayResult(String input){
        if(input.equals("1")){
            return "Ты отклонил вызов. Поражение";
        }else if (input.equals("2")){
            return "Ты не пошел на переговоры. Поражение";
        } else if (input.equals("3")) {
            return "Твою ложь разоблачили. Поражение";
        }else
        return "Тебя вернули домой. Победа!";
    }
}
