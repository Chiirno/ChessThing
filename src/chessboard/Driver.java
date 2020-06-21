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

        System.out.print(
                "Enter 4 numbers separated by spaces\n");
        String a = kb.nextLine();
        String[] aSplit = a.split("\\s+");

        System.out.println(
                "\n" + a + "\n" + Arrays.toString(aSplit));

        int x1 = Integer.parseInt(aSplit[0]);
        int y1 = Integer.parseInt(aSplit[1]);
        int x2 = Integer.parseInt(aSplit[2]);
        int y2 = Integer.parseInt(aSplit[3]);

        System.out.print(
                (x1 + y1 + x2 + y2) + "\n" + x1 + " " + y1 + " " + x2 + " " + y2);

        board.display();

        board.movePiece(x1, y1, x2, y2);
    }

}
