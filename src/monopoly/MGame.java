package monopoly;

public class MGame {
    private int roundCnt;
    private Die[] die;
    private Player[] players;
    private Board board;

    private static final int N = 20;

    public void playGame(){
        for (int roundCnt = 0; roundCnt < N; roundCnt++){
            playRound();
        }
    }

    private void playRound(){
        for (Player player: players){
            player.takeTurn();
        }
    }
}
