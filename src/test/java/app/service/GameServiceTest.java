package app.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameServiceTest {

    @Test
    void testDisplayResult_whenInputIs1() {
        GameService gameService = new GameService();
        String input = "1";
        String expected = "Ты отклонил вызов. Поражение";
        String result = gameService.displayResult(input);
        assertEquals(expected, result);
    }

    @Test
    void testDisplayResult_whenInputIs2() {
        GameService gameService = new GameService();
        String input = "2";
        String expected = "Ты не пошел на переговоры. Поражение";
        String result = gameService.displayResult(input);
        assertEquals(expected, result);
    }

    @Test
    void testDisplayResult_whenInputIs3() {
        GameService gameService = new GameService();
        String input = "3";
        String expected = "Твою ложь разоблачили. Поражение";
        String result = gameService.displayResult(input);
        assertEquals(expected, result);
    }

    @Test
    void testDisplayResult_whenInputIsNot123() {
        GameService gameService = new GameService();
        String input = "4";
        String expected = "Тебя вернули домой. Победа!";
        String result = gameService.displayResult(input);
        assertEquals(expected, result);
    }
}
