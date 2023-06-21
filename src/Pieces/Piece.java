package Pieces;
public abstract class Piece {

    protected boolean isWhite;
    
    public void move(){
        throw new UnsupportedOperationException("Unimplemented method 'move'");
    }

    public void capture(){
        throw new UnsupportedOperationException("Unimplemented method 'capture'");
    }

    public boolean getColour(){
        return this.isWhite;
    }
     
}
