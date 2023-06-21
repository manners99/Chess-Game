package Pieces;
public class Knight implements Piece{

    private String colour;

    public Knight(String pieceColour) {
        this.colour = pieceColour;
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
