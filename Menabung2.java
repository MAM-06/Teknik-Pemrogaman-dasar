/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menabung2;

import java.util.Scanner;

/**
 *
 * @author MAM
 */
public class Menabung2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //harga rumah (h)
       //tabungan awal (t)
       //jumlah yang ditabung tiap bulanya (j)
       //bulan awal menabung (a)

        int h, t, j, a;
        
       Scanner input = new Scanner(System.in);
        System.out.println("Masukkan harga rumah");
            h=input.nextInt();
        System.out.println("Masukkan tabungan awal");
            t=input.nextInt();
        System.out.println("Masukkan jumlah yang ditabung tiap bulan");
            j=input.nextInt();
        
        for (a = t; a <= h; a += j) {
            System.out.println(a);
        } 
        System.out.println(a);
    }
    
}
