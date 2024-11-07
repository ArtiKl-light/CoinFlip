package model;

import java.util.List;
import java.util.ArrayList;

public class Player {

    private final long startMoney = 10;

    private final int id;
    private String name;
    private List<Coin> coinList = new ArrayList<>();
    private long money;

    private static int idCount = 1;

    public Player(String name) {
        this.id = idCount++;
        this.name = name;
        this.money = startMoney;
    }


    public List<Coin> getCoinList() {
        return coinList;
    }

    public void addCoin(Coin coin) {
        coinList.add(coin);
    }

    public long getMoney() {
        return money;
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

    public int getId() {
        return id;
    }

}
