package game;

import logic.RenderingConsole;
import model.GameModel;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Game {

    static Scanner scanner = new Scanner(System.in);
    static boolean checkGame;

    public static void run() {

        checkGame = true;

        while (checkGame) {

            RenderingConsole.printMainMenu();
            RenderingConsole.printInput();
            scanner = new Scanner(System.in);
            try {
                switch (scanner.nextInt()) {
                    case 1 -> caseOne();
                    case 2 -> caseTwo();
                    case 3 -> caseThree();
                    case 4 -> caseFour();
                }
            } catch (InputMismatchException e) {
                RenderingConsole.printInvalidInput();
            }

        }

        System.out.println("Игра закрылась"); // log info
    }


    private static void caseOne() {
        RenderingConsole.printChoosePlayerName();
        RenderingConsole.printInput();
        GamePlayer.run(new Scanner(System.in).nextLine(), 0);
    }

    private static void caseTwo() {
        RenderingConsole.printPlayerList(GameModel.getPlayerList());
        RenderingConsole.printInput();
        GamePlayer.run(null, new Scanner(System.in).nextInt());

    }

    private static void caseThree() {
        RenderingConsole.printLeaderBoard(GameModel.getPlayerList());
    }

    private static void caseFour() {
        checkGame = false;
    }


}
