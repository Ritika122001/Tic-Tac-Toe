
import java.util.List;

public class Game {

    private Board board;
    private List<Player> players;

    public Game(int size) {
        this.board = new Board(size);

    }

    public void startGame() {
        System.out.println("Starting the Game");
    }

    public Player switchPlayer(String pId) {
        return players.stream().filter((item) -> !item.getpId().equals(pId)).findFirst().orElse(null);
    }

    public List<Player> getPlayer() {
        return players;
    }

    public void setPlayer(List<Player> players) {
        this.players = players;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

}
