package ChessBoard;

import Pieces.Bishop;
import Pieces.King;
import Pieces.Knight;
import Pieces.Pawn;
import Pieces.Queen;
import Pieces.Rook;

public class ChessBoard {
    Space[][] spots;

    public ChessBoard() {
        this.setUpBoard();
    }
    
    public void setUpBoard() {

        spots[0][0] = new Space(new Rook(true), 0, 0);
        spots[0][1] = new Space(new Knight(true), 0, 1);
        spots[0][2] = new Space(new Bishop(true), 0, 2);
        spots[0][3] = new Space(new Queen(true), 0, 3);
        spots[0][4] = new Space(new King(true), 0, 4);
        spots[0][5] = new Space(new Bishop(true), 0, 5);
        spots[0][6] = new Space(new Knight(true), 0, 6);
        spots[0][7] = new Space(new Rook(true), 0, 7);

        spots[7][0] = new Space(new Rook(false), 7, 0);
        spots[7][1] = new Space(new Knight(false), 7, 1);
        spots[7][2] = new Space(new Bishop(false), 7, 2);
        spots[7][3] = new Space(new Queen(false), 7, 3);
        spots[7][4] = new Space(new King(false), 7, 4);
        spots[7][5] = new Space(new Bishop(false), 7, 5);
        spots[7][6] = new Space(new Knight(false), 7, 6);
        spots[7][7] = new Space(new Rook(false), 7, 7);
        

        for (int i = 0; i < 8; i++) {

            spots[1][i] = new Space(new Pawn(true), 6, i);
            spots[6][i] = new Space(new Pawn(false), 1, i);
        }

        for (int i = 2; i < 6; i++) {
            for (int j = 0; j < 8; j++) {
                spots[i][j] = new Space(null, i ,j);
            }
        }


        return;
    }
}
