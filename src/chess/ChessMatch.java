package chess;

import boardgame.Board;
import boardgame.Position;
import chess.chess.piece.King;
import chess.chess.piece.Rook;

public class ChessMatch {
    private Board board;

    public ChessMatch(){
        board = new Board(8, 8);
        initialSetup();
    }

    public ChessPieace[][] getPieces(){
        ChessPieace[][] mat = new ChessPieace[board.getRows()][board.getColumns()];
        for (int i = 0; i < board.getRows(); i++){
            for (int j = 0; j < board.getColumns(); j++){
                mat[i][j] = (ChessPieace) board.piece(i, j);
            }
        }
        return mat;
    }

    private void placeNewPiece(char column, int row, ChessPieace piece){
        board.placePiece(piece, new ChessPosition(column, row).toPosition());
    }

    private void initialSetup(){
        placeNewPiece('b', 6, new Rook(board, Color.WHITE));
        placeNewPiece('e', 8, new Rook(board, Color.WHITE));
        placeNewPiece('e', 1, new Rook(board, Color.WHITE));

    }

}
