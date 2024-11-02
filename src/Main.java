import model.Coin;
import model.Player;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Player player = new Player();
        player.addMoney(10);
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("1) Крутить коины - 1 монета");
            System.out.println("2) Количество монет");
            System.out.println("3) Список коинов");
            System.out.println("4) Закончить игру");

            System.out.print("Ввод: ");
            int choice = sc.nextInt();
            System.out.println();

            switch (choice) {
                case 1: {
                    player.removeMoney(1);
                    Coin coin = new Coin();
                    player.addCoin(coin);
                    System.out.println("Выпала редкость - " + coin.getRarity() + " , цена - " + coin.getValue());
                }
                case 2: {
                    System.out.println("Кол-во монет: " + player.getMoney());
                }
                case 3: {
                    System.out.print("Список ваших коинов: ");
                    player.getCoinList();
                    System.out.println();
                }
                case 4: {
                    break;
                }

            }

        }


    }
}