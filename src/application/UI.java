package application;

import chess.ChessPieace;

public class UI {
    public static void printBoard(ChessPieace[][] pieaces){

        for (int i = 0; i <pieaces.length; i++){
            System.out.print((8 - i) + " ");
            for (int j = 0; j < pieaces.length; j++){
                printPiece(pieaces[i][j]);
            }
            System.out.println();
        }
        System.out.println("  a b c d e f g h");

    }

    private static  void printPiece(ChessPieace pieace){
        if (pieace == null){
            System.out.print("-");
        }
        else {
            System.out.print(pieace);
        }
        System.out.print(" ");
    }

}
