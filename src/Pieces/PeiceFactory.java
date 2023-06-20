package Pieces;
public class PeiceFactory {
    public static Piece createPeice(String pieceType, String poieceColour) {

        switch (pieceType) {
            case "King":
                return new King(pieceColour);
            case "Queen":
                return new Queen(peiceColour);
            case "Bishop":
                return new Bishop(peiceColour);
            case "Knight":
                return new Knight(peiceColour);
            case "Rook":
                return new Rook(peiceColour);
            case "Pawn":
                return new Pawn(pieceColour);
            default:
                return null;

        }

    }

    
    
}
