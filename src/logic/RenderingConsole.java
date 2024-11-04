package logic;

public class RenderingConsole {

    public static void printInput() {
        System.out.print("Ввод: ");
    }


    public static void printMainMenu() {

        System.out.println(
                """
                        ~~~~~~ Menu ~~~~~~      \s
                         1) Начать игру         \s
                         2) Загрузить игру      \s
                         3) Список лидеров      \s
                        4) Выйти из игры        \s
                        ~~~~~~~~~~~~~~~~~~      \s
                """);
    }

    public static void printNull() {
        System.out.println("Пока пусто");
    }

    public static void printChoosePlayerName() {
        System.out.println("Задайте имя игроку");
    }

    public static void printPlayerMenu() {
        System.out.println(
                """
                        ~~~~~~~~~ Player Menu ~~~~~~~      \s
                         1) Бросить монетку (цена 1)       \s
                         2) Список монет                   \s
                         3) Обменник                       \s
                         4) Выйти в главное меню           \s
                        ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~      \s
                 """);
    }
}
