package model;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private final long startMoney = 10;

    private String name;
    private List<Coin> coinList = new ArrayList<>();
    private long money;

    public Player(String name) {
        this.name = name;
        this.money = startMoney;
    }


    public void getCoinList() {
        for (Coin c : coinList) {
            System.out.print(c.getRarity() + " " + c.getValue() + " | ");
        }
    }

    public void dropCoinList() {
        this.coinList = null;
    }

    public void addCoin(Coin coin) {
        coinList.add(coin);
    }

    public long getMoney() {
        return money;
    }

    public void dropMoney() {
        this.money = 0;
    }

    public void addMoney(long money) {
        this.money += money;
    }

    public void removeMoney(long money) {
        this.money -= money;
    }

    public void removeCoinFromList(Coin coin) {
        coinList.remove(coin);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
