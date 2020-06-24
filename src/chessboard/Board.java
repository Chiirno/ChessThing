/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chessboard;

import static chessboard.ChessBoard.board;

/**
 *
 * @author Chiruno
 */
public class Board {

    private static Piece[][] board;

    final int X_POSITIONS = 8, Y_POSITIONS = 8;
    public int column, row;

    public Board() {
        board = new Piece[8][8];
        board[0][0] = new Rook(true, 0, 0);
        board[0][1] = new Knight(true, 0, 1);
        board[0][2] = new Bishop(true, 0, 2);
        board[0][3] = new Queen(true, 0, 3);
        board[0][4] = new King(true, 0, 4);
        board[0][5] = new Bishop(true, 0, 5);
        board[0][6] = new Knight(true, 0, 6);
        board[0][7] = new Rook(true, 0, 7);

        for (int i = 0; i < 8; i++) {
            board[1][i] = new Pawn(true, 1, i);
        }

        board[7][0] = new Rook(false, 7, 0);
        board[7][1] = new Knight(false, 7, 1);
        board[7][2] = new Bishop(false, 7, 2);
        board[7][3] = new Queen(false, 7, 3);
        board[7][4] = new King(false, 7, 4);
        board[7][5] = new Bishop(false, 7, 5);
        board[7][6] = new Knight(false, 7, 6);
        board[7][7] = new Rook(false, 7, 7);

        for (int i = 0; i < 8; i++) {
            board[6][i] = new Pawn(false, 6, i);
        }
    }

    public void display() {
        for (int row = 0; row < board.length; row++) {
            String tempRow = "row " + (8 - row) + ": ";
            for (int col = 0; col < board.length; col++) {
                if (board[row][col] == null) {
                    tempRow += '\u2001';
                } else {
                    tempRow += board[row][col].imageMethod();
                }
            }
            System.out.println(tempRow);
        }
        System.out.println("      " + '\u2005' + "a" + '\u2002'
                + "b" + '\u2002' + "c" + '\u2002'
                + "d" + '\u2002' + "e" + '\u2002'
                + "f" + '\u2002' + "g" + '\u2002' + "h");

        System.out.println("___________________________");
    }

    public int letterNumber(char col) {return col - 96;}

    public int[] toArray(int[] chessCoords) {
        int[] arrayCoords = {8 - chessCoords[1], chessCoords[0] - 1};
        return arrayCoords;
    }

    public void movePiece(int col, int row, int destCol, int destRow) {
        
        int[] Start = toArray(new int[]{col, row});
        int[] End = toArray(new int[]{destCol, destRow});
        
        board[End[0]][End[1]] = board[Start[0]][Start[1]];
        board[Start[0]][Start[1]] = null;
        System.out.println("");
        int numb = 'b';
        System.out.println(numb);
    }

}
