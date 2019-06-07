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
        **array baris ke 2 untuk DATA NO HP 
         */
        int[][] data1 = new int[2][100];

        /* 
        **array baris ke 1 untuk DATA Nama Peminjam
        **array baris ke 2 untuk DATA Judul Buku
        **array baris ke 3 untuk DATA Jurusan Peminjam
        **array baris ke 4 untuk DATA Tanggal Pinjam Buku
         */
        String[][] data2 = new String[4][35];

        String[][] Buku = new String[35][3];

        // Untuk pengulangan aplikasi
        boolean isRunning = true;

        // Untuk penyimpanan semua array
        String SemuaData = "";
        String SemuaBuku = "";
        // Gretting 
        JOptionPane.showMessageDialog(null, "=== SELAMAT DATANG DI APLIKASI  ===\n   PEMINJAMAN BUKU PERPUSTAKAAN\nUNIVERSITAS NAHDLATUL ULAMA BLITAR");

        // Pengulangan program    
        while (isRunning) {
            try {

                // ============= MENGAMBIL INPUT USER UNTUK MEMILIH MENU =============
                String InputUser = JOptionPane.showInputDialog(
                        "----------- MENU APLIKASI PEMINJAMAN BUKU PERPUSTAKAAN ------------\n"
                        + "\n     0. KELUAR APLIKASI                            6. TENTANG APLIKASI "
                        + "\n     1. MASUKKAN DATA PEMINJAM          "
                        + "\n     2. TAMPILKAN DATA PEMINJAM         "
                        + "\n     3. CARI DATA PEMINJAM              "
                        + "\n     4. GANTI DATA PEMINJAM             "
                        + "\n     5. HAPUS DATA PEMINJAM         \n\n"
                        + "-------------------------------------------------------------------------------------------------"
                );

                int Menu = Integer.valueOf(InputUser);

                if (Menu > 6 || Menu < 0) {
                    JOptionPane.showMessageDialog(null, "Yang Anda Masukkan Salah");
                } else {

                    // ============= INPUT DATA =============
                    if (Menu == 1) {
                        String inputNomor = JOptionPane.showInputDialog("Data Ke (*Misal 1) : ");
                        int nomor = Integer.valueOf(inputNomor);
                        if (nomor == 0 || nomor < 0) {
                            JOptionPane.showMessageDialog(null, "MAAF! DATA HARUS DIMULAI DARI ANGKA 1");
                        } else {
                            boolean inputRunning = true;
                            int indexArray = nomor - 1;

                            while (inputRunning) {

                                String MenuInput = JOptionPane.showInputDialog(
                                        "--------------- MENU INPUT DATA -------------------------\n"
                                        + "\n     1. Masukkan Nim Peminjam"
                                        + "\n     2. Masukkan Nama Peminjam"
                                        + "\n     3. Masukkan Jurusan Peminjam"
                                        + "\n     4. Masukkan Judul Buku Data Peminjam"
                                        + "\n     5. Masukkan Tanggal Pinjam"
                                        + "\n     6. Kembali Ke Menu Utama\n"
                                        + "------------------------------------------------------------------"
                                );

                                int Input = Integer.valueOf(MenuInput);

                                switch (Input) {
                                    case 1:
                                        if (data1[0][indexArray] == 0) {
                                            data1[0][indexArray] = Integer.parseInt(JOptionPane.showInputDialog("Masukkan NIM Peminjam Buku : "));
                                        } else {
                                            JOptionPane.showMessageDialog(null, "Maaf Nim Sudah Diisi ");
                                        }
                                        break;

                                    case 2:
                                        if (data2[0][indexArray] != null) {
                                            JOptionPane.showMessageDialog(null, "Maaf Nama Peminjam Buku Sudah Diisi ");
                                        } else {
                                            data2[0][indexArray] = JOptionPane.showInputDialog("Masukkan Nama Lengkap Peminjam Buku : ");
                                        }
                                        break;

                                    case 3:
                                        if (data2[1][indexArray] != null) {
                                            JOptionPane.showMessageDialog(null, "Maaf Jurusan Peminjam Buku Sudah Diisi ");
                                        } else {
                                            data2[1][indexArray] = JOptionPane.showInputDialog("Masukkan Jurusan Peminjam Buku : ");
                                        }
                                        break;

                                    case 4:
                                        for (int i = 0; i < 3; i++) {
                                            if (Buku[indexArray][i] != null) {
                                                JOptionPane.showMessageDialog(null, "Maaf Judul Buku Ke " + (i + 1) + " Sudah Diisi ");
                                            } else {
                                                Buku[indexArray][i] = JOptionPane.showInputDialog("Masukkan Judul Buku ke : " + (i + 1));
                                                if (i < 2) {
                                                    int keluar = JOptionPane.showConfirmDialog(null, "Apakah Ingin Menambah Judul Buku?", "Tambah Judul Buku", JOptionPane.YES_NO_CANCEL_OPTION);
                                                    if (keluar == JOptionPane.YES_OPTION) {
                                                    } else if (keluar == JOptionPane.NO_OPTION) {
                                                        break;
                                                    }
                                                }
                                            }
                                        }

                                        break;

                                    case 5:
                                        if (data2[2][indexArray] != null) {
                                            JOptionPane.showMessageDialog(null, "Maaf Tanggal Pinjam Buku Sudah Diisi ");
                                        } else {
                                            data2[2][indexArray] = JOptionPane.showInputDialog("Masukkan Tanggal Pinjam Buku : *format (01-Juni-2019) : ");
                                        }
                                        break;

                                    case 6:
                                        if (data1[0][indexArray] != 0 && data2[0][indexArray] != null && data2[2][indexArray] != null || Buku[indexArray][0] != null
                                                || Buku[indexArray][1] != null || Buku[indexArray][2] != null && data2[1][indexArray] != null) {
                                            inputRunning = false;
                                        } else {
                                            JOptionPane.showMessageDialog(null, "MAAF DATA PEMINJAM BUKU BELUM SELESAI DIISI,\nDIMOHON UNTUK MENGISI SEMUA DATA !");
                                        }

                                        break;

                                    default:
                                        JOptionPane.showMessageDialog(null, "Maaf Yang Anda Masukkan Salah");
                                }

                            }
                        }
                    }

                    // ============= TAMPILKAN SEMUA DATA =============
                    if (Menu == 2) {

                        for (int i = 0; i < data1[0].length; i++) {
                            if (data1[0][i] == 0 || data2[0][i].equalsIgnoreCase("null") || data2[1][i].equalsIgnoreCase("null") || data2[1][i].equalsIgnoreCase("null")) {
                            } else {
                                SemuaData += (i + 1) + ". " + data1[0][i] + " - " + data2[0][i] + " - " + data2[1][i] + " - " + data2[2][i] + "\n";
                            }
                        }

                        JOptionPane.showMessageDialog(null, "DATA SELURUH PEMINJAM BUKU PERPUSTAKAAN\nUNIVERSITAS NAHDLATUL ULAMA BLITAR\nTAHUN 2019 \n\n" + SemuaData + "\n");
                        SemuaData = "";
                    }

                    // ============= CARI DATA =============
                    if (Menu == 3) {
                        String CariData = JOptionPane.showInputDialog("PILIH DATA YANG AKAN DICARI, BERDASARKAN "
                                + "\n1. Nim "
                                + "\n2. Nama"
                                + "\n3. Jurusan"
                                + "\n4. Tanggal Pinjam Buku\n");
                        int Data = Integer.valueOf(CariData);

                        if (Data == 1) {
                            String CariNim = JOptionPane.showInputDialog(null, "Masukkan Nim Peminjam : \n");
                            int FindNim = Integer.valueOf(CariNim);

                            for (int i = 0; i < data1[0].length; i++) {
                                if (FindNim == data1[0][i]) {

                                    for (int j = 0; j < 2; j++) {
                                        if (Buku[i][j] != null) {
                                            SemuaBuku += Buku[i][j] + "\n";
                                        } else {
                                        }
                                    }

                                    JOptionPane.showMessageDialog(null, "Detail Peminjam Buku Perpustakaan UNU BLITAR \n======================================"
                                            + "\nNIM PEMINJAM        : " + data1[0][i] + "\n"
                                            + "NAMA PEMINJAM    : " + data2[0][i] + "\n"
                                            + "JURUSAN            : " + data2[1][i] + "\n"
                                            + "TGL PINJAM BUKU  : " + data2[2][i] + "\n"
                                            + "\nJUDUL BUKU YANG DI PINJAM : \n"
                                            + (i + 1) + ". " + SemuaBuku
                                            + "\n======================================");

                                }
                            }
                            SemuaBuku = "";
                        }

                        if (Data == 2) {
                            String CariNama = JOptionPane.showInputDialog(null, "Masukkan Nama Peminjam : \n");

                            for (int i = 0; i < data1[0].length; i++) {
                                if (CariNama.equalsIgnoreCase(data2[0][i])) {

                                    for (int j = 0; j < 2; j++) {
                                        if (Buku[i][j] != null) {
                                            SemuaBuku += Buku[i][j] + "\n";
                                        } else {
                                        }
                                    }

                                    JOptionPane.showMessageDialog(null, "Detail Peminjam Buku Perpustakaan UNU BLITAR \n======================================"
                                            + "\nNIM PEMINJAM        : " + data1[0][i] + "\n"
                                            + "NAMA PEMINJAM    : " + data2[0][i] + "\n"
                                            + "JURUSAN            : " + data2[1][i] + "\n"
                                            + "TGL PINJAM BUKU  : " + data2[2][i] + "\n"
                                            + "\nJUDUL BUKU YANG DI PINJAM : \n"
                                            + (i + 1) + ". " + SemuaBuku
                                            + "\n======================================");

                                }
                            }
                            SemuaBuku = "";
                        }

                        if (Data == 3) {
                            String CariJurusan = JOptionPane.showInputDialog(null, "Masukkan Jurusan Peminjam : \n");

                            for (int i = 0; i < data1[0].length; i++) {
                                if (CariJurusan.equalsIgnoreCase(data2[1][i])) {
                                    for (int j = 0; j < 2; j++) {
                                        if (Buku[i][j] != null) {
                                            SemuaBuku += Buku[i][j] + "\n";
                                        } else {
                                        }
                                    }

                                    JOptionPane.showMessageDialog(null, "Detail Peminjam Buku Perpustakaan UNU BLITAR \n======================================"
                                            + "\nNIM PEMINJAM        : " + data1[0][i] + "\n"
                                            + "NAMA PEMINJAM    : " + data2[0][i] + "\n"
                                            + "JURUSAN            : " + data2[1][i] + "\n"
                                            + "TGL PINJAM BUKU  : " + data2[2][i] + "\n"
                                            + "\nJUDUL BUKU YANG DI PINJAM : \n"
                                            + (i + 1) + ". " + SemuaBuku
                                            + "\n======================================");
                                }
                            }
                            SemuaBuku = "";
                        }

                        if (Data == 4) {
                            String CariTgl = JOptionPane.showInputDialog(null, "Masukkan Tanggal Pinjam Buku : \n");

                            for (int i = 0; i < data1[0].length; i++) {
                                if (CariTgl.equalsIgnoreCase(data2[1][i])) {
                                    for (int j = 0; j < 2; j++) {
                                        if (Buku[i][j] != null) {
                                            SemuaBuku += Buku[i][j] + "\n";
                                        } else {
                                        }
                                    }

                                    JOptionPane.showMessageDialog(null, "Detail Peminjam Buku Perpustakaan UNU BLITAR \n======================================"
                                            + "\nNIM PEMINJAM        : " + data1[0][i] + "\n"
                                            + "NAMA PEMINJAM    : " + data2[0][i] + "\n"
                                            + "JURUSAN            : " + data2[1][i] + "\n"
                                            + "TGL PINJAM BUKU  : " + data2[2][i] + "\n"
                                            + "\nJUDUL BUKU YANG DI PINJAM : \n"
                                            + (i + 1) + ". " + SemuaBuku
                                            + "\n======================================");
                                }
                            }
                            SemuaBuku = "";
                        }

                    }

                    if (Menu == 4) {
                        String gantiData = JOptionPane.showInputDialog("Pilih Data yang akan diganti, Berdasarkan : "
                                + "\n1. Nim "
                                + "\n2. Nama"
                                + "\n3. Judul Buku"
                                + "\n4. Jurusan"
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
                            String CariNoHP = JOptionPane.showInputDialog(null, "Cari Jurusan Peminjam yang ingin anda ganti \n");
                            int findNoHP = Integer.valueOf(CariNoHP);

                            for (int i = 0; i < data1[0].length; i++) {
                                if (findNoHP == data1[1][i]) {

                                    int GantiNoHP = JOptionPane.showConfirmDialog(null, "Jurusan Peminjam Buku " + data1[1][i] + " Telah Ditemukan,\n Apakah Anda benar-benar Ingin Menggantinya ?");
                                    if (GantiNoHP == JOptionPane.YES_OPTION) {
                                        String NoHPBaru = JOptionPane.showInputDialog("Masukkan Jurusan");
                                        int NoHPTelahDiganti = Integer.valueOf(NoHPBaru);
                                        data1[1][i] = NoHPTelahDiganti;
                                        JOptionPane.showMessageDialog(null, "No HP Buku telah diganti menjadi : " + data1[1][i]);
                                    }
                                }
                            }
                        }

                        if (Data == 5) {
                            String tglPinjam = JOptionPane.showInputDialog(null, "Cari Tanggal Pinjam Buku yang ingin anda ganti \n");

                            for (int i = 0; i < data1[0].length; i++) {
                                if (tglPinjam.equalsIgnoreCase(data2[1][i])) {
                                    int Gantitgl = JOptionPane.showConfirmDialog(null, " Tanggal Pinjam Buku : " + data2[1][i] + ", Telah Ditemukan.\n Apakah Anda benar-benar Ingin Menggantinya ?");
                                    if (Gantitgl == JOptionPane.YES_OPTION) {
                                        String tglBaru = JOptionPane.showInputDialog("Masukkan Tanggal Pinjam Buku Baru");
                                        data2[1][i] = tglBaru;
                                        JOptionPane.showMessageDialog(null, "Tanggal Pinjam Buku telah diganti menjadi : " + data2[1][i]);
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
