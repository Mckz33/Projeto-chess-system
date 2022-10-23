package chess;

import boardgame.Board;
import boardgame.Piece;

public class ChessPieace extends Piece {

    private Color color;

    public ChessPieace(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
