package model;

import java.util.ArrayList;
import java.util.List;

public class GameModel {

    private static List<Player> playerList = new ArrayList<>();

    public static void addPlayerToList(Player player) {
        playerList.add(player);
    }

    public static Player getPlayerFromList(String playerName) {
        return playerList.stream()
                .filter(player -> player.getName().equals(playerName))
                .findFirst()
                .orElse(null);
    }

    public static List<Player> getPlayerList() {
        return playerList;
    }

}
