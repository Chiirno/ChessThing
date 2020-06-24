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
public class Pawn extends Piece {

    public Pawn(boolean pieceColour, int pieceLocRow, int pieceLocCol) {
        super(pieceColour, pieceLocRow, pieceLocCol);

    }
    

    
    // Setters & Getters
    @Override
    public void setRow(int newRow) {
        this.pieceLocRow = newRow;
    }
    
    @Override
    public void setCol(int newCol) {
        this.pieceLocCol = newCol;
    }
    
    @Override
    public int getRow() {
        return this.pieceLocRow;
    }
    

    @Override
    public int getCol() {
        return this.pieceLocCol;
    }
    
    @Override
    boolean isLegalMove(int col, int row, int destCol, int destRow) {
        return (destCol - col == 0 && destRow - row == 1);
    }

    @Override
    char imageMethod() {
        if (pieceColour) {
            return '\u2659';
        } else {
            return '\u265F';
        }
    }

    // true means WHITE
    public boolean getChar() {
        return pieceColour;
    }

    public String toString() {
        return "hi";
    }

}
