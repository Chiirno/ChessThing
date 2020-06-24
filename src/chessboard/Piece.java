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

    abstract boolean isLegalMove(int col, int row, int destCol, int destRow);

    public Piece(boolean pieceColour, int pieceLocRow, int pieceLocCol) {

        this.pieceColour = pieceColour;
        this.pieceLocRow = pieceLocRow;
        this.pieceLocCol = pieceLocCol;

    }

    abstract char imageMethod();

    public abstract void setRow(int destRow);
    public abstract void setCol(int destRow);
    public abstract int getRow();
    public abstract int getCol();

}
