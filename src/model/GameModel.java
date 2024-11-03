package model;

import java.util.ArrayList;
import java.util.List;

public class GameModel {

    private List<Player> playerList = new ArrayList<>();

    public void addPlayerToList(Player player) {
        playerList.add(player);
    }

    public Player getPlayerFromList(String playerName) {
        return playerList.stream()
                .filter(player -> player.getName().equals(playerName))
                .findFirst()
                .orElse(null);
    }

    public List<Player> getPlayerList() {
        return playerList;
    }

}
