package Aug11;
/*
Create a Team of players for football and cricket Indian teams and use generics
for adding players and getting players by name using array list
 */

import java.util.ArrayList;
import java.util.List;

public class teamMain {
    public static <T> List<T> addPlayer (List <T> currentPlayerList, T newPlayer){
        currentPlayerList.add(newPlayer);
        return currentPlayerList;
    }

    public static void main(String[] args) {
        List <cricketPlayer> cricketTeam = new ArrayList<>();
        cricketPlayer newCPlayer1 = new cricketPlayer("P1");
        List <cricketPlayer> updatedTeam = addPlayer(cricketTeam, newCPlayer1);

        System.out.println("Game ->" + cricketTeam.get(0).getGame() + "; Player Name -> " + cricketTeam.get(0).getPlayerName());

        List <cricketPlayer> footballTeam = new ArrayList<>();
        cricketPlayer newFPlayer1 = new cricketPlayer("P2");
        List <cricketPlayer> updatedFootballTeam = addPlayer(footballTeam, newFPlayer1);
        System.out.println("Game ->" + footballTeam.get(0).getGame() + "; Player Name -> "+ footballTeam.get(0).getPlayerName());
    }
}


