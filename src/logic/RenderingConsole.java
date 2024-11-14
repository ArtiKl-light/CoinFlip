
package logic;

import model.Coin;
import model.Player;

import java.util.List;

public class RenderingConsole {

    public static void printInput() {
        System.out.print("Ввод: ");
    }


    public static void printMainMenu() {

        System.out.println(
                """
                                                        \s
                                ~~~~~~ Menu ~~~~~~      \s
                                1) Начать игру          \s
                                2) Загрузить игру       \s
                                3) Список лидеров       \s
                                4) Выйти из игры        \s
                                ~~~~~~~~~~~~~~~~~~      \s
                        """);
    }

    public static void printChoosePlayerName() {
        System.out.println("Задайте имя игроку");
    }

    public static void printPlayerMenu(Player player) {
        System.out.print(
                """
                                                                  \s
                               ~~~~~~~~~ Player Menu ~~~~~~~      \s
                                1) Бросить монетку (цена 1)       \s
                                2) Список монет                   \s
                                3) Обменник                       \s
                                4) Выйти в главное меню           \s
                        """);
        System.out.println(
                "           | Баланс - " + player.getMoney() + " | " + player.getName() +
                        " |\n       ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~      \n");
    }

    public static void printWhoTossCoin(Coin coin) {
        System.out.printf("\n Выпала %s монетка ценой %s деняк! \n", coin.getRarity(), coin.getValue());
    }

    public static void printMoneyIsLow(Player player) {
        System.out.println("\n Недостаточно денег, ваш баланс - " + player.getMoney());
    }

    public static void printConvertToMoney(Player player, Coin coin) {
        System.out.printf("Вы обменяли монетку %s ценой %s, теперь ваш баланс %s \n", coin.getRarity(), coin.getValue(), player.getMoney());
    }

    public static void printWhoChooseMoney() {
        System.out.println("Какую монетку хотите обменять?");
    }

    public static void printMoneyIsIdNou(int id) {
        System.out.printf("Монеты под номером %s нет! \n", id);
    }

    public static void printCoinList(List<Coin> coinList) {
        int temp = 0;
        if (!coinList.isEmpty()) {
            for (Coin coin : coinList) {
                System.out.println(temp++ + " | Редкость " + coin.getRarity() + ", цена " + coin.getValue());
            }
        } else {
            System.out.println("\n | У вас нет ни одной монетки!");
        }
    }

    public static void printPlayerList(List<Player> playerList) {
        for (Player player : playerList) {
            System.out.println(player.getId() + " | " + player.getName() + " | " + player.getMoney());
        }
    }

    public static void printLeaderBoard(List<Player> playerList) {

        List<Player> sortedList = playerList;

        sortedList.sort(new ComparatorByMoney());

        System.out.println("~~~ Таблица лидеров ~~~");
        for (Player player : sortedList) {
            System.out.println(player.getMoney() + " | Имя - " + player.getName());
        }

    }

    public static void printInvalidInput() {
        System.out.println("\n Неверный ввод");
    }

}
