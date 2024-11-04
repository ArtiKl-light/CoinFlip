package game;

import logic.RenderingConsole;

import java.util.Scanner;

public class Game {

    static Scanner scanner = new Scanner(System.in);
    static boolean checkGame;

    public static void run() {

        checkGame = true;

        while (checkGame) {

            RenderingConsole.printMainMenu();
            RenderingConsole.printInput();
            switch (scanner.nextInt()) {
                case 1 -> caseOne();
                case 2 -> caseTwo();
                case 3 -> caseThree();
                case 4 -> caseFour();
            }

        }

        System.out.println("Игра закрылась"); // log info
    }



    private static void caseOne() {
        RenderingConsole.printChoosePlayerName();
        RenderingConsole.printInput();
        GamePlayer.run(new Scanner(System.in).nextLine());
    }

    private static void caseTwo() {
        RenderingConsole.printNull();
    }

    private static  void caseThree() {
        RenderingConsole.printNull();
    }

    private static void caseFour() {
        checkGame = false;
    }


}
