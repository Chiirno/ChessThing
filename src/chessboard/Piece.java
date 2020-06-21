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
public abstract class Piece {

    boolean pieceColour;
    int pieceLocRow;
    int pieceLocCol;

    abstract Boolean isLegalMove(int row, int col);

    public Piece(boolean pieceColour, int pieceLocRow, int pieceLocCol) {
        
        this.pieceColour = pieceColour;
        this.pieceLocRow = pieceLocRow;
        this.pieceLocCol = pieceLocCol;

    }
    
    abstract char imageMethod();

}