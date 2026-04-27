import java.util.Random;

public class TicTacToe {
    static char[][] board = new char[3][3];
    static char userSymbol, computerSymbol;
    static boolean userTurn;

    public static void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    public static void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void toss() {
        Random random = new Random();
        int toss = random.nextInt(2);

        if (toss == 0) {
            userSymbol = 'X';
            computerSymbol = 'O';
            userTurn = true;
            System.out.println("User won toss");
        } else {
            userSymbol = 'O';
            computerSymbol = 'X';
            userTurn = false;
            System.out.println("Computer won toss");
        }
    }

    public static void main(String[] args) {
        initializeBoard();
        toss();
        printBoard();
    }
}