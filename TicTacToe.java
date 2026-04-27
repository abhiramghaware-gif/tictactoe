import java.util.Scanner;
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

    public static int userInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter position (1-9): ");
        return sc.nextInt();
    }

    public static int[] getPosition(int position) {
        int row = (position - 1) / 3;
        int col = (position - 1) % 3;
        return new int[]{row, col};
    }

    public static boolean isValidMove(int row, int col) {
        return row >= 0 && row < 3 &&
               col >= 0 && col < 3 &&
               board[row][col] == '-';
    }

    public static void placeMove(int row, int col, char symbol) {
        board[row][col] = symbol;
    }

    public static void main(String[] args) {
        initializeBoard();
        toss();
        printBoard();
    }
}