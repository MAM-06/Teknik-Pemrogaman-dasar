/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalender;

import java.util.Scanner;

/**
 *
 * @author MAM
 */
public class Kalender {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            int m, y;
        Scanner scan = new Scanner(System.in);
        System.out.println("Bulan");
        m = scan.nextInt();
        System.out.println("Tahun");
        y = scan.nextInt();
        if (m == 1) {
            System.out.print("Januari, ");
            System.out.println("31"); }
         else {
            if (m == 2) {
                System.out.print("Februari, ");
                if (y % 4 == 0) {
                    System.out.println("29"); }
                 else {
                    System.out.println("28"); } }
                else {
                if (m == 3) {
                    System.out.print("Maret, ");
                    System.out.println("31"); }
                 else {
                    if (m == 4) {
                        System.out.print("April, ");
                        System.out.println("30"); }
                     else {
                        if (m == 5) {
                            System.out.print("Mei, ");
                            System.out.println("31"); }
                         else {
                            if (m == 6) {
                                System.out.print("Juni, ");
                                System.out.println("30"); }
                             else {
                                if (m == 7) {
                                    System.out.print("Juli, ");
                                    System.out.println("31"); }
                                 else {
                                    if (m == 8) {
                                        System.out.print("Agustus, ");
                                        System.out.println("31"); }
                                     else {
                                        if (m == 9) {
                                            System.out.print("September, ");
                                            System.out.println("30"); }
                                         else {
                                            if (m == 10) {
                                                System.out.print("Oktober, ");
                                                System.out.println("31"); }
                                             else {
                                                if (m == 11) {
                                                    System.out.print("November, ");
                                                    System.out.println("30"); }
                                                 else {
                                                    if (m == 12) {
                                                        System.out.print("Desember, ");
                                                        System.out.println("31"); }
                                                     else {
                                                        System.out.println("invalid mounth");
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}