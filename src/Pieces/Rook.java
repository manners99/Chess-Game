package Pieces;

public class Rook extends Piece {

    public Rook(boolean colour) {
        this.isWhite = colour;
        if (this.isWhite) {
            this.pieceName = "wR";
        } else {
            this.pieceName = "bR";
        }
    }
   
}
