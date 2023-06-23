package Players;
public abstract class Player {

    protected boolean isTurn;
    protected boolean inCheck = false;
    protected boolean inCheckMate = false;
    protected boolean inStaleMate = false;
    protected boolean canCastle = true;
    protected String name;
    
    public void changeTurn() {
        if (this.isTurn) {
            this.isTurn = false;
        } else {
            this.isTurn = true;
        }
    }

    public String getName() {
        return name;
    }

    public boolean getTurn() {
        return isTurn;
    }
    
}