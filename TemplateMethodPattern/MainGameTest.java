package TemplateMethodPattern;

public class MainGameTest {
    public static void main(String[] args) {
        Game game = new FootballGame();
        game.play();
        System.out.println();
        game = new CarGame();
        game.play();
    }
}
