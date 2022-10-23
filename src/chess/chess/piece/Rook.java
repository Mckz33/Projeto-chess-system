package chess.chess.piece;

import boardgame.Board;
import chess.ChessPieace;
import chess.Color;

public class Rook extends ChessPieace {
    public Rook(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString(){
        return "R";
    }

}
