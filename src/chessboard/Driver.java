/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chessboard;

import static chessboard.ChessBoard.board;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Chiruno
 */
public class Driver {


    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        System.out.print("Enter 4 numbers separated by spaces\n");
        String a = kb.nextLine();
        String[] aSplit = a.split("\\s+");


        int x1 = board.letterNumber(aSplit[0].charAt(0));
        int y1 = Character.getNumericValue(aSplit[0].charAt(1));

        int x2 = board.letterNumber(aSplit[1].charAt(0));
        int y2 = Character.getNumericValue(aSplit[1].charAt(1));

        
        
        
        board.movePiece(x1, y1, x2, y2);
        board.display();
    }

}
