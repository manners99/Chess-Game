package Pieces;
public class Queen implements Piece {

    private String colour;
    

    public Queen(String colour) {
        this.colour = colour;
    }

    @Override
    public void move() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'move'");
    }

    @Override
    public void capture() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'capture'");
    }

    public String getColour() {
        return colour;
    }
    
}
