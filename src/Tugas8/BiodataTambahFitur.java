/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas8;

import javax.swing.JOptionPane;

/**
 *
 * @author saidalbaqi
 */
public class BiodataTambahFitur {

    public static void main(String[] args) {

        boolean isRunning = true;
        String SemuaData = "";

        // Data Mahasiswa 
        int[] nim = {1855201003, 1855201004,
            1855201005, 1855201006, 1855201007,
            1855201008, 1855201009, 1855201010, 1855201011, 1855201012};

        String[] nama = {"M. SUGIARTO", "M. MAULANA IKHSAN",
            "CITRA MIRNA WATI", "UTRODUS SAID AL BAQI", "MUHAMMAD YUSUF ASHARI",
            "MUHAMMAD LUTFI ASHARI", "DEWI LESTARI", "MUHAMMAD NAUFAL S.",
            "MUHAMAD RIZAL S.", "MUH. FATWA ZAYYINI FATHI"};

        double[] Ipk = {3.4, 3.5, 3.6, 3.6, 3.8,
            3.5, 3.4, 3.7, 3.3, 3.4,};

        JOptionPane.showMessageDialog(null, "Selamat Datang Di Aplikasi Data Biodata Mahasiswa");

        while (isRunning) {
            try {
                String InputUser = JOptionPane.showInputDialog("========= Menu ========= \n"
                        + "\n1. Tampilkan Data Keseluruhan "
                        + "\n2. Cari Data Mahasiswa"
                        + "\n3. Ganti Data Mahasiswa"
                        + "\n4. Keluar \n "
                        + "\n========== ~ ===========");
                int Menu = Integer.valueOf(InputUser);

                if (Menu > 4 || Menu < 1) {
                    JOptionPane.showMessageDialog(null, "Yang Anda Masukkan Salah");
                } else {

                    if (Menu == 1) {                        

                        for (int i = 0; i < 10; i++) {
                            SemuaData += (i + 1) + ". " + nim[i] + " - " + nama[i] + " - Ipk: (" + Ipk[i] + ")" + "\n";
                        }
                        
                        JOptionPane.showMessageDialog(null, SemuaData);
                        
                    }
                    
                    // CARI DATA
                    if (Menu == 2) {
                        String CariData = JOptionPane.showInputDialog(null, "Masukkan Data yang ingin anda cari \n*Berdasarkan NIM Mahasiswa* ");
                        int Data = Integer.valueOf(CariData);

                        // Mencari Berdasarkan NIM
                        for (int i = 0; i < nim.length; i++) {
                            if (Data == nim[i]) {
                                JOptionPane.showMessageDialog(null, "Biodata \nILKOM A 2018 \n==================="
                                        + "\nNIM        : " + nim[i] + "\n"
                                        + "NAMA     : " + nama[i] + "\n"
                                        + "IPK         : " + Ipk[i]
                                        + "\n===================");
                            }
                        }

                    }
                    
                    // GANTI DATA
                    if (Menu == 3) {
                        String gantiData = JOptionPane.showInputDialog("Pilih Data yang akan diganti berdasarkan : \n"
                                + "\n1. NIM "
                                + "\n2. NAMA"
                                + "\n3. IPK"
                                + "\n========== ~ ===========");
                        int Data = Integer.valueOf(gantiData);

                        if (Data == 1) {
                            String CariNim = JOptionPane.showInputDialog(null, "Masukkan Nim yang ingin anda Ganti");
                            int dataNIM = Integer.valueOf(CariNim);

                            // Mencari Berdasarkan NIM
                            for (int i = 0; i < nim.length; i++) {
                                if (dataNIM == nim[i]) {
                                    int GantiNim = JOptionPane.showConfirmDialog(null, "NIM " + nim[i] + " Telah Ditemukan,\n Apakah Anda benar-benar Ingin Menggantinya ?");
                                    if (GantiNim == JOptionPane.YES_OPTION) {
                                        String NimBaru = JOptionPane.showInputDialog("Masukkan NIM Baru");
                                        int nimTelahDiganti = Integer.valueOf(NimBaru);
//                                        SemuaData += nimTelahDiganti;
                                        nim[i] = nimTelahDiganti;
                                        System.out.println(nim[i]);
                                    }
                                }
                            }
                        }

                        if (Data == 2) {

                        }

                        if (Data == 3) {

                        }

                    }

                    if (Menu == 4) {
                        int keluar;
                        keluar = JOptionPane.showConfirmDialog(null, "Apakah Kamu Yakin Untuk Keluar?", "Konfirmasi Keluar Program", JOptionPane.YES_NO_CANCEL_OPTION);
                        if (keluar == JOptionPane.YES_OPTION) {
                            System.exit(0);
                        }
                    }
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Maaf ! Yang anda masukkan salah");
            }
        }

    }

}
