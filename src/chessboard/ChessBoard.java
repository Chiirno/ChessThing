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
        
        board.display();
        
        Driver cbd = new Driver();
        

        do {

            cbd.main(args);

        } while (true);

    }

}
