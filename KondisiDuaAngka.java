/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kondisiduaangka;

import java.util.Scanner;

/**
 *
 * @author MAM
 */
public class KondisiDuaAngka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int a, b;
        Scanner input =new Scanner(System.in);
        System.out.println("Angka Pertama");
        a = input.nextInt();
        System.out.println("Angka Kedua");
        b = input.nextInt();
        if (a == b) {
            System.out.println("="); }
         else {
            if (a < b) {
                System.out.println("<"); }
             else {
                System.out.println(">"); }
            
        }
    }
}

    

