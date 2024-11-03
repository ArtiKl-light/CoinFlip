package logic;

public class RenderingConsole {

    public static void printInput() {
        System.out.print("Ввод: ");
    }


    public static void printMainMenu() {

        System.out.println(
                "~~~~~~ Menu ~~~~~~ \n" +
                " 1) Начать игру    \n" +
                " 2) Загрузить игру \n" +
                " 3) Список лидеров \n" +
                 "4) Выйти из игры    " +
                "~~~~~~~~~~~~~~~~~~   ");
    }

    public static void printNull() {
        System.out.println("Пока пусто");
    }

    public static void printChoosePlayerName() {
        System.out.println("Задайте имя игроку");
    }
}
