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
public class Rook extends Piece {

    
    public Rook(boolean pieceColour, int pieceLocRow, int pieceLocCol) {
        super(pieceColour, pieceLocRow, pieceLocCol);
        
    }
    
    @Override
    Boolean isLegalMove(int row, int col) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    char imageMethod() {
        if (pieceColour) {return '\u2656';} else {return '\u265C';}
    }
    
    @Override
    public String toString() {
        return "Rook: " + imageMethod();
    }
    
}
