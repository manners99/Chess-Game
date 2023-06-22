package Pieces;
public class Pawn extends Piece {

    public Pawn(Boolean pieceColour) {
        this.isWhite = pieceColour;
        if (this.isWhite) {
            this.pieceName = "wP";
        } else {
            this.pieceName = "bP";
        }
    }
 
}
