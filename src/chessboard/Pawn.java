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

    @Override
    Boolean isLegalMove(int row, int col) {
        return false;
    }

    @Override
    char imageMethod() {
        if (pieceColour) {return '\u2659';} else {return '\u265F';}
    }
    
    public boolean getChar() {
        return pieceColour;
    }
    
    
    public String toString() {
        return "Pawn: " + imageMethod();
    }
    
    
}