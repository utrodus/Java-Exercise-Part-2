/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas7;

/**
 *
 * @author saidalbaqi
 */
public class array {
    public static void main(String[] args) {
        int bilangan[] = {1,2,3,4};
        int[] bilangan2 = {1,2,3,4};
        
        int Angka[] = new int[5];
        
        Angka[0] = 2;
        Angka[1] = 3;
        Angka[2] = 4;
        Angka[3] = 5;
        Angka[4] = 6;
        
        System.out.println(Angka[0]);
        System.out.println(Angka[1]);
        System.out.println(Angka[2]);
        System.out.println(Angka[3]);
        System.out.println(Angka[4]);
        
        String[] nama = {"Said","Tampan"};
        
        System.out.println( nama[0] + "Berada pada index ke 0");
        System.out.println("Panjang Array Adalah : " + nama.length);
    }
}
