package model;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private List<Coin> coinList = new ArrayList<>();
    private long money;

    //todo решить как что реализовать




    public List<Coin> getCoinList() {
        return coinList;
    }

    public void setCoinList(List<Coin> coinList) {
        this.coinList = coinList;
    }

    public long getMoney() {
        return money;
    }

    public void setMoney(long money) {
        this.money = money;
    }

}
