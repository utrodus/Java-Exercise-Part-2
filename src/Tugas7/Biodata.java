/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas7;

import javax.swing.JOptionPane;

/**
 *
 * @author saidalbaqi
 */
public class Biodata {
    public static void main(String[] args) {
        // Tugas : 
        // Membuat tampilan GUI dengan joptionpane Biodata Ilkom A 2018 dengan konsep Array
        // isinya ada : 
        // Nim (long) :
        // Nama (string) : 
        // Alamat (string) :
        
        long[] nim = {1854231010,1855201003,1855201004,
                      1855201005,1855201006,1855201007,
                      1855201008,1855201009,1855201010,
                      1855201011,1855201012,1855201013,
                      1855201015,1855201016,1855201017,
                      1855201018,1855201019,1855201020,
                      1855201022,1855201027,1855201028,
                      1855201030,1855201033,1855201036,
                      1855201038,1855201039,1855201041,
                      1855201044,1855201051,1855201054,
                      1855201066,1855201078,1855201074,
                      1855201047};
        
        String[] nama = {"ASNA ANDI AULADI","M. SUGIARTO","M. MAULANA IKHSAN", 
                         "CITRA MIRNA WATI", "UTRODUS SAID AL BAQI", "MUHAMMAD YUSUF ASHARI",
                            "MUHAMMAD LUTFI ASHARI","DEWI LESTARI","MUHAMMAD NAUFAL S.",
                            "MUHAMAD RIZAL S.","MUH. FATWA ZAYYINI FATHI","IQBAL FIKRI AL HADI",
                            "MUJAWADATUL KHULUQ","CHOIRUNNUFATUL CHUSNA", "ENDAH SRIWAHYUNI",
                            "FATURRAHMAN","WALIDATUL ISNA K.","MHD. HASBY NAZARUDIN",
                            "A. ZAINUL MUTTAQIH SPH","DHIAZMI A. N.","MUHAMMAD RO'UF F.",
                            "IQBAL MUBAROQ","MOCHAMAD BUQORI MUSLIM","NENI FEBIANI",
                            "IZULMA SULTAN AQIL","YUNI SULISTIAWATI","MIFTAKHUL 'ULUM",
                            "BERLY DHANA I.","M. RISKI BALIAN","IKE WAHYU SEPTIANI",
                            "MOHAMAD CHIRZUDIN","ALFIAN DWI SUSILO","KANA ACHSANUR RIJAL",
                            "SAFRINADI ILHAM"};
        
        String[] alamat = {"Tulungagung","Papungan","Papungan","Klampok","Sananwetan",
                            "Penataran", "Penataran","Kademangan","Tulungagung","Sutojayan",
                            "Kediri","Kademangan","Selopuro","Udan Awu","Udan Awu",
                            "Talun","Sawentar","Binangun","Sanan kulon","Binangun",
                            "Kediri Kras","Talun","Kediri Kras","Kademangan","Kalimantan",
                            "Srengat","Suroboyo","Sambi","Kediri","Papungan",
                            "Binangun","Talun","Talun","Papungan"};
        
        double[] Ipk = {3.4,3.5,3.6,3.6,3.8,
                        3.5,3.4,3.7,3.3,3.4,
                        3.9,3.36,3.3,3.45,3.56,
                        3.76,3.32,3.53,3.55,3.75,
                        3.9,3.44,3.54,3.32,3.54,
                        3.77,3.33,3.7,3.65,3.69,
                        3.45,3.54,3.43,3.77};
        
        
        for(int i=0; i<nim.length; i++){
            JOptionPane.showMessageDialog(null, "Biodata \nILKOM A 2018 \n==================="
                    + "\nNIM        : " + nim[i] + "\n"
                    + "NAMA     : " + nama[i] + "\n"
                    + "ALAMAT : " + alamat[i] + "\n"
                    + "IPK         : " + Ipk[i] +
                    "\n===================");
        }
    }
}
