package logic;

import model.Coin;
import model.Player;

public class Converter {

    public void convertCoinToMoney(Player player, Coin coin) {
        player.addMoney(coin.getValue());
        player.removeCoinFromList(coin);
    }

}