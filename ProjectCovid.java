/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectcovid;

import java.util.Scanner;

/**
 *
 * @author MAM
 */
public class ProjectCovid {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Bilangan Pertama : ");
        int x = input.nextInt();
        System.out.print("Bilangan Kedua : ");
        int n = input.nextInt();
        int c = x - n;
        kombinasi(x, n, c);
    }

    public static int kombinasi(int x, int n, int c) {

        int h = 1;
        int fx = 1;
        int fn = 1;
        int fc = 1;

        if (x < n) {
        } else {
            for (int t = x; 
                     t > 1; 
                     t--) {
                     fx*=t;
            }
            for (int t = n; 
                     t > 1; 
                     t--) {
                     fn*=t;
            }
            for (int t = c; 
                     t > 1; 
                     t--) {
                     fc*=t;
            }
            h = fx/(fn*fc);
            System.out.println("Kombinasi = " + h);
        }
        return h;
    }
}
