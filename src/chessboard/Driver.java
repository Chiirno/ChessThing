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

    public static int letterNumber(char col) {
        switch (col) {
            case 'a':
                return 1;
            case 'b':
                return 2;
            case 'c':
                return 3;
            case 'd':
                return 4;
            case 'e':
                return 5;
            case 'f':
                return 6;
            case 'g':
                return 7;
            case 'h':
                return 8;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        System.out.print(
                "Enter 4 numbers separated by spaces\n");
        String a = kb.nextLine();
        String[] aSplit = a.split("\\s+");

        System.out.println(
                "\n" + a + "\n" + Arrays.toString(aSplit));

        int x1 = letterNumber(aSplit[0].charAt(0));
        int y1 = Character.getNumericValue(aSplit[0].charAt(1));
        System.out.println(x1 + " " + y1);

        
        int x2 = letterNumber(aSplit[1].charAt(0));
        int y2 = Character.getNumericValue(aSplit[1].charAt(1));
        
        
        board.movePiece(x1, y1, x2, y2);
    }

}
