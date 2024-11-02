package logic;

import model.Coin;
import model.Player;

public class Converter extends Player {

    public void convertCoinToMoney(Coin coin) {
        addMoney(coin.getValue());
    }

}
