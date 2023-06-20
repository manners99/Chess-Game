public abstract class Player {

    protected boolean isTurn;
    protected boolean inCheck = false;
    protected boolean inCheckMate = false;
    protected boolean inStaleMate = false;
    protected boolean canCastle = true;
    protected String name;

    public String getName() {
        return name;
    }
    
}
