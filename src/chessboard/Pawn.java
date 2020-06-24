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
    
    int[] chessCoords = {pieceLocCol + 1, 8 - pieceLocRow};

    @Override
    Boolean isLegalMove(int col, int row) {
        return true;
    }

    @Override
    char imageMethod() {
        if (pieceColour) {return '\u2659';} else {return '\u265F';}
    }
    
    // true means WHITE
    public boolean getChar() {
        return pieceColour;
    }
    
    public int[] getChessCoords() {
        return chessCoords;
    }
    
    
    
    public String toString() {
        return " " + getChessCoords()[0] + " and " + getChessCoords()[1];
    }
    
    
}