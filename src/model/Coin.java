package model;

import java.util.Date;
import java.util.Random;

public class Coin {

    private final int value;
    private final RoleCoin rarity;

    public Coin() {
        this.value = generateRandomCoinValue();
        this.rarity = generateRoleFromValue(value);
    }


    private RoleCoin generateRoleFromValue(int value) {

        if (value < 5) {
            return RoleCoin.COMMON;
        } else if (value < 10) {
            return RoleCoin.RARE;
        } else if (value < 15) {
            return RoleCoin.MYTHICAL;
        } else {
            return RoleCoin.LEGENDARY;
        }

    }

    private int generateRandomCoinValue() {

        Random random = new Random();

        int randomValue = random.nextInt(100);

        if (randomValue < 40) {
            return random.nextInt(5) + 1;
        } else if (randomValue < 60) {
            return random.nextInt(10) + 1;
        } else if (randomValue < 80) {
            return random.nextInt(15) + 1;
        } else {
            return random.nextInt(20) + 1;
        }

    }

    public int getValue() {
        return value;
    }

    public RoleCoin getRarity() {
        return rarity;
    }

}
