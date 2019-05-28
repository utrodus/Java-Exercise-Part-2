/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas9;

import javax.swing.JOptionPane;

/**
 *
 * @author saidalbaqi
 */
public class matriks {

    public static void main(String[] args) {
//        int matriks[][] = new int[2][2];
//
//        matriks[0][0] = 10;
//        matriks[0][1] = 15;
//        matriks[1][0] = 20;
//        matriks[1][1] = 25;
//
//        for (int bar = 0; bar < matriks.length; bar++) {
//
//            for (int kol = 0; kol < matriks[bar].length; kol++) {
//                System.out.println(matriks[bar][kol] + " ");
//            }
//
//        }

        // KALKULATOR MATRIKS
        int matriks1[][] = new int[2][2];
        int matriks2[][] = new int[2][2];

        boolean isRunning = true;
        String SemuaData = "";

        while (isRunning) {
            try {
                // ============= MENGAMBIL INPUT USER UNTUK MEMILIH MENU =============
                String InputUser = JOptionPane.showInputDialog(
                        " == KALKULATOR MATRIKS ORDO 2 Atau 2 Dimensi == \n"
                        + "\n1. Input Matriks 1 "
                        + "\n2. Input Matriks 2"
                        + "\n3. Jumlahkan (Matriks 1 + Matriks 2)"
                        + "\n4. Kurangkan (Matriks 1 - Matriks 2)"
                        + "\n5. Kalikan (Matriks 1 * Matriks 2)"
                        + "\n6. Keluar\n\n"
                );

                Integer pilih = Integer.valueOf(InputUser);

                if (pilih == 1) {
                    for (int baris = 0; baris < matriks1.length; baris++) {
                        for (int kolom = 0; kolom < matriks1[baris].length; kolom++) {
                            matriks1[baris][kolom] = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Array Matriks 1 " + "(" + baris + "," + kolom + ")"));
                        }
                    }

                    JOptionPane.showMessageDialog(null, "Matriks 1 Berisi :" + " \n " + "(" + matriks1[0][0] + "," + matriks1[0][1] + ")" + " \n " + "(" + matriks1[1][0] + "," + matriks1[1][1] + ")");

                }

                if (pilih == 2) {
                    for (int baris = 0; baris < matriks2.length; baris++) {
                        for (int kolom = 0; kolom < matriks2[baris].length; kolom++) {
                            matriks2[baris][kolom] = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Array Matriks 2 " + "(" + baris + "," + kolom + ")"));
                        }
                    }

                    JOptionPane.showMessageDialog(null, "Matrisk 2 Berisi :" + " \n " + "(" + matriks2[0][0] + "," + matriks2[0][1] + ")" + " \n " + "(" + matriks2[1][0] + "," + matriks2[1][1] + ")");

                }

                if (pilih == 3) {
                    for (int i = 0; i < matriks1.length; i++) {

                        for (int j = 0; j < matriks1[0].length; j++) {

                            // Menghitung Penjumlahan
                            int jumlah = matriks1[i][j] + matriks2[i][j];

                            // Menampilkan Hasil Jumlah
                            String jumlahData = String.valueOf(jumlah);

                            SemuaData += jumlahData;

                            if (SemuaData.length() == 4) {
                                JOptionPane.showMessageDialog(null, jumlahData + " , " + jumlahData + "\n" + jumlahData + " , " + jumlahData);
                                SemuaData = "";
                            }

                        }

                    }
                }

                if (pilih == 4) {
                    for (int i = 0; i < matriks1.length; i++) {

                        for (int j = 0; j < matriks1[0].length; j++) {

                            // Menghitung Pengurangan
                            int pengurangan = matriks1[i][j] - matriks2[i][j];

                            // Menampilkan Hasil Pengurangan
                            String jumlahData = String.valueOf(pengurangan);

                            SemuaData += jumlahData;

                            if (SemuaData.length() == 4) {
                                JOptionPane.showMessageDialog(null, jumlahData + " , " + jumlahData + "\n" + jumlahData + " , " + jumlahData);
                                SemuaData = "";
                            }

                        }

                    }
                }

                if (pilih == 5) {

                    int matriks3[][] = new int[2][2];

                    for (int i = 0; i < matriks1.length; i++) {

                        for (int j = 0; j < matriks1[0].length; j++) {
                            
                            int total = 0;
                            
                            for (int k = 0; k < matriks1.length; k++) {
                                total = total + (matriks1[i][k] * matriks2[k][j]);
                            }
                            
                            matriks3[i][j] = total;                                                                                                               
                        }
                    }
                    
                    JOptionPane.showMessageDialog(null, "(" + matriks3[0][0] + "," + matriks3[0][1] + ")" + " \n " + "(" + matriks3[1][0] + "," + matriks3[1][1] + ")");
                }

                if (pilih == 6) {
                    int keluar;
                    keluar = JOptionPane.showConfirmDialog(null, "Apakah Kamu Yakin Untuk Keluar?", "Konfirmasi Keluar Program", JOptionPane.YES_NO_CANCEL_OPTION);
                    if (keluar == JOptionPane.YES_OPTION) {
                        isRunning = false;
                    }
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Maaf ! Yang anda masukkan salah");
            }

        }
    }
}
