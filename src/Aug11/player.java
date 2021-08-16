package Aug11;

public class player {
    private static String game;
    private String playerName;
    player (String gm, String playerName){
        this.game = gm;
        this.playerName = playerName;
    }
    public static String getGame(){
        //cricketPlayer cp1 = new cricketPlayer("hell");
        //playerName = "hello";
        return game;
    }
    public String getPlayerName(){
        return this.playerName;
    }
}
