/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chessboard;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author Chiruno
 */
public class ChessBoard {

    public static Board board = new Board();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Pawn pawno = new Pawn(true, 6, 0);
        Knight knighto = new Knight(false, 6, 0);
        Bishop bishopo = new Bishop(true, 6, 0);
        Rook rooko = new Rook(false, 6, 0);
        Queen queeno = new Queen(true, 6, 0);
        King kingo = new King(false, 6, 0);

        //board.movePiece(3, 2, 1, 6);
        System.out.println(pawno.isLegalMove(5, 0));

        System.out.println(pawno);
        System.out.println(knighto);
        System.out.println(bishopo);
        System.out.println(rooko);
        System.out.println(queeno);
        System.out.println(kingo);
        
        board.display();
        
        Driver cbd = new Driver();
        

        do {

            cbd.main(args);

        } while (true);

    }

}
