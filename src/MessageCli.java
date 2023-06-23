public enum MessageCli {
    INVALID_MOVE_IMPUT("Error! Invalid move input"),
    SPACE_IS_EMPTY("Error! There is no piece at %s"),
    ROOK_MOVE_ERROR("Error! Rooks can only move horizontally or vertically"),
    BISHOP_MOVE_ERROR("Error! Bishops can only move diagonally"),
    KNIGHT_MOVE_ERROR("Error! Knights can only move in an L shape"),
    QUEEN_MOVE_ERROR("Error! Queens can only move horizontally, vertically or diagonally"),
    KING_MOVE_ERROR("Error! Kings can only move one space in any direction"),
    PAWN_MOVE_ERROR("Error! Pawns can only move one space forward, or two spaces forward on their first move, unless taking a piece"),
    MOVING_INTO_CHECK("You cannot move into check"),
    EXPOSING_CHECK("Error! You cannot expose your king to check"),
    CANT_TAKE_OWN_PIECE("Error! You cannot take your own piece"),
    CANT_MOVE_OPPONENT_PIECE("Error! You cannot move your opponent's piece"),
    CANT_MOVE_THROUGH_PIECE("Error! You cannot move through a piece"),
    COMMAND_NOT_RECOGNISED("Error! Command not recognised"),
    WRONG_NUMBER_OF_ARGUMENTS("Error! Wrong number of arguments"),
    END_OF_GAME("Game over, %s wins"),
    PIECE_TAKEN("%s takes %s's %s"),
    PIECE_MOVED("%s moves %s from %s to %s"),
    PIECE_PROMOTED("%s promotes %s to %s"),
    PIECE_MOVED_CHECK("%s moves %s from %s to %s, check");

    private final String message;

    private MessageCli(final String message) {
        this.message = message;
    }
    
}
