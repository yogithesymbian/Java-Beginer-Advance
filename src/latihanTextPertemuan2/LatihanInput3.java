/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanTextPertemuan2;

import javax.swing.JOptionPane;
import java.util.Locale;
import java.util.*;
/**
 *
 * @author Dani
 */
public class LatihanInput3 
{
//        jenis pelanggan
//        alat bermain
//        lama sewa
    
  
    public static void main(String[] args) 
    {
      //deklarasi my first out
      String jnsPelanggan=""; //untuk jenis member nanti
      int jnsP; //convert for jenis pelanggan
      
      String jnsAlat="";
      int jnsA;
     
    //========================== kalkulasi
      String jam="";
      int jamConvert;
      double lm = 0;
      double lm2 =0;
      double pajak = 0; // convert in kondisi
      double handling = 1500;
      
      
//      ===================
      String outputlus;
//      =====================
//      String otoped;
//      String pajak;
        
        jnsPelanggan = JOptionPane.showInputDialog(null,"Masukan Jenis Pelanggan"
                + "\n 1. Non Member "
                + "\n 2. Member","Program Peminjaman Alat Bermain", JOptionPane.INFORMATION_MESSAGE);
//      JOptionPane.showMessageDialog(null, jnsPelanggan);
        jnsP = Integer.parseInt(jnsPelanggan);
        
//NON MEMBER        
        if((jnsP == 1))
        {
            //================
            //ketentuan non member
            double hrgNm;
            hrgNm = 25000; //sepeda
            double hrgOt;
            hrgOt = 45000; //otoped

            String pajakNm;
            pajakNm = "8.5%"; //untuk report
            pajak = 0.085; //kalkulasi
            
            //================MENU OPTION TIME
                    String wkt1 ="1 hours 10 minutes";
                    String wkt2 ="1 hours 20 minutes";
                    String wkt3 ="2 hours";
                    String wktManual ="Contoh Ingin Bermain 3 jam , maka inputkan ANGKA 190";
                    
            
            
            String jnsM;
            jnsM = "Anda Sebagai \t: Non Member" ;
            JOptionPane.showMessageDialog(null, jnsM);
            
            //converting string to int
            jnsAlat = JOptionPane.showInputDialog(null,"Masukan Jenis Alat Bermain"
                    + "\n 1. Sepeda"
                    + "\n 2. Otoped","Program Peminjaman Alat Bermain", JOptionPane.INFORMATION_MESSAGE);
            jnsA = Integer.parseInt(jnsAlat);
            
            //to choose jenis alat bermain
      // SEPEDA ===== NON MEMBER ======================================================================== 
            if((jnsA == 1))
            {
                String jnsSpd;
                jnsSpd = "Jenis Alat Pilihan \t: Sepeda" ;
                JOptionPane.showMessageDialog(null, jnsSpd);
                    
                    jam = JOptionPane.showInputDialog(null,"Masukan Nomor Pilihan Lama Bermain"
                            + "\n (1).  " +wkt1
                            + "\n (2).  " +wkt2
                            + "\n (3).  " +wkt3
                            + "\n ======================"
                                    + "\n Tidak ada di Pilihan ?"
                                    + "\n Masukan Sembarang Menit"
                                    + "\n "+wktManual
                                    + "\n"
                                            + "\n                                            (C) 2018 @aw.yogi"
                            ,"Program Peminjaman Alat Bermain", JOptionPane.INFORMATION_MESSAGE);
                    
                    //converting jam double to int untuk if
                    jamConvert = Integer.parseInt(jam);
                    if((jamConvert > 3))
                    {
                       
                         // i create new obj
                         LatihanInput3 yogi;
                         yogi = new LatihanInput3();
                         yogi.hitung(); // run yogi method 
                         
                         
                         //report lama bermain
                         String lamaBanget;
                         lamaBanget = " Lama Bermain \t: " +jamConvert +" Menit" ;
                         JOptionPane.showMessageDialog(null, lamaBanget);
                         
                         //kalkulasi
                         lm2 = jamConvert;
                         lm = lm2/60;
                         double totalBi;
                         totalBi = (1+pajak) * (lm*(hrgNm+handling));
                         
                          String saYogi;
                          String mataUang = String.format("Rp.%,.0f",hrgNm).replaceAll(",",".")+",00";
                          String totUang = String.format("Rp.%,.0f",totalBi).replaceAll(",",".")+",00";
                            saYogi = "Report Sewa"
                                    + "\n ===================="
                                    + "\n 1. " +jnsM
                                    + "\n 2. " +jnsSpd
                                    + "\n 3. " +lamaBanget
                                    + "\n ===================="
                                    + "\n Biaya Sewa : " +mataUang
                                    + "\n Pajak : " +pajakNm
                                    + "\n ===================="
                                    + "\n Total Biaya : " +totUang;
                            JOptionPane.showMessageDialog(null, saYogi,"Program Peminjaman Alat Bermain", JOptionPane.INFORMATION_MESSAGE);
                            
                            //method to sls
                            LatihanInput3 terAkhir;
                            terAkhir = new LatihanInput3();
                            terAkhir.selesai();
                    }
            //pilihan sudah ada==============================================
                    if((jamConvert == 1))
                    {
                         String lamaBanget;
                         String lamaPlay="";
                         lamaPlay = wkt1;
                         lamaBanget = " Lama Bermain \t: "+lamaPlay ;
                         JOptionPane.showMessageDialog(null, lamaBanget);
                         
                         // i create new obj
                         LatihanInput3 yogi;
                         yogi = new LatihanInput3();
                         yogi.hitung(); // run yogi method 
                         
                         lm2 = 70; //lama bermain
                         lm = lm2/60;
                         
                         double totalBi;
                         //rumus kalkulasi
                         totalBi = (1+pajak) * (lm*(hrgNm+handling));
                          String saYogi;
                          String mataUang = String.format("Rp.%,.0f",hrgNm).replaceAll(",",".")+",00";
                          String totUang = String.format("Rp.%,.0f",totalBi).replaceAll(",",".")+",00";
                            saYogi = "Report Sewa"
                                    + "\n ===================="
                                    + "\n 1. " +jnsM
                                    + "\n 2. " +jnsSpd
                                    + "\n 3. " +lamaBanget
                                    + "\n ===================="
                                    + "\n Biaya Sewa : " +mataUang
                                    + "\n Pajak : " +pajakNm
                                    + "\n ===================="
                                    + "\n Total Biaya : " +totUang;
                            JOptionPane.showMessageDialog(null, saYogi,"Program Peminjaman Alat Bermain", JOptionPane.INFORMATION_MESSAGE); 
                            
                            //method try again
                            LatihanInput3 terAkhir;
                            terAkhir = new LatihanInput3();
                            terAkhir.selesai();
                    }
                    if((jamConvert == 2))
                    {
                         String lamaBanget;
                         String lamaPlay="";
                         lamaPlay = wkt2;
                         lamaBanget = " Lama Bermain \t: "+lamaPlay ;
                         JOptionPane.showMessageDialog(null, lamaBanget);
                         
                         // i create new obj
                         LatihanInput3 yogi;
                         yogi = new LatihanInput3();
                         yogi.hitung(); // run yogi method 
                         
                         lm2 = 80; //lama bermain
                         lm = lm2/60;
                         
                         double totalBi;
                         //rumus kalkulasi
                         totalBi = (1+pajak) * (lm*(hrgNm+handling));
                          String saYogi;
                          String mataUang = String.format("Rp.%,.0f",hrgNm).replaceAll(",",".")+",00";
                          String totUang = String.format("Rp.%,.0f",totalBi).replaceAll(",",".")+",00";
                            saYogi = "Report Sewa"
                                    + "\n ===================="
                                    + "\n 1. " +jnsM
                                    + "\n 2. " +jnsSpd
                                    + "\n 3. " +lamaBanget
                                    + "\n ===================="
                                    + "\n Biaya Sewa : " +mataUang
                                    + "\n Pajak : " +pajakNm
                                    + "\n ===================="
                                    + "\n Total Biaya : " +totUang;
                            JOptionPane.showMessageDialog(null, saYogi,"Program Peminjaman Alat Bermain", JOptionPane.INFORMATION_MESSAGE);
                            
                            //method try again
                            LatihanInput3 terAkhir;
                            terAkhir = new LatihanInput3();
                            terAkhir.selesai();
                    }
                    if((jamConvert == 3))
                    {
                         String lamaBanget;
                         String lamaPlay="";
                         lamaPlay = wkt3;
                         lamaBanget = " Lama Bermain \t: "+lamaPlay ;
                         JOptionPane.showMessageDialog(null, lamaBanget);
                         
                         // i create new obj
                         LatihanInput3 yogi;
                         yogi = new LatihanInput3();
                         yogi.hitung(); // run yogi method 
                         
                         lm2 = 120; //lama bermain
                         lm = lm2/60;
                         
                         double totalBi;
                         //rumus kalkulasi
                         totalBi = (1+pajak) * (lm*(hrgNm+handling));
                          String saYogi;
                          String mataUang = String.format("Rp.%,.0f",hrgNm).replaceAll(",",".")+",00";
                          String totUang = String.format("Rp.%,.0f",totalBi).replaceAll(",",".")+",00";
                            saYogi = "Report Sewa"
                                    + "\n ===================="
                                    + "\n 1. " +jnsM
                                    + "\n 2. " +jnsSpd
                                    + "\n 3. " +lamaBanget
                                    + "\n ===================="
                                    + "\n Biaya Sewa : " +mataUang
                                    + "\n Pajak : " +pajakNm
                                    + "\n ===================="
                                    + "\n Total Biaya : " +totUang;
                            JOptionPane.showMessageDialog(null, saYogi,"Program Peminjaman Alat Bermain", JOptionPane.INFORMATION_MESSAGE);
                            
                            //method try again
                            LatihanInput3 terAkhir;
                            terAkhir = new LatihanInput3();
                            terAkhir.selesai();
                    }
                
// OTOPED ===== NON MEMBER ======================================================================== 
            }
            else if((jnsA == 2))
            {
                String jnsSpd;
                jnsSpd = "Jenis Alat Pilihan \t: Otoped" ;
                JOptionPane.showMessageDialog(null, jnsSpd);
                    
                    jam = JOptionPane.showInputDialog(null,"Masukan Nomor Pilihan Lama Bermain"
                            + "\n (1).  " +wkt1
                            + "\n (2).  " +wkt2
                            + "\n (3).  " +wkt3
                            + "\n ======================"
                                    + "\n Tidak ada di Pilihan ?"
                                    + "\n Masukan Sembarang Menit"
                                    + "\n "+wktManual
                                    + "\n"
                                            + "\n [Anda belum Membeli Licensi]"
                                            + "\n Feature Pilihan Not Available"
                                            + "\n Silahkan Input Manual"
                                            + "\n                                            (C) 2018 @aw.yogi"
                            ,"Program Peminjaman Alat Bermain", JOptionPane.INFORMATION_MESSAGE);
                    
                    //converting jam double to int untuk if
                    jamConvert = Integer.parseInt(jam);
                    if((jamConvert >= 1))
                    {
                       
                         // i create new obj
                         LatihanInput3 yogi;
                         yogi = new LatihanInput3();
                         yogi.hitung(); // run yogi method 
                         
                         
                         //report lama bermain
                         String lamaBanget;
                         lamaBanget = " Lama Bermain \t: " +jamConvert +" Menit" ;
                         JOptionPane.showMessageDialog(null, lamaBanget);
                         
                         //kalkulasi
                         lm2 = jamConvert;
                         lm = lm2/60;
                         double totalBi;
                         totalBi = (1+pajak) * (lm*(hrgOt+handling));
                         
                          String saYogi;
                          String mataUang = String.format("Rp.%,.0f",hrgOt).replaceAll(",",".")+",00";
                          String totUang = String.format("Rp.%,.0f",totalBi).replaceAll(",",".")+",00";
                            saYogi = "Report Sewa"
                                    + "\n ===================="
                                    + "\n 1. " +jnsM
                                    + "\n 2. " +jnsSpd
                                    + "\n 3. " +lamaBanget
                                    + "\n ===================="
                                    + "\n Biaya Sewa : " +mataUang
                                    + "\n Pajak : " +pajakNm
                                    + "\n ===================="
                                    + "\n Total Biaya : " +totUang;
                            JOptionPane.showMessageDialog(null, saYogi,"Program Peminjaman Alat Bermain", JOptionPane.INFORMATION_MESSAGE);
                            
                            //method to sls
                            LatihanInput3 terAkhir;
                            terAkhir = new LatihanInput3();
                            terAkhir.selesai();
                    }
            }
            else
            {
                LatihanInput3 keSalah;
                keSalah = new LatihanInput3();
                keSalah.errorIn();
            }
        }
//MEMBER =======
        else if((jnsP == 2))
        {
            //================
            //ketentuan Member
            double hrgMm;
            hrgMm = 15000; //sepeda
            double hrgOtmm;
            hrgOtmm = 20000; //otoped
            
            String pajakMm;
            pajakMm = "12.5%"; //untuk report
            pajak = 0.125; //kalkulasi
            
            //================MENU OPTION TIME
                    String wkt1 ="1 hours 10 minutes";
                    String wkt2 ="1 hours 20 minutes";
                    String wkt3 ="2 hours";
                    String wktManual ="Contoh Ingin Bermain 3 jam , maka inputkan ANGKA 190";
                    
            
            
            String jnsM;
            jnsM = "Anda Sebagai \t: Member" ;
            JOptionPane.showMessageDialog(null, jnsM);
            
            //converting string to int
            jnsAlat = JOptionPane.showInputDialog(null,"Masukan Jenis Alat Bermain"
                    + "\n 1. Sepeda "
                    + "\n 2. Otoped "
                    ,"Program Peminjaman Alat Bermain", JOptionPane.INFORMATION_MESSAGE);
            jnsA = Integer.parseInt(jnsAlat);
            
// SEPEDA ===== MEMBER ========================================================================
          switch (jnsA) {
              case 1:
                  {
                      String jnsSpd;
                      jnsSpd = "Jenis Alat Pilihan \t: Sepeda" ;
                      JOptionPane.showMessageDialog(null, jnsSpd);
                      jam = JOptionPane.showInputDialog(null,"Masukan Nomor Pilihan Lama Bermain"
                              + "\n (1).  " +wkt1
                              + "\n (2).  " +wkt2
                              + "\n (3).  " +wkt3
                              + "\n ======================"
                                      + "\n Tidak ada di Pilihan ?"
                                      + "\n Masukan Sembarang Menit"
                                      + "\n "+wktManual
                              + "\n"
                                      + "\n [Anda belum Membeli Licensi]"
                                      + "\n Feature Pilihan Not Available"
                                      + "\n Silahkan Input Manual"
                                      + "\n                                            (C) 2018 @aw.yogi"
                              ,"Program Peminjaman Alat Bermain", JOptionPane.INFORMATION_MESSAGE);
                      //converting jam double to int untuk if
                      jamConvert = Integer.parseInt(jam);
                      if((jamConvert >= 1))
                      {
                          
                          // i create new obj
                          LatihanInput3 yogi;
                          yogi = new LatihanInput3();
                          yogi.hitung(); // run yogi method
                          
                          
                          //report lama bermain
                          String lamaBanget;
                          lamaBanget = " Lama Bermain \t: " +jamConvert +" Menit" ;
                          JOptionPane.showMessageDialog(null, lamaBanget);
                          
                          //kalkulasi
                          lm2 = jamConvert;
                          lm = lm2/60;
                          double totalBi;
                          totalBi = (1+pajak) * (lm*(hrgMm+handling));
                          
                          String saYogi;
                          String mataUang = String.format("Rp.%,.0f",hrgMm).replaceAll(",",".")+",00";
                          String totUang = String.format("Rp.%,.0f",totalBi).replaceAll(",",".")+",00";
                          saYogi = "Report Sewa"
                                  + "\n ===================="
                                  + "\n 1. " +jnsM
                                  + "\n 2. " +jnsSpd
                                  + "\n 3. " +lamaBanget
                                  + "\n ===================="
                                  + "\n Biaya Sewa : " +mataUang
                                  + "\n Pajak : " +pajakMm
                                  + "\n ===================="
                                  + "\n Total Biaya : " +totUang;
                          JOptionPane.showMessageDialog(null, saYogi,"Program Peminjaman Alat Bermain", JOptionPane.INFORMATION_MESSAGE);
                          
                          //method to sls
                          LatihanInput3 terAkhir;
                          terAkhir = new LatihanInput3();
                          terAkhir.selesai();
                      } break;
                  }
// OTOPED ===== MEMBER ========================================================================
              case 2:
                  {
                      String jnsSpd;
                      jnsSpd = "Jenis Alat Pilihan \t: Sepeda" ;
                      JOptionPane.showMessageDialog(null, jnsSpd);
                      jam = JOptionPane.showInputDialog(null,"Masukan Nomor Pilihan Lama Bermain"
                              + "\n (1).  " +wkt1
                              + "\n (2).  " +wkt2
                              + "\n (3).  " +wkt3
                              + "\n ======================"
                                      + "\n Tidak ada di Pilihan ?"
                                      + "\n Masukan Sembarang Menit"
                                      + "\n "+wktManual
                              + "\n"
                                      + "\n [Anda belum Membeli Licensi]"
                                      + "\n Feature Pilihan Not Available"
                                      + "\n Silahkan Input Manual"
                                      + "\n                                            (C) 2018 @aw.yogi"
                              ,"Program Peminjaman Alat Bermain", JOptionPane.INFORMATION_MESSAGE);
                      //converting jam double to int untuk if
                      jamConvert = Integer.parseInt(jam);
                      if((jamConvert >= 1))
                      {
                          
                          // i create new obj
                          LatihanInput3 yogi;
                          yogi = new LatihanInput3();
                          yogi.hitung(); // run yogi method
                          
                          
                          //report lama bermain
                          String lamaBanget;
                          lamaBanget = " Lama Bermain \t: " +jamConvert +" Menit" ;
                          JOptionPane.showMessageDialog(null, lamaBanget);
                          
                          //kalkulasi
                          lm2 = jamConvert;
                          lm = lm2/60;
                          double totalBi;
                          totalBi = (1+pajak) * (lm*(hrgOtmm+handling));
                          
                          String saYogi;
                          String mataUang = String.format("Rp.%,.0f",hrgOtmm).replaceAll(",",".")+",00";
                          String totUang = String.format("Rp.%,.0f",totalBi).replaceAll(",",".")+",00";
                          saYogi = "Report Sewa"
                                  + "\n ===================="
                                  + "\n 1. " +jnsM
                                  + "\n 2. " +jnsSpd
                                  + "\n 3. " +lamaBanget
                                  + "\n ===================="
                                  + "\n Biaya Sewa : " +mataUang
                                  + "\n Pajak : " +pajakMm
                                  + "\n ===================="
                                  + "\n Total Biaya : " +totUang;
                          JOptionPane.showMessageDialog(null, saYogi
                                  ,"Program Peminjaman Alat Bermain", JOptionPane.INFORMATION_MESSAGE);
                          
                          //method to sls
                          LatihanInput3 terAkhir;
                          terAkhir = new LatihanInput3();
                          terAkhir.selesai();
                      } break;
                  }
                  //in Jenis alat
              default:
                  LatihanInput3 keSalah;
                  keSalah = new LatihanInput3();
                  keSalah.errorIn();
                  break;
          }
        }
        //in jenis Pelanggan
        else
        {
            LatihanInput3 keSalah;
            keSalah = new LatihanInput3();
            keSalah.errorIn();
        }
    }
    
    public void selesai()
    {
        int jawab = JOptionPane.showOptionDialog(null,
                "Ingin Keluar ?",
                        "Keluar",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE,null,null,null);
        
        if(jawab == JOptionPane.YES_OPTION)
        {
            JOptionPane.showMessageDialog(null, "Program akan kelar");
            System.exit(0);
        }
    }
 
    public void hitung() 
    {
        
    }
    
    //method tampil hasil
    public void errorIn()
    {
    String errorIn = "Silahkan Inputkan Data Dengan Benar";
    JOptionPane.showMessageDialog(null,errorIn,"ERROR",JOptionPane.ERROR_MESSAGE);
    }
}
