package Pieces;
public abstract class Piece {

    protected String colour;
    
    public void move(){
        throw new UnsupportedOperationException("Unimplemented method 'move'");
    }

    public void capture(){
        throw new UnsupportedOperationException("Unimplemented method 'capture'");
    }

    public String getColour(){
        return this.colour;
    }
     
}
