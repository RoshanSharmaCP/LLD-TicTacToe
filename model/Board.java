package model;
import java.util.List;
import java.util.ArrayList;

public class Board {
    public int size;
    public PlayingPiece[][] board;
    public Board(int size) {
        this.size = size;
        board = new PlayingPiece[size][size];
    }

    public void displayBoard() {
        for(int i=0; i<size; i++)
        {
            for(int j =0; j<size; j++)
            {
                if(board[i][j] != null)
                {
                    System.out.print(board[i][j].pieceType.name()+ " ");
                }
                else{
                    System.out.print(" ");
                }
                System.out.print(" | ");
            }
            System.out.println();
        }

    }
    public List<Pair> getFreeCells() {
        List<Pair> freeCells = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] == null) {
                    Pair rowColumn = new Pair(i, j);
                    freeCells.add(rowColumn);
                }
            }
        }

        return freeCells;
    }

    public boolean addPiece(int row, int column, PlayingPiece playingPiece) {

        if(board[row][column] != null) {
            return false;
        }
        board[row][column] = playingPiece;
        return true;
    }
}
