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
        boolean inputRunning = true;

        // Untuk Window Message
        String Warning = "Peringatan!";

        // Untuk penyimpanan semua array
        String SemuaData = "";
        String SemuaBuku = "";
        // Gretting 
        JOptionPane.showMessageDialog(null, "=== SELAMAT DATANG DI APLIKASI  ===\n  PEMINJAMAN BUKU PERPUSTAKAAN\nUNIVERSITAS NAHDLATUL ULAMA BLITAR");

        // Pengulangan program    
        while (isRunning) {
            try {

                // ============= MENGAMBIL INPUT USER UNTUK MEMILIH MENU =============
                String InputUser = JOptionPane.showInputDialog(
                        "----------- MENU APLIKASI PEMINJAMAN BUKU PERPUSTAKAAN ------------\n"
                        + "\n   0. KELUAR APLIKASI                                   4. HAPUS DATA PEMINJAM "
                        + "\n   1. MASUKKAN DATA PEMINJAM                 5. TENTANG APLIKASI"
                        + "\n   2. TAMPILKAN DATA PEMINJAM         "
                        + "\n   3. CARI DATA & GANTI DATA PEMINJAM\n\n"
                        + "-----------------------------------------------------------------------------------------------\n"
                );

                int Menu = Integer.valueOf(InputUser);

                if (Menu > 5 || Menu < 0) {
                    JOptionPane.showMessageDialog(null, "Yang Anda Masukkan Salah,\nMenu Yang tersedia hanya dari angka 0 - 5", "WARNING !!! ADA KESALAHAN", JOptionPane.ERROR_MESSAGE);
                } else {

                    // ============= INPUT DATA =============
                    if (Menu == 1) {
                        String inputNomor = JOptionPane.showInputDialog("Data Ke (*Misal 1) : ");
                        int nomor = Integer.valueOf(inputNomor);
                        if (nomor == 0 || nomor < 0) {
                            JOptionPane.showMessageDialog(null, "MAAF! DATA HARUS DIMULAI DARI ANGKA 1", "WARNING !!! ADA KESALAHAN", JOptionPane.ERROR_MESSAGE);
                        } else {
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
                                            JOptionPane.showMessageDialog(null, "Maaf Nim Sudah Diisi ", "WARNING !!! ADA KESALAHAN", JOptionPane.ERROR_MESSAGE);
                                        }
                                        break;

                                    case 2:
                                        if (data2[0][indexArray] != null) {
                                            JOptionPane.showMessageDialog(null, "Maaf Nama Peminjam Buku Sudah Diisi ", "WARNING !!! ADA KESALAHAN", JOptionPane.ERROR_MESSAGE);
                                        } else {
                                            data2[0][indexArray] = JOptionPane.showInputDialog("Masukkan Nama Lengkap Peminjam Buku : ");
                                        }
                                        break;

                                    case 3:
                                        if (data2[1][indexArray] != null) {
                                            JOptionPane.showMessageDialog(null, "Maaf Jurusan Peminjam Buku Sudah Diisi ", "WARNING !!! ADA KESALAHAN", JOptionPane.ERROR_MESSAGE);
                                        } else {
                                            data2[1][indexArray] = JOptionPane.showInputDialog("Masukkan Jurusan Peminjam Buku : ");
                                        }
                                        break;

                                    case 4:
                                        for (int i = 0; i < 3; i++) {
                                            if (Buku[indexArray][i] != null) {
                                                JOptionPane.showMessageDialog(null, "Maaf Judul Buku Ke " + (i + 1) + " Sudah Diisi ", "WARNING !!! ADA KESALAHAN", JOptionPane.ERROR_MESSAGE);
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
                                            JOptionPane.showMessageDialog(null, "Maaf Tanggal Pinjam Buku Sudah Diisi ", "WARNING !!! ADA KESALAHAN", JOptionPane.ERROR_MESSAGE);
                                        } else {
                                            data2[2][indexArray] = JOptionPane.showInputDialog("Masukkan Tanggal Pinjam Buku : *format (01-Juni-2019) : ", "01-Juni-2019");
                                        }
                                        break;

                                    case 6:
                                        if (data1[0][indexArray] != 0 && data2[0][indexArray] != null && data2[2][indexArray] != null || Buku[indexArray][0] != null
                                                || Buku[indexArray][1] != null || Buku[indexArray][2] != null && data2[1][indexArray] != null) {
                                            inputRunning = false;
                                        } else {
                                            JOptionPane.showMessageDialog(null, "MAAF DATA PEMINJAM BUKU BELUM SELESAI DIISI,\nDIMOHON UNTUK MENGISI SEMUA DATA !", "WARNING !!! ADA KESALAHAN", JOptionPane.ERROR_MESSAGE);
                                        }

                                        break;

                                    default:
                                        JOptionPane.showMessageDialog(null, "Maaf Yang Anda Masukkan Salah", "WARNING !!! ADA KESALAHAN", JOptionPane.ERROR_MESSAGE);
                                }

                            }
                        }
                    }

                    // ============= TAMPILKAN SEMUA DATA =============
                    if (Menu == 2) {

                        for (int i = 0; i < data1[0].length; i++) {
                            if (data1[0][i] != 0 || data2[0][i] != null || data2[1][i] != null || data2[1][i] != null) {
                                SemuaData += (i + 1) + ". " + data1[0][i] + " - " + data2[0][i] + " - " + data2[1][i] + " - " + data2[2][i] + "\n";
                                JOptionPane.showMessageDialog(null, "DATA SELURUH PEMINJAM BUKU PERPUSTAKAAN UNIVERSITAS\nNAHDLATUL ULAMA BLITAR TAHUN 2019 \n\n" + SemuaData + "\n");
                                SemuaData = "";
                                break;
                            } else {
                                JOptionPane.showMessageDialog(null, "MAAF DATA MASIH KOSONG,\nMOHON UNTUK MENGISI DATA DAHULU!", "WARNING !!! ADA KESALAHAN", JOptionPane.ERROR_MESSAGE);
                                break;
                            }
                        }

                    }

                    // ============= CARI DATA =============
                    if (Menu == 3) {

                        String CariData = JOptionPane.showInputDialog("MENU CARI DATA DAN GANTI DATA\nCari Data dan Ganti Data, Berdasarkan\n "
                                + "\n1. NIM "
                                + "\n2. NAMA"
                                + "\n3. JURUSAN"
                                + "\n4. TANGGAL PINJAM BUKU"
                                + "\n5. KEMBALI KE MENU UTAMA\n\n"
                        );

                        int Data = Integer.valueOf(CariData);
                        switch (Data) {
                            case 1:
                                String CariNim = JOptionPane.showInputDialog(null, "Masukkan Nim Peminjam : \n");
                                int FindNim = Integer.valueOf(CariNim);

                                for (int i = 0; i < data1[0].length; i++) {
                                    if (FindNim == data1[0][i]) {

                                        for (int j = 0; j < 3; j++) {
                                            if (Buku[i][j] != null) {
                                                SemuaBuku += (j + 1) + ". " + Buku[i][j] + "\n";
                                            } else {
                                            }
                                        }

                                        JOptionPane.showMessageDialog(null, "Detail Peminjam Buku Perpustakaan UNU BLITAR \n======================================"
                                                + "\nNIM PEMINJAM        : " + data1[0][i] + "\n"
                                                + "NAMA PEMINJAM    : " + data2[0][i] + "\n"
                                                + "JURUSAN                 : " + data2[1][i] + "\n"
                                                + "TGL PINJAM BUKU  : " + data2[2][i] + "\n"
                                                + "\nJUDUL BUKU YANG DI PINJAM : \n"
                                                + SemuaBuku + "\n"
                                                + "======================================");

                                        int GantiData = JOptionPane.showConfirmDialog(null, " APAKAH ANDA INGIN MENGGANTI DATA PEMINJAM ?");
                                        if (GantiData == JOptionPane.YES_OPTION) {

                                            int GantiNim = JOptionPane.showConfirmDialog(null, " INGIN MENGGANTI NIM PEMINJAM ?");
                                            if (GantiNim == JOptionPane.YES_OPTION) {
                                                String NimBaru = JOptionPane.showInputDialog("Masukkan NIM Baru");
                                                int nimTelahDiganti = Integer.valueOf(NimBaru);
                                                data1[0][i] = nimTelahDiganti;
                                            }

                                            int GantiNama = JOptionPane.showConfirmDialog(null, " INGIN MENGGANTI NAMA PEMINJAM ?");
                                            if (GantiNama == JOptionPane.YES_OPTION) {
                                                String NamaBaru = JOptionPane.showInputDialog("Masukkan Nama Baru");
                                                data2[0][i] = NamaBaru;
                                            }

                                            int GantiJurusan = JOptionPane.showConfirmDialog(null, " INGIN MENGGANTI JURUSAN PEMINJAM ?");
                                            if (GantiJurusan == JOptionPane.YES_OPTION) {
                                                String JurusanBaru = JOptionPane.showInputDialog("Masukkan Jurusan Peminjam : ");
                                                data2[1][i] = JurusanBaru;
                                            }

                                            int GantiTgl = JOptionPane.showConfirmDialog(null, " INGIN MENGGANTI TANGGAL PINJAM BUKU ?");
                                            if (GantiTgl == JOptionPane.YES_OPTION) {
                                                String TglBaru = JOptionPane.showInputDialog("Masukkan Tanggal Baru : ");
                                                data2[2][i] = TglBaru;
                                            }

                                            int GantiJudulBuku = JOptionPane.showConfirmDialog(null, " INGIN MENGGANTI JUDUL BUKU YANG DIPINJAM ?");
                                            if (GantiJudulBuku == JOptionPane.YES_OPTION) {
                                                for (int j = 0; j < 3; j++) {
                                                    if (Buku[i][j] == null) {
                                                        break;
                                                    } else {
                                                        Buku[i][j] = JOptionPane.showInputDialog("Ganti Judul Buku ke : " + (j + 1));
                                                        if (j < 2 && Buku[i][0] != null && Buku[i][1] != null && Buku[i][2] != null) {
                                                            int gantiBuku = JOptionPane.showConfirmDialog(null, "Ingin Menggati Judul Buku Lagi?", "Ganti Judul Buku", JOptionPane.YES_NO_CANCEL_OPTION);
                                                            if (gantiBuku == JOptionPane.YES_OPTION) {
                                                            } else if (gantiBuku == JOptionPane.NO_OPTION) {
                                                                break;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }

                                    } else {
                                    }
                                }
                                SemuaBuku = "";
                                break;

                            case 2:
                                String CariNama = JOptionPane.showInputDialog(null, "Masukkan Nama Peminjam : \n");
                                for (int i = 0; i < data1[0].length; i++) {
                                    if (CariNama.equalsIgnoreCase(data2[0][i])) {

                                        for (int j = 0; j < 3; j++) {
                                            if (Buku[i][j] != null) {
                                                SemuaBuku += (j + 1) + ". " + Buku[i][j] + "\n";
                                            } else {
                                            }
                                        }

                                        JOptionPane.showMessageDialog(null, "Detail Peminjam Buku Perpustakaan UNU BLITAR \n======================================"
                                                + "\nNIM PEMINJAM        : " + data1[0][i] + "\n"
                                                + "NAMA PEMINJAM    : " + data2[0][i] + "\n"
                                                + "JURUSAN                 : " + data2[1][i] + "\n"
                                                + "TGL PINJAM BUKU  : " + data2[2][i] + "\n"
                                                + "\nJUDUL BUKU YANG DI PINJAM : \n"
                                                + SemuaBuku + "\n"
                                                + "======================================");

                                        int GantiData = JOptionPane.showConfirmDialog(null, " APAKAH ANDA INGIN MENGGANTI DATA PEMINJAM ?");
                                        if (GantiData == JOptionPane.YES_OPTION) {

                                            int GantiNim = JOptionPane.showConfirmDialog(null, " INGIN MENGGANTI NIM PEMINJAM ?");
                                            if (GantiNim == JOptionPane.YES_OPTION) {
                                                String NimBaru = JOptionPane.showInputDialog("Masukkan NIM Baru");
                                                int nimTelahDiganti = Integer.valueOf(NimBaru);
                                                data1[0][i] = nimTelahDiganti;
                                            }

                                            int GantiNama = JOptionPane.showConfirmDialog(null, " INGIN MENGGANTI NAMA PEMINJAM ?");
                                            if (GantiNama == JOptionPane.YES_OPTION) {
                                                String NamaBaru = JOptionPane.showInputDialog("Masukkan Nama Baru");
                                                data2[0][i] = NamaBaru;
                                            }

                                            int GantiJurusan = JOptionPane.showConfirmDialog(null, " INGIN MENGGANTI JURUSAN PEMINJAM ?");
                                            if (GantiJurusan == JOptionPane.YES_OPTION) {
                                                String JurusanBaru = JOptionPane.showInputDialog("Masukkan Jurusan Peminjam : ");
                                                data2[1][i] = JurusanBaru;
                                            }

                                            int GantiTgl = JOptionPane.showConfirmDialog(null, " INGIN MENGGANTI TANGGAL PINJAM BUKU ?");
                                            if (GantiTgl == JOptionPane.YES_OPTION) {
                                                String TglBaru = JOptionPane.showInputDialog("Masukkan Tanggal Baru : ");
                                                data2[2][i] = TglBaru;
                                            }

                                            int GantiJudulBuku = JOptionPane.showConfirmDialog(null, " INGIN MENGGANTI JUDUL BUKU YANG DIPINJAM ?");
                                            if (GantiJudulBuku == JOptionPane.YES_OPTION) {
                                                for (int j = 0; j < 3; j++) {
                                                    if (Buku[i][j] == null) {
                                                        break;
                                                    } else {
                                                        Buku[i][j] = JOptionPane.showInputDialog("Ganti Judul Buku ke : " + (j + 1));
                                                        if (j < 2 && Buku[i][0] != null && Buku[i][1] != null && Buku[i][2] != null) {
                                                            int gantiBuku = JOptionPane.showConfirmDialog(null, "Ingin Menggati Judul Buku Lagi?", "Ganti Judul Buku", JOptionPane.YES_NO_CANCEL_OPTION);
                                                            if (gantiBuku == JOptionPane.YES_OPTION) {
                                                            } else if (gantiBuku == JOptionPane.NO_OPTION) {
                                                                break;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }

                                    } else {                                        
                                    }
                                }
                                SemuaBuku = "";
                                break;

                            case 3:
                                String CariJurusan = JOptionPane.showInputDialog(null, "Masukkan Jurusan Peminjam : \n");
                                for (int i = 0; i < data1[0].length; i++) {
                                    if (CariJurusan.equalsIgnoreCase(data2[1][i])) {

                                        for (int j = 0; j < 3; j++) {
                                            if (Buku[i][j] != null) {
                                                SemuaBuku += (j + 1) + ". " + Buku[i][j] + "\n";
                                            } else {
                                            }
                                        }

                                        JOptionPane.showMessageDialog(null, "Detail Peminjam Buku Perpustakaan UNU BLITAR \n======================================"
                                                + "\nNIM PEMINJAM        : " + data1[0][i] + "\n"
                                                + "NAMA PEMINJAM    : " + data2[0][i] + "\n"
                                                + "JURUSAN                 : " + data2[1][i] + "\n"
                                                + "TGL PINJAM BUKU  : " + data2[2][i] + "\n"
                                                + "\nJUDUL BUKU YANG DI PINJAM : \n"
                                                + SemuaBuku + "\n"
                                                + "======================================");

                                        int GantiData = JOptionPane.showConfirmDialog(null, " APAKAH ANDA INGIN MENGGANTI DATA PEMINJAM ?");
                                        if (GantiData == JOptionPane.YES_OPTION) {

                                            int GantiNim = JOptionPane.showConfirmDialog(null, " INGIN MENGGANTI NIM PEMINJAM ?");
                                            if (GantiNim == JOptionPane.YES_OPTION) {
                                                String NimBaru = JOptionPane.showInputDialog("Masukkan NIM Baru");
                                                int nimTelahDiganti = Integer.valueOf(NimBaru);
                                                data1[0][i] = nimTelahDiganti;
                                            }

                                            int GantiNama = JOptionPane.showConfirmDialog(null, " INGIN MENGGANTI NAMA PEMINJAM ?");
                                            if (GantiNama == JOptionPane.YES_OPTION) {
                                                String NamaBaru = JOptionPane.showInputDialog("Masukkan Nama Baru");
                                                data2[0][i] = NamaBaru;
                                            }

                                            int GantiJurusan = JOptionPane.showConfirmDialog(null, " INGIN MENGGANTI JURUSAN PEMINJAM ?");
                                            if (GantiJurusan == JOptionPane.YES_OPTION) {
                                                String JurusanBaru = JOptionPane.showInputDialog("Masukkan Jurusan Peminjam : ");
                                                data2[1][i] = JurusanBaru;
                                            }

                                            int GantiTgl = JOptionPane.showConfirmDialog(null, " INGIN MENGGANTI TANGGAL PINJAM BUKU ?");
                                            if (GantiTgl == JOptionPane.YES_OPTION) {
                                                String TglBaru = JOptionPane.showInputDialog("Masukkan Tanggal Baru : ");
                                                data2[2][i] = TglBaru;
                                            }

                                            int GantiJudulBuku = JOptionPane.showConfirmDialog(null, " INGIN MENGGANTI JUDUL BUKU YANG DIPINJAM ?");
                                            if (GantiJudulBuku == JOptionPane.YES_OPTION) {
                                                for (int j = 0; j < 3; j++) {
                                                    if (Buku[i][j] == null) {
                                                        break;
                                                    } else {
                                                        Buku[i][j] = JOptionPane.showInputDialog("Ganti Judul Buku ke : " + (j + 1));
                                                        if (j < 2 && Buku[i][0] != null && Buku[i][1] != null && Buku[i][2] != null) {
                                                            int gantiBuku = JOptionPane.showConfirmDialog(null, "Ingin Menggati Judul Buku Lagi?", "Ganti Judul Buku", JOptionPane.YES_NO_CANCEL_OPTION);
                                                            if (gantiBuku == JOptionPane.YES_OPTION) {
                                                            } else if (gantiBuku == JOptionPane.NO_OPTION) {
                                                                break;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }

                                    } else {                                      
                                    }
                                }
                                SemuaBuku = "";
                                break;

                            case 4:
                                String CariTgl = JOptionPane.showInputDialog(null, "Masukkan Tanggal Pinjam Buku : \n");
                                for (int i = 0; i < data1[0].length; i++) {
                                    if (CariTgl.equalsIgnoreCase(data2[2][i])) {

                                        for (int j = 0; j < 3; j++) {
                                            if (Buku[i][j] != null) {
                                                SemuaBuku += (j + 1) + ". " + Buku[i][j] + "\n";
                                            } else {
                                            }
                                        }

                                        JOptionPane.showMessageDialog(null, "Detail Peminjam Buku Perpustakaan UNU BLITAR \n======================================"
                                                + "\nNIM PEMINJAM        : " + data1[0][i] + "\n"
                                                + "NAMA PEMINJAM    : " + data2[0][i] + "\n"
                                                + "JURUSAN                 : " + data2[1][i] + "\n"
                                                + "TGL PINJAM BUKU  : " + data2[2][i] + "\n"
                                                + "\nJUDUL BUKU YANG DI PINJAM : \n"
                                                + SemuaBuku + "\n"
                                                + "======================================");

                                        int GantiData = JOptionPane.showConfirmDialog(null, " APAKAH ANDA INGIN MENGGANTI DATA PEMINJAM ?");
                                        if (GantiData == JOptionPane.YES_OPTION) {

                                            int GantiNim = JOptionPane.showConfirmDialog(null, " INGIN MENGGANTI NIM PEMINJAM ?");
                                            if (GantiNim == JOptionPane.YES_OPTION) {
                                                String NimBaru = JOptionPane.showInputDialog("Masukkan NIM Baru");
                                                int nimTelahDiganti = Integer.valueOf(NimBaru);
                                                data1[0][i] = nimTelahDiganti;
                                            }

                                            int GantiNama = JOptionPane.showConfirmDialog(null, " INGIN MENGGANTI NAMA PEMINJAM ?");
                                            if (GantiNama == JOptionPane.YES_OPTION) {
                                                String NamaBaru = JOptionPane.showInputDialog("Masukkan Nama Baru");
                                                data2[0][i] = NamaBaru;
                                            }

                                            int GantiJurusan = JOptionPane.showConfirmDialog(null, " INGIN MENGGANTI JURUSAN PEMINJAM ?");
                                            if (GantiJurusan == JOptionPane.YES_OPTION) {
                                                String JurusanBaru = JOptionPane.showInputDialog("Masukkan Jurusan Peminjam : ");
                                                data2[1][i] = JurusanBaru;
                                            }

                                            int GantiTgl = JOptionPane.showConfirmDialog(null, " INGIN MENGGANTI TANGGAL PINJAM BUKU ?");
                                            if (GantiTgl == JOptionPane.YES_OPTION) {
                                                String TglBaru = JOptionPane.showInputDialog("Masukkan Tanggal Baru : ");
                                                data2[2][i] = TglBaru;
                                            }

                                            int GantiJudulBuku = JOptionPane.showConfirmDialog(null, " INGIN MENGGANTI JUDUL BUKU YANG DIPINJAM ?");
                                            if (GantiJudulBuku == JOptionPane.YES_OPTION) {
                                                for (int j = 0; j < 3; j++) {
                                                    if (Buku[i][j] == null) {
                                                        break;
                                                    } else {
                                                        Buku[i][j] = JOptionPane.showInputDialog("Ganti Judul Buku ke : " + (j + 1));
                                                        if (j < 2 && Buku[i][0] != null && Buku[i][1] != null && Buku[i][2] != null) {
                                                            int gantiBuku = JOptionPane.showConfirmDialog(null, "Ingin Menggati Judul Buku Lagi?", "Ganti Judul Buku", JOptionPane.YES_NO_CANCEL_OPTION);
                                                            if (gantiBuku == JOptionPane.YES_OPTION) {
                                                            } else if (gantiBuku == JOptionPane.NO_OPTION) {
                                                                break;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }

                                    } else {                                       
                                    }
                                }
                                SemuaBuku = "";

                            case 5:
                                break;

                            default:
                                JOptionPane.showMessageDialog(null, "Maaf Yang Anda Masukkan Salah", "WARNING !!! ADA KESALAHAN", JOptionPane.ERROR_MESSAGE);
                                break;

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
                JOptionPane.showMessageDialog(null, "Maaf ! Yang Anda masukkan salah", "WARNING !!! ADA KESALAHAN", JOptionPane.ERROR_MESSAGE);
                System.out.println(e);
            }
        }

    }
}
