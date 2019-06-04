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

        // Deklarasi Data Peminjam dengan array 2 dimensi
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
            try {

                // ============= MENGAMBIL INPUT USER UNTUK MEMILIH MENU =============
                String InputUser = JOptionPane.showInputDialog(
                        "--------------------------------- MENU APLIKASI PENDATAAN ---------------------------------------\n"
                        + "\n     0. Keluar Aplikasi                            6. Masukkan Data Pengembalian "
                        + "\n     1. Masukkan Data Peminjam         7. Tampilkan Data Pengembalian"
                        + "\n     2. Tampilkan Data Peminjam         8. Cari Data Pengembalian"
                        + "\n     3. Cari Data Peminjam                    9. Ganti Data Pengembalian"
                        + "\n     4. Ganti Data Peminjam                 10. Hapus Data Pengembalian"
                        + "\n     5. Hapus Data Peminjam                11. Tentang Aplikasi \n\n"
                        + "------------------------------------------------------------------------------------------------------------------"
                );

                int Menu = Integer.valueOf(InputUser);

                if (Menu > 11 || Menu < 0) {
                    JOptionPane.showMessageDialog(null, "Yang Anda Masukkan Salah");
                } else {

                    if (Menu == 11) {
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

                            data2[0][indexArray] = JOptionPane.showInputDialog("Masukkan Nama Lengkap Peminjam Buku : ");

                            data2[1][indexArray] = JOptionPane.showInputDialog("Masukkan Judul Buku : ");

                            data1[1][indexArray] = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Kode Buku : "));

                            data2[2][indexArray] = JOptionPane.showInputDialog("Masukkan Tanggal Pinjam Buku : *format (01-Juni-2019) : ");
                        }
                    }

                    if (Menu == 2) {

                        for (int i = 0; i < data1[0].length; i++) {
                            if (data1[0][i] == 0 || data2[0][i].equalsIgnoreCase("null") || data2[1][i].equalsIgnoreCase("null") || data1[1][i] == 0 || data2[2][i].equalsIgnoreCase("null")) {

                            } else {
                                SemuaData += (i + 1) + ". " + data1[0][i] + " - " + data2[0][i] + " - " + data2[1][i] + " - " + data1[1][i] + " - " + data2[2][i] + "\n";
                            }
                        }

                        JOptionPane.showMessageDialog(null, "DATA SELURUH PEMINJAM BUKU PERPUSTAKAAN \nUNIVERSITAS NAHDLATUL ULAMA BLITAR 2019 \n\n" + SemuaData + "\n");
                        SemuaData = "";

                    }

                    if (Menu == 3) {
                        String CariData = JOptionPane.showInputDialog("PILIH DATA YANG AKAN DICARI, BERDASARKAN "
                                + "\n1. Nim "
                                + "\n2. Nama"
                                + "\n3. Judul Buku"
                                + "\n4. Kode Buku"
                                + "\n5. Tanggal Pinjam Buku\n");
                        int Data = Integer.valueOf(CariData);
                        
                        if (Data == 1) {                            
                                String CariNim = JOptionPane.showInputDialog(null, "Masukkan Nim yang ingin anda cari \n");
                                int FindNim = Integer.valueOf(CariNim);

                                for (int i = 0; i < data1[0].length; i++) {
                                    if (FindNim == data1[0][i]) {
                                        JOptionPane.showMessageDialog(null, "Data Detail Peminjam Buku Perpustakaan UNU BLITAR \n======================================"
                                                + "\nNIM PEMINJAM        : " + data1[0][i] + "\n"
                                                + "NAMA PEMINJAM    : " + data2[0][i] + "\n"
                                                + "JUDUL BUKU           : " + data2[1][i] + "\n"
                                                + "KODE BUKU            : " + data1[1][i] + "\n"
                                                + "TGL PINJAM BUKU  : " + data2[2][i]
                                                + "\n======================================");
                                        
                                    }
                                }                            
                        }
                        
                        if (Data == 2) {                            
                                String CariNama = JOptionPane.showInputDialog(null, "Masukkan Nama yang ingin anda cari \n");                                

                                for (int i = 0; i < data1[0].length; i++) {
                                    if (CariNama.equalsIgnoreCase(data2[0][i])) {
                                        JOptionPane.showMessageDialog(null, "Data Detail Peminjam Buku Perpustakaan UNU BLITAR \n======================================"
                                                + "\nNIM PEMINJAM        : " + data1[0][i] + "\n"
                                                + "NAMA PEMINJAM    : " + data2[0][i] + "\n"
                                                + "JUDUL BUKU           : " + data2[1][i] + "\n"
                                                + "KODE BUKU            : " + data1[1][i] + "\n"
                                                + "TGL PINJAM BUKU  : " + data2[2][i]
                                                + "\n======================================");                                        
                                    }
                                }                            
                        }
                        
                        if (Data == 3) {                            
                                String CariJudul = JOptionPane.showInputDialog(null, "Masukkan Judul Buku yang ingin anda cari \n");                                

                                for (int i = 0; i < data1[0].length; i++) {
                                    if (CariJudul.equalsIgnoreCase(data2[1][i])) {
                                        JOptionPane.showMessageDialog(null, "Data Detail Peminjam Buku Perpustakaan UNU BLITAR \n======================================"
                                                + "\nNIM PEMINJAM        : " + data1[0][i] + "\n"
                                                + "NAMA PEMINJAM    : " + data2[0][i] + "\n"
                                                + "JUDUL BUKU           : " + data2[1][i] + "\n"
                                                + "KODE BUKU            : " + data1[1][i] + "\n"
                                                + "TGL PINJAM BUKU  : " + data2[2][i]
                                                + "\n======================================");                                        
                                    }
                                }                            
                        }
                        
                        if (Data == 4) {                            
                                String CariKode = JOptionPane.showInputDialog(null, "Masukkan Kode Buku yang ingin anda cari \n");
                                int FindKode = Integer.valueOf(CariKode);

                                for (int i = 0; i < data1[0].length; i++) {
                                    if (FindKode == data1[1][i]) {
                                        JOptionPane.showMessageDialog(null, "Data Detail Peminjam Buku Perpustakaan UNU BLITAR \n======================================"
                                                + "\nNIM PEMINJAM        : " + data1[0][i] + "\n"
                                                + "NAMA PEMINJAM    : " + data2[0][i] + "\n"
                                                + "JUDUL BUKU           : " + data2[1][i] + "\n"
                                                + "KODE BUKU            : " + data1[1][i] + "\n"
                                                + "TGL PINJAM BUKU  : " + data2[2][i]
                                                + "\n======================================");                                        
                                    }
                                }                            
                        }
                        
                        
                         if (Data == 5) {                            
                                String CariTgl = JOptionPane.showInputDialog(null, "Masukkan Judul Buku yang ingin anda cari \n");                                

                                for (int i = 0; i < data1[0].length; i++) {
                                    if (CariTgl.equalsIgnoreCase(data2[2][i])) {
                                        JOptionPane.showMessageDialog(null, "Data Detail Peminjam Buku Perpustakaan UNU BLITAR \n======================================"
                                                + "\nNIM PEMINJAM        : " + data1[0][i] + "\n"
                                                + "NAMA PEMINJAM    : " + data2[0][i] + "\n"
                                                + "JUDUL BUKU           : " + data2[1][i] + "\n"
                                                + "KODE BUKU            : " + data1[1][i] + "\n"
                                                + "TGL PINJAM BUKU  : " + data2[2][i]
                                                + "\n======================================");                                       
                                    }
                                }                            
                        }
                        
                    }
                    
                    
                    

                    if (Menu == 4) {
                        String gantiData = JOptionPane.showInputDialog("Pilih Data yang akan diganti, Berdasarkan : "
                                + "\n1. Nim "
                                + "\n2. Nama"
                                + "\n3. Judul Buku"
                                + "\n4. Kode Buku"
                                + "\n5. Tanggal Pinjam Buku\n");
                        int Data = Integer.valueOf(gantiData);

                        if (Data == 1) {
                            String CariNim = JOptionPane.showInputDialog(null, "Cari Nim yang ingin anda ganti \n");
                            int FindNim = Integer.valueOf(CariNim);

                            for (int i = 0; i < data1[0].length; i++) {
                                if (FindNim == data1[0][i]) {

                                    int GantiNim = JOptionPane.showConfirmDialog(null, "NIM " + data1[0][i] + " Telah Ditemukan,\n Apakah Anda benar-benar Ingin Menggantinya ?");
                                    if (GantiNim == JOptionPane.YES_OPTION) {
                                        String NimBaru = JOptionPane.showInputDialog("Masukkan NIM Baru");
                                        int nimTelahDiganti = Integer.valueOf(NimBaru);
                                        data1[0][i] = nimTelahDiganti;
                                        JOptionPane.showMessageDialog(null, "Nim telah diganti menjadi : " + data1[0][i]);
                                    }
                                }
                            }
                        }

                        if (Data == 2) {
                            String CariNama = JOptionPane.showInputDialog(null, "Cari Nama yang ingin anda ganti \n");

                            for (int i = 0; i < data1[0].length; i++) {
                                if (CariNama.equalsIgnoreCase(data2[0][i])) {
                                    int GantiNama = JOptionPane.showConfirmDialog(null, " NAMA : " + data2[0][i] + ", Telah Ditemukan.\n Apakah Anda benar-benar Ingin Menggantinya ?");
                                    if (GantiNama == JOptionPane.YES_OPTION) {
                                        String NamaBaru = JOptionPane.showInputDialog("Masukkan Nama Baru");
                                        data2[0][i] = NamaBaru;
                                        JOptionPane.showMessageDialog(null, "Nama telah diganti menjadi : " + data2[0][i]);
                                    }
                                }
                            }
                        }

                        if (Data == 3) {
                            String CariJudul = JOptionPane.showInputDialog(null, "Cari Judul Buku yang ingin anda ganti \n");

                            for (int i = 0; i < data1[0].length; i++) {
                                if (CariJudul.equalsIgnoreCase(data2[1][i])) {
                                    int GantiJudul = JOptionPane.showConfirmDialog(null, " Judul Buku : " + data2[1][i] + ", Telah Ditemukan.\n Apakah Anda benar-benar Ingin Menggantinya ?");
                                    if (GantiJudul == JOptionPane.YES_OPTION) {
                                        String JudulBaru = JOptionPane.showInputDialog("Masukkan Judul Buku Baru");
                                        data2[1][i] = JudulBaru;
                                        JOptionPane.showMessageDialog(null, "Judul Buku telah diganti menjadi : " + data2[1][i]);
                                    }
                                }
                            }
                        }

                        if (Data == 4) {
                            String CariKodeBuku = JOptionPane.showInputDialog(null, "Cari Kode Buku yang ingin anda ganti \n");
                            int findKodeBuku = Integer.valueOf(CariKodeBuku);

                            for (int i = 0; i < data1[0].length; i++) {
                                if (findKodeBuku == data1[1][i]) {

                                    int GantiKodeBuku = JOptionPane.showConfirmDialog(null, "Kode Buku " + data1[1][i] + " Telah Ditemukan,\n Apakah Anda benar-benar Ingin Menggantinya ?");
                                    if (GantiKodeBuku == JOptionPane.YES_OPTION) {
                                        String KodeBukuBaru = JOptionPane.showInputDialog("Masukkan Kode Buku Baru");
                                        int KodeTelahDiganti = Integer.valueOf(KodeBukuBaru);
                                        data1[1][i] = KodeTelahDiganti;
                                        JOptionPane.showMessageDialog(null, "Kode Buku telah diganti menjadi : " + data1[1][i]);
                                    }
                                }
                            }
                        }

                        if (Data == 5) {
                            String tglPinjam = JOptionPane.showInputDialog(null, "Cari Tanggal Pinjam Buku yang ingin anda ganti \n");

                            for (int i = 0; i < data1[0].length; i++) {
                                if (tglPinjam.equalsIgnoreCase(data2[2][i])) {
                                    int Gantitgl = JOptionPane.showConfirmDialog(null, " Tanggal Pinjam Buku : " + data2[2][i] + ", Telah Ditemukan.\n Apakah Anda benar-benar Ingin Menggantinya ?");
                                    if (Gantitgl == JOptionPane.YES_OPTION) {
                                        String tglBaru = JOptionPane.showInputDialog("Masukkan Tanggal Pinjam Buku Baru");
                                        data2[2][i] = tglBaru;
                                        JOptionPane.showMessageDialog(null, "Tanggal Pinjam Buku telah diganti menjadi : " + data2[2][i]);
                                    }
                                }
                            }
                        }

                    }

                    // ============= KELUAR APLIKASI =============
                    if (Menu == 0) {
                        int keluar;
                        keluar = JOptionPane.showConfirmDialog(null, "Apakah Kamu Yakin Untuk Keluar?", "Konfirmasi Keluar Program", JOptionPane.YES_NO_CANCEL_OPTION);
                        if (keluar == JOptionPane.YES_OPTION) {
                            isRunning = false;
                        }
                    }

                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Maaf ! Yang anda masukkan salah");
            }
        }

    }
}
