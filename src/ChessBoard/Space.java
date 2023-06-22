package ChessBoard;

import Pieces.Piece;

public class Space {
    
    private Piece piece;
    private int X;
    private int Y;

    public Space(Piece piece, int X, int Y) {
        this.piece = piece;
        this.X = X;
        this.Y = Y;
    }
    
    @Override
    public String toString() {
        if (this.piece == null) {
            return "  ";
        } else {
            return this.piece.toString();
        }
    }

    public Piece getPiece() {
        return this.piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public int getX() {
        return this.X;
    }

    public void setX(int x) {
        this.X = x;
    }

    public int getY() {
        return this.Y;
    }

    public void setY(int y) {
        this.Y = y;
    }
    
}
