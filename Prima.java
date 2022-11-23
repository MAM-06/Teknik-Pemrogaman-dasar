/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prima;

import java.util.Scanner;

/**
 *
 * @author MAM
 */
public class Prima {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan = ");
        int x = input.nextInt();
        Prima(x);
    }
    public static void Prima(int x) {
        int c = 0;
        for (int n = 2 ; 
                 n <= x ; 
                 n++) {
            if (x % n == 0) {
                c++;
            }
        }
            if (c == 1) {
            System.out.println("Bilangan Prima");
        }else {
            System.out.println("Bilangan 6"
                    + "Bukan Prima");
        }

    }

}
