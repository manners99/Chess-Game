package Pieces;

import Players.Player;

public abstract class Piece {

    protected boolean isWhite;
    protected String pieceName;
    protected PieceType pieceType;
    protected Player colour;

    
    public void move(){
        throw new UnsupportedOperationException("Unimplemented method 'move'");
    }

    public void capture(){
        throw new UnsupportedOperationException("Unimplemented method 'capture'");
    }

    public boolean getColour(){
        return this.isWhite;
    }
     
    @Override
    public String toString(){
        return this.getSimpleName();
    }

    public String getSimpleName(){
        return this.pieceName;
    }

    public PieceType getPieceType(){
        return this.pieceType;
    }
}
