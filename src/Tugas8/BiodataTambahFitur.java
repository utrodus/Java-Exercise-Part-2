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

        // Deklarasi Data Mahasiswa dengan array
        int[] nim = {1855201003, 1855201004,
            1855201005, 1855201006, 1855201007,
            1855201008, 1855201009, 1855201010, 1855201011, 1855201012};

        String[] nama = {"M. SUGIARTO", "M. MAULANA IKHSAN",
            "CITRA MIRNA WATI", "UTRODUS SAID AL BAQI", "MUHAMMAD YUSUF ASHARI",
            "MUHAMMAD LUTFI ASHARI", "DEWI LESTARI", "MUHAMMAD NAUFAL S.",
            "MUHAMAD RIZAL S.", "MUH. FATWA ZAYYINI FATHI"};

        double[] Ipk = {3.4, 3.5, 3.6, 3.6, 3.8,
            3.5, 3.4, 3.7, 3.3, 3.4,};

        // Deklarasi Variable        
        // Untuk pengulangan aplikasi
        boolean isRunning = true;

        // Untuk penyimpanan semua array
        String SemuaData = "";

        // Gretting 
        JOptionPane.showMessageDialog(null, "Selamat Datang Di Aplikasi Biodata \n Mahasiswa ILKOM 2-A UNU BLITAR");

        // Pengulangan program    
        while (isRunning) {
            try {
                // ============= MENGAMBIL INPUT USER UNTUK MEMILIH MENU =============
                String InputUser = JOptionPane.showInputDialog(
                        "==== Menu Aplikasi Biodata Mahasiswa ==== \n"
                        + "\n1. Tampilkan Data Keseluruhan "
                        + "\n2. Cari Data Mahasiswa"
                        + "\n3. Ganti Data Mahasiswa"
                        + "\n4. Keluar \n\n"
                );

                int Menu = Integer.valueOf(InputUser);

                if (Menu > 4 || Menu < 1) {
                    JOptionPane.showMessageDialog(null, "Yang Anda Masukkan Salah");
                } else {

                    // ============= MENAMPILKAN DATA =============
                    if (Menu == 1) {

                        // Mengambil semua isi array dengan for kemudian dimasukkan atau ditambahkan kedalam variable SemuaData
                        for (int i = 0; i < Ipk.length; i++) {
                            SemuaData += (i + 1) + ". " + nim[i] + " - " + nama[i] + " - Ipk: (" + Ipk[i] + ")" + "\n";
                        }

                        JOptionPane.showMessageDialog(null, " ##### Data Mahasiswa ##### \n\n" + SemuaData + "\n");

                        // Isi variable Semua data yang telah ditampilkan di JoptionPane dikosongkan kembali supaya tidak ada duplikasi
                        // atau ditampilkan dua kali
                        SemuaData = "";
                    }

                    
                    // ============= MENCARI DATA =============
                    if (Menu == 2) {

                        String CariData = JOptionPane.showInputDialog("Pilih Data yang akan dicari berdasarkan : \n"
                                + "\n1. NIM "
                                + "\n2. NAMA"
                                + "\n3. IPK"
                                + "\n\n"
                        );
                        int Data = Integer.valueOf(CariData);

                        if (Data < 0 || Data > 3) {
                            JOptionPane.showMessageDialog(null, "Maaf ! Yang anda masukkan salah");
                        } else {
                            // *Mencari Berdasarkan NIM
                            if (Data == 1) {

                                String CariNim = JOptionPane.showInputDialog(null, "Masukkan Nim yang ingin anda cari \n");
                                int FindNim = Integer.valueOf(CariNim);

                                for (int i = 0; i < nim.length; i++) {
                                    if (FindNim == nim[i]) {
                                        JOptionPane.showMessageDialog(null, "Biodata \nILKOM A 2018 \n==================="
                                                + "\nNIM        : " + nim[i] + "\n"
                                                + "NAMA     : " + nama[i] + "\n"
                                                + "IPK         : " + Ipk[i]
                                                + "\n===================");

                                        int GantiNim = JOptionPane.showConfirmDialog(null, " Apakah Anda Ingin Menggantinya ?");
                                        if (GantiNim == JOptionPane.YES_OPTION) {
                                            String NimBaru = JOptionPane.showInputDialog("Masukkan NIM Baru");
                                            int nimTelahDiganti = Integer.valueOf(NimBaru);
                                            nim[i] = nimTelahDiganti;
                                            JOptionPane.showMessageDialog(null, "Nim telah diganti menjadi : " + nim[i]);
                                        }
                                    }
                                }
                            }

                            // * Mencari Berdasarkan Nama
                            if (Data == 2) {
                                String CariNama = JOptionPane.showInputDialog(null, "Masukkan Nama yang ingin anda cari \n");

                                for (int i = 0; i < nama.length; i++) {
                                    if (CariNama.equalsIgnoreCase(nama[i])) {
                                        JOptionPane.showMessageDialog(null, "Biodata \nILKOM A 2018 \n==================="
                                                + "\nNIM        : " + nim[i] + "\n"
                                                + "NAMA     : " + nama[i] + "\n"
                                                + "IPK         : " + Ipk[i]
                                                + "\n===================");

                                        int GantiNama = JOptionPane.showConfirmDialog(null, " Apakah Anda Ingin Menggantinya ?");
                                        if (GantiNama == JOptionPane.YES_OPTION) {
                                            String NamaBaru = JOptionPane.showInputDialog("Masukkan Nama Baru");
                                            nama[i] = NamaBaru;
                                            JOptionPane.showMessageDialog(null, "Nama telah diganti menjadi : " + nama[i]);
                                        }
                                    }
                                }
                            }

                            // * Mencari Berdasarkan Ipk
                            if (Data == 3) {
                                String CariIpk = JOptionPane.showInputDialog(null, "Masukkan IPK yang ingin anda cari");
                                Double findIpk = Double.valueOf(CariIpk);

                                for (int i = 0; i < Ipk.length; i++) {
                                    if (findIpk == Ipk[i]) {
                                        JOptionPane.showMessageDialog(null, "Biodata \nILKOM A 2018 \n==================="
                                                + "\nNIM        : " + nim[i] + "\n"
                                                + "NAMA     : " + nama[i] + "\n"
                                                + "IPK         : " + Ipk[i]
                                                + "\n===================");

                                        int GantiIpk = JOptionPane.showConfirmDialog(null, " Apakah Anda Ingin Menggantinya ?");
                                        if (GantiIpk == JOptionPane.YES_OPTION) {
                                            String IpkBaru = JOptionPane.showInputDialog("Masukkan Ipk Baru");
                                            Double IpktelahDiganti = Double.valueOf(IpkBaru);
                                            Ipk[i] = IpktelahDiganti;
                                            JOptionPane.showMessageDialog(null, "Ipk telah diganti menjadi : " + Ipk[i]);
                                        }
                                    }
                                }

                            }
                        }

                    }

                    // ============= MENGGANTI DATA =============
                    if (Menu == 3) {
                        String gantiData = JOptionPane.showInputDialog("Pilih Data yang akan diganti berdasarkan : \n"
                                + "\n1. NIM "
                                + "\n2. NAMA"
                                + "\n3. IPK"
                                + "\n");
                        int Data = Integer.valueOf(gantiData);
                        if (Data < 0 || Data > 3) {
                            JOptionPane.showMessageDialog(null, "Maaf ! Yang anda masukkan salah");
                        } else {
                            // * ganti nim
                            if (Data == 1) {

                                String CariNim = JOptionPane.showInputDialog(null, "Masukkan Nim yang ingin anda Ganti");
                                int dataNIM = Integer.valueOf(CariNim);

                                for (int i = 0; i < nim.length; i++) {
                                    if (dataNIM == nim[i]) {
                                        int GantiNim = JOptionPane.showConfirmDialog(null, "NIM " + nim[i] + " Telah Ditemukan,\n Apakah Anda benar-benar Ingin Menggantinya ?");
                                        if (GantiNim == JOptionPane.YES_OPTION) {
                                            String NimBaru = JOptionPane.showInputDialog("Masukkan NIM Baru");
                                            int nimTelahDiganti = Integer.valueOf(NimBaru);
                                            nim[i] = nimTelahDiganti;
                                            JOptionPane.showMessageDialog(null, "Nim telah diganti menjadi : " + nim[i]);
                                        }
                                    } else {
                                        JOptionPane.showMessageDialog(null, "Maaf ! Nim tidak ditemukan");
                                        break;
                                    }
                                }
                            }

                            // * ganti nama
                            if (Data == 2) {

                                String CariNama = JOptionPane.showInputDialog(null, "Masukkan Nama yang ingin anda Ganti");

                                for (int i = 0; i < nama.length; i++) {
                                    if (CariNama.equalsIgnoreCase(nama[i])) {
                                        int GantiNama = JOptionPane.showConfirmDialog(null, "Nama : " + nama[i] + " Telah Ditemukan,\n Apakah Anda benar-benar Ingin Menggantinya ?");
                                        if (GantiNama == JOptionPane.YES_OPTION) {
                                            String NamaBaru = JOptionPane.showInputDialog("Masukkan Nama Baru");
                                            nama[i] = NamaBaru;
                                            JOptionPane.showMessageDialog(null, "Nama telah diganti menjadi : " + nama[i]);
                                        }
                                    } else {
                                        JOptionPane.showMessageDialog(null, "Maaf ! Nama tidak ditemukan");
                                        break;
                                    }

                                }
                            }

                            // * ganti ipk
                            if (Data == 3) {
                                String CariIpk = JOptionPane.showInputDialog(null, "Masukkan IPK yang ingin anda Ganti");
                                Double GantiIpk = Double.valueOf(CariIpk);

                                for (int i = 0; i < Ipk.length; i++) {
                                    if (GantiIpk == Ipk[i]) {
                                        int IpkBaruConfirm = JOptionPane.showConfirmDialog(null, "IPK : " + Ipk[i] + " Telah Ditemukan,\n Apakah Anda benar-benar Ingin Menggantinya ?");

                                        if (IpkBaruConfirm == JOptionPane.YES_OPTION) {
                                            String IpkBaru = JOptionPane.showInputDialog("Masukkan Ipk Baru");
                                            Double IpktelahDiganti = Double.valueOf(IpkBaru);
                                            Ipk[i] = IpktelahDiganti;
                                            JOptionPane.showMessageDialog(null, "Ipk telah diganti menjadi : " + Ipk[i]);
                                        }
                                    } else {
                                        JOptionPane.showMessageDialog(null, "Maaf ! IPK tidak ditemukan");
                                        break;
                                    }

                                }

                            }
                        }

                    }

                    // ============= KELUAR APLIKASI =============
                    if (Menu == 4) {
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
