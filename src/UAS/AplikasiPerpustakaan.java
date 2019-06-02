/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAS;

import javax.swing.JOptionPane;

/**
 *
 * @author Utrodus
 */
public class AplikasiPerpustakaan {

    public static void main(String[] args) {

        // Deklarasi Data Peminjam dengan array
        /* 
        **array baris ke 1 untuk DATA NIM
        **array baris ke 2 untuk DATA Tahun Terbit Buku
         */
        int[][] data1 = new int[2][100];

        /* 
        **array baris ke 1 untuk DATA Nama Peminjam
        **array baris ke 2 untuk DATA Judul Buku
        **array baris ke 3 untuk DATA Tanggal Pinjam Buku
         */
        String[][] data2 = new String[4][100];

        // Untuk pengulangan aplikasi
        boolean isRunning = true;

        // Untuk penyimpanan semua array
        String SemuaData = "";

        // Gretting 
        JOptionPane.showMessageDialog(null, "=== SELAMAT DATANG DI APLIKASI  ===\nPeminjaman dan Pengembalian Buku\n    Perpustakaan UNU BLITAR 2019   ");

        // Pengulangan program    
        while (isRunning) {

            // ============= MENGAMBIL INPUT USER UNTUK MEMILIH MENU =============
            String InputUser = JOptionPane.showInputDialog(
                    "--------------------------------- MENU APLIKASI PENDATAAN ---------------------------------------\n"
                    + "          Peminjaman dan Pengembalian Buku Perpustakaan UNU BLITAR 2019\n"
                    + "\n     0. Petunjuk Pemaikan Aplikasi      6. Tampilkan Data Pengembalian"
                    + "\n     1. Masukkan Data Peminjam         7.Ganti Data Pengembalian"
                    + "\n     2. Tampilkan Data Peminjam          8.Hapus Data Pengembalian"
                    + "\n     3. Ganti Data Peminjam                    9. Keluar Aplikasi"
                    + "\n     4. Hapus Data Peminjam              "
                    + "\n     5. Masukkan Data Pengembalian           \n"
                    + "------------------------------------------------------------------------------------------------------------------"
            );

            int Menu = Integer.valueOf(InputUser);

            if (Menu > 9 || Menu < 0) {
                JOptionPane.showMessageDialog(null, "Yang Anda Masukkan Salah");
            } else {

                if (Menu == 0) {
                    JOptionPane.showMessageDialog(null, "");
                }

                // ============= INPUT DATA =============
                if (Menu == 1) {
                    String inputNomor = JOptionPane.showInputDialog("Data Ke (*Misal 1) : ");
                    int nomor = Integer.valueOf(inputNomor);
                    if (nomor == 0 || nomor < 0) {
                        JOptionPane.showMessageDialog(null, "MAAF! DATA HARUS DIMULAI DARI ANGKA 1");
                    } else {
     
                        int indexArray = nomor - 1;

                        data1[0][indexArray] = Integer.parseInt(JOptionPane.showInputDialog("Masukkan NIM Peminjam Buku : "));
                        System.out.println(data1[0][nomor]);

                        data2[0][indexArray] = JOptionPane.showInputDialog("Masukkan Nama Lengkap Peminjam Buku : ");
                        System.out.println(data2[0][nomor]);

                        data2[1][indexArray] = JOptionPane.showInputDialog("Masukkan Judul Buku : ");
                        System.out.println(data2[1][nomor]);

                        data1[1][indexArray] = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Kode Buku : "));
                        System.out.println(data1[1][nomor]);

                        data2[2][indexArray] = JOptionPane.showInputDialog("Masukkan Tanggal Pinjam Buku : *format (01-Juni-2019) : ");
                        System.out.println(data2[2][nomor]);
                    }
                }

                if (Menu == 2) {

                    for (int i = 0; i < data1[0].length; i++) {
                        if (data1[0][i] == 0 || data2[0][i].equalsIgnoreCase("null") || data2[1][i].equalsIgnoreCase("null") || data1[1][i] == 0 || data2[2][i].equalsIgnoreCase("null")) {
                            System.out.println("Data");
                            break;
                        } else {
                            SemuaData += (i + 1) + ". " + data1[0][i] + " - " + data2[0][i] + " - " + data2[1][i] + " - " + data1[1][i] + " - " + data2[2][i] + "\n";
                        }
                    }
                    JOptionPane.showMessageDialog(null, "DATA PEMINJAM BUKU PERPUSTAKAAN UNU BLITAR 2019 \nNo  Nim                Nama\n" + SemuaData + "\n");
                    SemuaData = "";
                }

                // ============= KELUAR APLIKASI =============
                if (Menu == 9) {
                    int keluar;
                    keluar = JOptionPane.showConfirmDialog(null, "Apakah Kamu Yakin Untuk Keluar?", "Konfirmasi Keluar Program", JOptionPane.YES_NO_CANCEL_OPTION);
                    if (keluar == JOptionPane.YES_OPTION) {
                        isRunning = false;
                    }
                }

            }
        }
    }

}
