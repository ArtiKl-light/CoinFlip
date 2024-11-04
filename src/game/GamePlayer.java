package game;


import logic.RenderingConsole;
import model.GameModel;
import model.Player;

import java.util.Scanner;

public class GamePlayer {

    private static boolean checkGame;

    public static void run(String playerName) {

        Scanner scanner = new Scanner(System.in);
        Player player = firstGetPlayer(playerName);
        checkGame = true;

        while (checkGame) {

            RenderingConsole.printPlayerMenu();
            RenderingConsole.printInput();
            switch (scanner.nextInt()) {
                case 1 -> caseOne();
                case 2 -> caseTwo();
                case 3 -> caseThree();
                case 4 -> caseFour();
            }

        }



    }

    private static void caseOne() {
        RenderingConsole.printNull();
    }

    private static void caseTwo() {
        RenderingConsole.printNull();
    }

    private static void caseThree() {
        RenderingConsole.printNull();
    }

    private static void caseFour() {
        checkGame = false;
    }





    private static Player firstGetPlayer(String playerName) {

        Player player;

        if (GameModel.getPlayerFromList(playerName) != null) {
            player = GameModel.getPlayerFromList(playerName);
        } else {
            player = new Player(playerName);
            GameModel.addPlayerToList(player);
        }

        return player;
    }
}
