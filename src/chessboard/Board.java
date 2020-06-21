/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chessboard;

/**
 *
 * @author Chiruno
 */
public class Board {

    private final char[][] board;
    private static Piece[][] newBrd;

    final int X_POSITIONS = 8, Y_POSITIONS = 8;
    public int column, row;

    public Board() {
        board = new char[8][8];
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                board[row][col] = startingPiece(row, col);
            }
        }
    }

    
    public void newBoard() {
        newBrd = new Piece[8][8];
        newBrd[0][0] = new Rook(true, 0, 0);
        newBrd[0][1] = new Knight(true, 0, 1);
        newBrd[0][2] = new Bishop(true, 0, 2);
        newBrd[0][3] = new Queen(true, 0, 3);
        newBrd[0][4] = new King(true, 0, 4);
        newBrd[0][5] = new Bishop(true, 0, 5);
        newBrd[0][6] = new Knight(true, 0, 6);
        newBrd[0][7] = new Rook(true, 0, 7);
        
        for(int i = 0; i < 8; i++) {
            newBrd[1][i] = new Pawn(true, 1, i);
        }
        
        newBrd[7][0] = new Rook(false, 7, 0);
        newBrd[7][1] = new Knight(false, 7, 1);
        newBrd[7][2] = new Bishop(false, 7, 2);
        newBrd[7][3] = new Queen(false, 7, 3);
        newBrd[7][4] = new King(false, 7, 4);
        newBrd[7][5] = new Bishop(false, 7, 5);
        newBrd[7][6] = new Knight(false, 7, 6);
        newBrd[7][7] = new Rook(false, 7, 7);
        
        for(int i = 0; i < 8; i++) {
            newBrd[6][i] = new Pawn(false, 6, i);
        }
    }
    
    
   

    public void display() {
        for (int row = 0; row < board.length; row++) {
            String tempRow = "row " + (8 - row) + ": ";
            for (int col = 0; col < board.length; col++) {
                tempRow += board[row][col];
            }
            System.out.println(tempRow);
        }
        System.out.println("      " + '\u2005' + "a" + '\u2002' + 
                "b" + '\u2002' + "c" + '\u2002' +  
                "d" + '\u2002' + "e" + '\u2002' +  
                "f" + '\u2002' +  "g" + '\u2002' +  "h");
        
        newBoard();
        System.out.println(newBrd[6][3].imageMethod());
    }

    
    public int letterNumber(char col) {
        switch(col) {
            case 'a': return 1;
            case 'b': return 2;
            case 'c': return 3;
            case 'd': return 4;
            case 'e': return 5;
            case 'f': return 6;
            case 'g': return 7;
            case 'h': return 8;
            default: return 0;
        }
    }
    
    public int[] toArray(int[] chessCoords) {
        int[] arrayCoords = {8 - chessCoords[1], chessCoords[0] - 1};
        return arrayCoords;
    }

    public void movePiece(int col, int row, int destCol, int destRow) {

        int[] arrayCoords = toArray(new int[] {col, row});
        int[] destArrayCoords = toArray(new int[] {destCol, destRow});
        
        board[destArrayCoords[0]][destArrayCoords[1]] = board[arrayCoords[0]][arrayCoords[1]];
        board[arrayCoords[0]][arrayCoords[1]] = '\u2001';
        System.out.println("");
        display();
    }

    public char startingPiece(int row, int col) {
        switch (row) {
            case 1:
                return '\u2659';
            case 6:
                return '\u265F';

            case 0:
                switch (col) {
                    case 0:
                        return '\u2656';
                    case 1:
                        return '\u2658';
                    case 2:
                        return '\u2657';
                    case 3:
                        return '\u2655';
                    case 4:
                        return '\u2654';
                    case 5:
                        return '\u2657';
                    case 6:
                        return '\u2658';
                    case 7:
                        return '\u2656';
                }
            case 7:
                switch (col) {
                    case 0:
                        return '\u265C';
                    case 1:
                        return '\u265E';
                    case 2:
                        return '\u265D';
                    case 3:
                        return '\u265B';
                    case 4:
                        return '\u265A';
                    case 5:
                        return '\u265D';
                    case 6:
                        return '\u265E';
                    case 7:
                        return '\u265C';
                }
            default:
                return '\u2001';

        }
    }

}
