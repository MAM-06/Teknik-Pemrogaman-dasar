/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menabung;

import java.util.Scanner;

/**
 *
 * @author MAM
 */
public class Menabung {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //jumlah Bulan menabung (b)
        //tabungan Awal (a)
        //Jumlah yang ditabung (j)
        //Bulan awal menabung (B)
        
        int b, a, j, B;
        B=1;     
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan jumlah bulan = ");
            j=scan.nextInt();
        System.out.println("Masukkan tabungan awal = ");
            a=scan.nextInt();
        System.out.println("Masukkan jumlah yang ditabung = ");
            j=scan.nextInt();
        
        while (B <= j) {
        System.out.println(a); 
            a=a+j;
                B++;
        }
    }
    
}
