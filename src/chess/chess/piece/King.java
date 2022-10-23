package chess.chess.piece;

import boardgame.Board;
import chess.ChessPieace;
import chess.Color;

public class King extends ChessPieace {
    public King(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString(){
        return "K";
    }

}
