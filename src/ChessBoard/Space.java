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

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public int getX() {
        return X;
    }

    public void setX(int x) {
        X = x;
    }

    public int getY() {
        return Y;
    }

    public void setY(int y) {
        Y = y;
    }
    
}
