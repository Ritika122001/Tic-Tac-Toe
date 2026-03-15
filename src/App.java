
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Tic Tac Toe Game!");
        System.out.println("Please enter the size of board ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        System.out.println("Creating the board !!");
        Game game = new Game(size);
        System.out.println("Assigning random 2 players");
        Player p1 = new Player("Ritu", Symbol.X, "p1");
        Player p2 = new Player("Ayush", Symbol.O, "p2");
        System.out.println("First Player" + p1);
        System.out.println("Second Player" + p2);
        List<Player> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        game.setPlayer(list);
        game.startGame();
        Board board = game.getBoard();
        Player p = p1;
        while (true) {
            System.out.println("Enter the row , column and symbol for Player" + p.getName());
            int r = sc.nextInt();
            int c = sc.nextInt();

            boolean valid = board.placeMove(r, c, p.getSymbol());

            if (!valid) {
                System.out.println("Cell already occupied!!");
                continue;
            }

            if (board.checkWinner(r, c, p.getSymbol())) {
                System.out.println("Player " + p.getName() + "wins the game");
                break;
            }

            if (board.isDraw()) {
                System.out.println("Draw happended!!!");
                break;
            }

            board.printBoard();
            p = game.switchPlayer(p.getpId());

        }

    }
}
