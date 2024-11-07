package game;


import logic.MainLogic;
import logic.RenderingConsole;
import model.GameModel;
import model.Player;

import java.util.Scanner;

public class GamePlayer {

    private static boolean checkGame;
    private static Scanner scanner;
    private static Player player;

    public static void run(String playerName, Integer id) {

        player = firstGetPlayer(id, playerName);
        checkGame = true;

        while (checkGame) {

            RenderingConsole.printPlayerMenu(player);
            RenderingConsole.printInput();
            scanner = new Scanner(System.in);
            switch (scanner.nextInt()) {
                case 1 -> caseOne(player);
                case 2 -> caseTwo();
                case 3 -> caseThree(player);
                case 4 -> caseFour();
            }

        }


    }

    private static void caseOne(Player player) {
        MainLogic.tossCoin(player);
    }

    private static void caseTwo() {
        RenderingConsole.printCoinList(player.getCoinList());
    }

    private static void caseThree(Player player) {
        RenderingConsole.printWhoChooseMoney();
        RenderingConsole.printInput();
        scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        MainLogic.convertCoinToMoney(player, choice);
    }

    private static void caseFour() {
        checkGame = false;
    }


    private static Player firstGetPlayer(Integer id, String playerName) {

        Player player;

        if (id != null && GameModel.getPlayerFromList(id) != null) {
            player = GameModel.getPlayerFromList(id);
        } else {
            player = new Player(playerName);
            GameModel.addPlayerToList(player);
        }

        return player;
    }
}
