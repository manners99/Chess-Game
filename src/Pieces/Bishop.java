package Pieces;
public class Bishop extends Piece {

    public Bishop(boolean pieceColour) {
        this.isWhite = pieceColour;
        if (this.isWhite) {
            this.pieceName = "wB";
        } else {
            this.pieceName = "bB";    
        }
        this.pieceType = PieceType.BISHOP;
    }
   
}
