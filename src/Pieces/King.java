package Pieces;
public class King extends Piece {

    public King(boolean pieceColour) {
        this.isWhite = pieceColour;
        if (this.isWhite) {
            this.pieceName = "wK";
        } else {
            this.pieceName = "bK";
        }
        this.pieceType = PieceType.KING;
    }
    
}
