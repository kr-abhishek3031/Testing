package Aug11;

public class player {
    private static String game;
    private String playerName;
    player (String gm, String playerName){
        this.game = gm;
        this.playerName = playerName;
    }
    public static String getGame(){
        return player.game;
    }
    public String getPlayerName(){
        return this.playerName;
    }
}
