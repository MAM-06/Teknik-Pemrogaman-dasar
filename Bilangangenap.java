/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bilanganganjil;

import java.util.Scanner;

/**
 *
 * @author MAM
 */
public class Bilangangenap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       int a; int b;
       System.out.print("masukan a bilangan minimal :");
       a=s.nextInt();
       System.out.print("masukan a bilangan maksimal :");
       b=s.nextInt();

        for ( a = a; a <= b; a++)
             if (a%2 == 0) {
        System.out.println(a+ "");
}
    }

}