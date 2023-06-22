package Pieces;
public class Knight extends Piece{

    public Knight(Boolean pieceColour) {
        this.isWhite = pieceColour;
        if (this.isWhite) {
            this.pieceName = "wN";
        } else {
            this.pieceName = "bN";
        }
    } 
}
