package Pieces;
public class PeiceFactory {
    public static Piece createPeice(String pieceType, boolean pieceColour) {

        switch (pieceType) {
            case "King":
                return new King(pieceColour);
            case "Queen":
                return new Queen(pieceColour);
            case "Bishop":
                return new Bishop(pieceColour);
            case "Knight":
                return new Knight(pieceColour);
            case "Rook":
                return new Rook(pieceColour);
            case "Pawn":
                return new Pawn(pieceColour);
            default:
                return null;

        }

    }

    
    
}
