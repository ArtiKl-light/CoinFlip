package model;

import java.util.ArrayList;
import java.util.List;

public class GameModel {

    private static final List<Player> playerList = new ArrayList<>();

    public static void addPlayerToList(Player player) {
        playerList.add(player);
    }

    public static Player getPlayerFromList(int id) {
        return playerList.stream()
                .filter(player -> player.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public static List<Player> getPlayerList() {
        return playerList;
    }

}
