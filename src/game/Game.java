package game;

import logic.RenderingConsole;
import model.Player;

import java.util.Scanner;

public class Game {

    Scanner scanner = new Scanner(System.in);
    boolean checkGame;

    public void run() {

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
    }



    private void caseOne() {
        RenderingConsole.printChoosePlayerName();
        RenderingConsole.printInput();
        GamePlayer.run(scanner.nextLine());
    }

    private void caseTwo() {
        RenderingConsole.printNull();
    }

    private void caseThree() {
        RenderingConsole.printNull();
    }

    private void caseFour() {
        System.exit(0);
    }


}
