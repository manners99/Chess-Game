package Pieces;
public class Queen extends Piece {  

    public Queen(boolean colour) {
        this.isWhite = colour;
        if (this.isWhite) {
            this.pieceName = "wQ";
        } else {
            this.pieceName = "bQ";
        }
        this.pieceType = PieceType.QUEEN;
    }

}
