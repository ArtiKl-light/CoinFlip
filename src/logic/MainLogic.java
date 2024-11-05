package logic;

import model.Coin;
import model.Player;

public class MainLogic {

    public static void convertCoinToMoney(Player player, int chooseCoinId) {

        Object[] arrayCoin = player.getCoinList().toArray();

        if (arrayCoin.length > chooseCoinId) {
            Coin coin = (Coin) arrayCoin[chooseCoinId];
            player.addMoney(coin.getValue());
            player.removeCoinFromList(coin);
            RenderingConsole.printConvertToMoney(player, coin);
        } else {
            RenderingConsole.printMoneyIsIdNou(chooseCoinId);
        }

    }

    public static void tossCoin(Player player) {

        if (player.getMoney() <= 0) {
            RenderingConsole.printMoneyIsLow(player);
        } else {

            player.removeMoney(1);
            Coin coin = new Coin();
            player.addCoin(coin);
            RenderingConsole.printWhoTossCoin(coin);

        }
    }

}