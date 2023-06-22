package Pieces;
public abstract class Piece {

    protected boolean isWhite;
    protected String pieceName;
    
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
}
