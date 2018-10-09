/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penjualanTicket;

/**
 *
 * @author Dani
 */

import latihanTextPertemuan2.LatihanInput3;
import javax.swing.JOptionPane;
import java.util.Locale;
import java.util.*;

public class PusamaniaTicket {
    public static void main(String[] args) 
    {
      //deklarasi my first out
      String jnsPelanggan=""; //untuk jenis member nanti
      int jnsP; //convert for jenis pelanggan
      
      String jnsAlat="";
      int jnsA;
     
    //========================== kalkulasi  and choose tiket
      String jam="";
      int jamConvert;
      //
      
      //not use
      double lm = 0;
      double lm2 =0;
      double pajak = 0; // convert in kondisi
      double handling = 1500;
      
      //pusmania ticket ketentuan ini hanya untuk report
       String diskon1;
       diskon1 = "2.5%"; //untuk report
       String diskon2;
       diskon2 = "5%"; //untuk report
       
       //kalkulasi diskon non member dan member
       double diskonNm1=0;
       double diskonNm2=0;
       
       
       
       double noDiskon =0;
      
      
//      ===================
      String outputlus;
//      =====================
//      String otoped;
//      String pajak;
        
        jnsPelanggan = JOptionPane.showInputDialog(null,"Masukan Jenis Pelanggan"
                + "\n 1. Member "
                + "\n 2. Non Member","Program Pusamania Ticket", JOptionPane.INFORMATION_MESSAGE);
//      JOptionPane.showMessageDialog(null, jnsPelanggan);
        jnsP = Integer.parseInt(jnsPelanggan);
//MEMBER PUSAMANIA        
        if((jnsP == 1))
        {
            //================
            //ketentuan non member
            double hrgVip;
            hrgVip = 250000; //vip
            double hrgEks;
            hrgEks = 150000; //eksekutif
            double hrgTribun;
            hrgTribun = 75000; //tribun

           
            
            //================MENU OPTION TIME
                    String wkt1 ="Jika Beli 2 s/d 3 tiket diskon 2.5%";
                    String wkt2 ="Jika Beli 4 s/d 5 tiket diskon 5%";
                    String wkt3 ="NB : Max Beli tiket adalah 5";
                    
                    
            
            String jnsM;
            jnsM = "Anda Sebagai \t: Non Member" ;
            JOptionPane.showMessageDialog(null, jnsM);
            
            //converting string to int
            jnsAlat = JOptionPane.showInputDialog(null,"Masukan Kelas Ticket"
                    + "\n 1. VIP"
                    + "\n 2. EKSEKUTIF"
                    + "\n 3. Tribun","Program Pusamania Ticket", JOptionPane.INFORMATION_MESSAGE);
            jnsA = Integer.parseInt(jnsAlat);
            
            //to choose jenis tiket
      // VIP ===== MEMBER ======================================================================== 
            if((jnsA == 1))
            {
                String jnsSpd;
                jnsSpd = "Kelas Tiket Pilihan \t: VIP" ;
                JOptionPane.showMessageDialog(null, jnsSpd);
                    
                    jam = JOptionPane.showInputDialog(null,"Masukan Jumlah Tiket yang di Beli"
                            + "\n Keterangan"
                            + "\n (1).  " +wkt1
                            + "\n (2).  " +wkt2
                            + "\n (3).  " +wkt3
                            + "\n ======================"
                                    + "\n"
                                            + "\n                                            (C) 2018 @aw.yogi and Ramli"
                            ,"Program Pusamania Ticket", JOptionPane.INFORMATION_MESSAGE);
                    
                    //converting jam double to int untuk if
                    jamConvert = Integer.parseInt(jam);
                    
                    // jamConvert adalah inputan jumlah tiket
                    if((jamConvert == 1))
                    {
//                         // i create new obj
//                         LatihanInput3 yogi;
//                         yogi = new LatihanInput3();
//                         yogi.hitung(); // run yogi method 
                         
                         
                         //report banyak tiket
                         String lamaBanget;
                         lamaBanget = " Jumlah Tiket yang Di Beli \t: " +jamConvert +" PCS" ;
                         JOptionPane.showMessageDialog(null, lamaBanget);
                         
//                         //kalkulasi
//                         lm2 = jamConvert;
//                         lm = lm2/60;
                //perhitungan tiket buy
                         double totHrg;
                         totHrg = (hrgVip * jamConvert);
                         double totBiaya;
                         totBiaya = totHrg - (totHrg * noDiskon);
//                         double totalBi;
//                         totalBi = (1+pajak) * (lm*(hrgVip+handling));
                         
                          String saYogi;
                          String mataUang = String.format("Rp.%,.0f",hrgVip).replaceAll(",",".")+",00";
                          String totUang = String.format("Rp.%,.0f",totBiaya).replaceAll(",",".")+",00";
                            saYogi = "Report Pembelian Tiket"
                                    + "\n ===================="
                                    + "\n 1. " +jnsM
                                    + "\n 2. " +jnsSpd
                                    + "\n 3. " +lamaBanget
                                    + "\n ===================="
                                    + "\n Biaya Sewa : " +mataUang
                                    + "\n Diskon : Tidak Dapat "
                                    + "\n ===================="
                                    + "\n Total Biaya : " +totUang;
                            JOptionPane.showMessageDialog(null, saYogi,"Program Pusmania Ticket", JOptionPane.INFORMATION_MESSAGE);
                            
                            //method to sls
                            LatihanInput3 terAkhir;
                            terAkhir = new LatihanInput3();
                            terAkhir.selesai();
                    }
//            else if((yogiGrade < 4) && (yogiGrade >=2)) // ==== 80 --> 89
// tiket 2 s/d 3
                    else if((jamConvert == 2) || (jamConvert ==3))
                        // (jamConvert < 4) && (jamConvert >=2)
                        // atau jamConvert == 4 && ==5 karena tiket tidak mungkin di beli setengah 4.5 
                    {
                         diskonNm1 = 0.025; // 2 s/d 5
                         
//                         // i create new obj
//                         LatihanInput3 yogi;
//                         yogi = new LatihanInput3();
//                         yogi.hitung(); // run yogi method 
                         
                         
                         //report banyak tiket
                         String lamaBanget;
                         lamaBanget = " Jumlah Tiket yang Di Beli \t: " +jamConvert +" PCS" ;
                         JOptionPane.showMessageDialog(null, lamaBanget);
                         
//                         //kalkulasi
//                         lm2 = jamConvert;
//                         lm = lm2/60;
                //perhitungan tiket buy
                         double totHrg;
                         totHrg = (hrgVip * jamConvert);
                         double totBiaya;
                         totBiaya = totHrg - (totHrg * diskonNm1);
//                         double totalBi;
//                         totalBi = (1+pajak) * (lm*(hrgVip+handling));
                         
                          String saYogi;
                          String mataUang = String.format("Rp.%,.0f",hrgVip).replaceAll(",",".")+",00";
                          String totUang = String.format("Rp.%,.0f",totBiaya).replaceAll(",",".")+",00";
                            saYogi = "Report Pembelian Tiket"
                                    + "\n ===================="
                                    + "\n 1. " +jnsM
                                    + "\n 2. " +jnsSpd
                                    + "\n 3. " +lamaBanget
                                    + "\n ===================="
                                    + "\n Biaya Sewa : " +mataUang
                                    + "\n Diskon : " +diskon1
                                    + "\n ===================="
                                    + "\n Total Biaya : " +totUang;
                            JOptionPane.showMessageDialog(null, saYogi,"Program Pusmania Ticket", JOptionPane.INFORMATION_MESSAGE);
                            
                            //method to sls
                            LatihanInput3 terAkhir;
                            terAkhir = new LatihanInput3();
                            terAkhir.selesai();
                    }
                    else if((jamConvert == 5) || (jamConvert ==4 )) //4 s/d 5 
                        // (jamConvert < 6) && (jamConvert >=4)
                        // atau jamConvert == 4 && ==5 karena tiket tidak mungkin di beli setengah 4.5 
                    {
                         diskonNm2 = 0.05; // 2 s/d 5
                         
                         //report banyak tiket
                         String lamaBanget;
                         lamaBanget = " Jumlah Tiket yang Di Beli \t: " +jamConvert +" PCS" ;
                         JOptionPane.showMessageDialog(null, lamaBanget);
                         
                         //perhitungan tiket buy
                         double totHrg;
                         totHrg = (hrgVip * jamConvert);
                         double totBiaya;
                         totBiaya = totHrg - (totHrg * diskonNm2);
                         
                          String saYogi;
                          String mataUang = String.format("Rp.%,.0f",hrgVip).replaceAll(",",".")+",00";
                          String totUang = String.format("Rp.%,.0f",totBiaya).replaceAll(",",".")+",00";
                            saYogi = "Report Pembelian Tiket"
                                    + "\n ===================="
                                    + "\n 1. " +jnsM
                                    + "\n 2. " +jnsSpd
                                    + "\n 3. " +lamaBanget
                                    + "\n ===================="
                                    + "\n Biaya Sewa : " +mataUang
                                    + "\n Diskon : " +diskon2
                                    + "\n ===================="
                                    + "\n Total Biaya : " +totUang;
                            JOptionPane.showMessageDialog(null, saYogi,"Program Pusmania Ticket", JOptionPane.INFORMATION_MESSAGE);
                            
                            //method to sls
                            LatihanInput3 terAkhir;
                            terAkhir = new LatihanInput3();
                            terAkhir.selesai();
                         
                    }
                    else
                    {
                        String yoRam = "Maximal beli tiket 1 s/d 5"
                                + "\n Sllahkan Jalankan Ulang Program";
                        JOptionPane.showMessageDialog(null, yoRam,"Program Pusamania Tiket",JOptionPane.ERROR_MESSAGE);
                    }
            }
//ini Eksekutif
//=================================================            
//            eksekutif
            else if((jnsA == 2))
            {
                String jnsSpd;
                jnsSpd = "Kelas Tiket Pilihan \t: EKSEKUTIF" ;
                JOptionPane.showMessageDialog(null, jnsSpd);
                    
                    jam = JOptionPane.showInputDialog(null,"Masukan Jumlah Tiket yang di Beli"
                            + "\n Keterangan"
                            + "\n (1).  " +wkt1
                            + "\n (2).  " +wkt2
                            + "\n (3).  " +wkt3
                            + "\n ======================"
                                    + "\n"
                                            + "\n                                            (C) 2018 @aw.yogi and Ramli"
                            ,"Program Pusamania Ticket", JOptionPane.INFORMATION_MESSAGE);
                    
                    //converting jam double to int untuk if
                    jamConvert = Integer.parseInt(jam);
                    
                    // jamConvert adalah inputan jumlah tiket
                    if((jamConvert == 1))
                    {
//                         // i create new obj
//                         LatihanInput3 yogi;
//                         yogi = new LatihanInput3();
//                         yogi.hitung(); // run yogi method 
                         
                         
                         //report banyak tiket
                         String lamaBanget;
                         lamaBanget = " Jumlah Tiket yang Di Beli \t: " +jamConvert +" PCS" ;
                         JOptionPane.showMessageDialog(null, lamaBanget);
                         
//                         //kalkulasi
//                         lm2 = jamConvert;
//                         lm = lm2/60;
                //perhitungan tiket buy
                         double totHrg;
                         totHrg = (hrgEks * jamConvert);
                         double totBiaya;
                         totBiaya = totHrg - (totHrg * noDiskon);
//                         double totalBi;
//                         totalBi = (1+pajak) * (lm*(hrgVip+handling));
                         
                          String saYogi;
                          String mataUang = String.format("Rp.%,.0f",hrgEks).replaceAll(",",".")+",00";
                          String totUang = String.format("Rp.%,.0f",totBiaya).replaceAll(",",".")+",00";
                            saYogi = "Report Pembelian Tiket"
                                    + "\n ===================="
                                    + "\n 1. " +jnsM
                                    + "\n 2. " +jnsSpd
                                    + "\n 3. " +lamaBanget
                                    + "\n ===================="
                                    + "\n Biaya Sewa : " +mataUang
                                    + "\n Diskon : Tidak Dapat "
                                    + "\n ===================="
                                    + "\n Total Biaya : " +totUang;
                            JOptionPane.showMessageDialog(null, saYogi,"Program Pusmania Ticket", JOptionPane.INFORMATION_MESSAGE);
                            
                            //method to sls
                            LatihanInput3 terAkhir;
                            terAkhir = new LatihanInput3();
                            terAkhir.selesai();
                    }
//            else if((yogiGrade < 4) && (yogiGrade >=2)) // ==== 80 --> 89
// tiket 2 s/d 3
                    else if((jamConvert == 2) || (jamConvert ==3))
                        // (jamConvert < 4) && (jamConvert >=2)
                        // atau jamConvert == 4 && ==5 karena tiket tidak mungkin di beli setengah 4.5 
                    {
                         diskonNm1 = 0.025; // 2 s/d 5
                         
//                         // i create new obj
//                         LatihanInput3 yogi;
//                         yogi = new LatihanInput3();
//                         yogi.hitung(); // run yogi method 
                         
                         
                         //report banyak tiket
                         String lamaBanget;
                         lamaBanget = " Jumlah Tiket yang Di Beli \t: " +jamConvert +" PCS" ;
                         JOptionPane.showMessageDialog(null, lamaBanget);
                         
//                         //kalkulasi
//                         lm2 = jamConvert;
//                         lm = lm2/60;
                //perhitungan tiket buy
                         double totHrg;
                         totHrg = (hrgEks * jamConvert);
                         double totBiaya;
                         totBiaya = totHrg - (totHrg * diskonNm1);
//                         double totalBi;
//                         totalBi = (1+pajak) * (lm*(hrgVip+handling));
                         
                          String saYogi;
                          String mataUang = String.format("Rp.%,.0f",hrgEks).replaceAll(",",".")+",00";
                          String totUang = String.format("Rp.%,.0f",totBiaya).replaceAll(",",".")+",00";
                            saYogi = "Report Pembelian Tiket"
                                    + "\n ===================="
                                    + "\n 1. " +jnsM
                                    + "\n 2. " +jnsSpd
                                    + "\n 3. " +lamaBanget
                                    + "\n ===================="
                                    + "\n Biaya Sewa : " +mataUang
                                    + "\n Diskon : " +diskon1
                                    + "\n ===================="
                                    + "\n Total Biaya : " +totUang;
                            JOptionPane.showMessageDialog(null, saYogi,"Program Pusmania Ticket", JOptionPane.INFORMATION_MESSAGE);
                            
                            //method to sls
                            LatihanInput3 terAkhir;
                            terAkhir = new LatihanInput3();
                            terAkhir.selesai();
                    }
                    else if((jamConvert == 5) || (jamConvert ==4 )) //4 s/d 5 
                        // (jamConvert < 6) && (jamConvert >=4)
                        // atau jamConvert == 4 && ==5 karena tiket tidak mungkin di beli setengah 4.5 
                    {
                         diskonNm2 = 0.05; // 2 s/d 5
                         
                         //report banyak tiket
                         String lamaBanget;
                         lamaBanget = " Jumlah Tiket yang Di Beli \t: " +jamConvert +" PCS" ;
                         JOptionPane.showMessageDialog(null, lamaBanget);
                         
                         //perhitungan tiket buy
                         double totHrg;
                         totHrg = (hrgVip * jamConvert);
                         double totBiaya;
                         totBiaya = totHrg - (totHrg * diskonNm2);
                         
                          String saYogi;
                          String mataUang = String.format("Rp.%,.0f",hrgVip).replaceAll(",",".")+",00";
                          String totUang = String.format("Rp.%,.0f",totBiaya).replaceAll(",",".")+",00";
                            saYogi = "Report Pembelian Tiket"
                                    + "\n ===================="
                                    + "\n 1. " +jnsM
                                    + "\n 2. " +jnsSpd
                                    + "\n 3. " +lamaBanget
                                    + "\n ===================="
                                    + "\n Biaya Sewa : " +mataUang
                                    + "\n Diskon : " +diskon2
                                    + "\n ===================="
                                    + "\n Total Biaya : " +totUang;
                            JOptionPane.showMessageDialog(null, saYogi,"Program Pusmania Ticket", JOptionPane.INFORMATION_MESSAGE);
                            
                            //method to sls
                            LatihanInput3 terAkhir;
                            terAkhir = new LatihanInput3();
                            terAkhir.selesai();
                         
                    }
                    else
                    {
                        String yoRam = "Maximal beli tiket 1 s/d 5"
                                + "\n Sllahkan Jalankan Ulang Program";
                        JOptionPane.showMessageDialog(null, yoRam,"Program Pusamania Tiket",JOptionPane.ERROR_MESSAGE);
                    }
            }
//ini Tribun
//=================================================            
//            Tribun
            else if((jnsA == 3))
            {
                String jnsSpd;
                jnsSpd = "Kelas Tiket Pilihan \t: Tribun" ;
                JOptionPane.showMessageDialog(null, jnsSpd);
                    
                    jam = JOptionPane.showInputDialog(null,"Masukan Jumlah Tiket yang di Beli"
                            + "\n Keterangan"
                            + "\n (1).  " +wkt1
                            + "\n (2).  " +wkt2
                            + "\n (3).  " +wkt3
                            + "\n ======================"
                                    + "\n"
                                            + "\n                                            (C) 2018 @aw.yogi and Ramli"
                            ,"Program Pusamania Ticket", JOptionPane.INFORMATION_MESSAGE);
                    
                    //converting jam double to int untuk if
                    jamConvert = Integer.parseInt(jam);
                    
                    // jamConvert adalah inputan jumlah tiket
                    if((jamConvert == 1))
                    {
//                         // i create new obj
//                         LatihanInput3 yogi;
//                         yogi = new LatihanInput3();
//                         yogi.hitung(); // run yogi method 
                         
                         
                         //report banyak tiket
                         String lamaBanget;
                         lamaBanget = " Jumlah Tiket yang Di Beli \t: " +jamConvert +" PCS" ;
                         JOptionPane.showMessageDialog(null, lamaBanget);
                         
//                         //kalkulasi
//                         lm2 = jamConvert;
//                         lm = lm2/60;
                //perhitungan tiket buy
                         double totHrg;
                         totHrg = (hrgTribun * jamConvert);
                         double totBiaya;
                         totBiaya = totHrg - (totHrg * noDiskon);
//                         double totalBi;
//                         totalBi = (1+pajak) * (lm*(hrgVip+handling));
                         
                          String saYogi;
                          String mataUang = String.format("Rp.%,.0f",hrgTribun).replaceAll(",",".")+",00";
                          String totUang = String.format("Rp.%,.0f",totBiaya).replaceAll(",",".")+",00";
                            saYogi = "Report Pembelian Tiket"
                                    + "\n ===================="
                                    + "\n 1. " +jnsM
                                    + "\n 2. " +jnsSpd
                                    + "\n 3. " +lamaBanget
                                    + "\n ===================="
                                    + "\n Biaya Sewa : " +mataUang
                                    + "\n Diskon : Tidak Dapat "
                                    + "\n ===================="
                                    + "\n Total Biaya : " +totUang;
                            JOptionPane.showMessageDialog(null, saYogi,"Program Pusmania Ticket", JOptionPane.INFORMATION_MESSAGE);
                            
                            //method to sls
                            LatihanInput3 terAkhir;
                            terAkhir = new LatihanInput3();
                            terAkhir.selesai();
                    }
//            else if((yogiGrade < 4) && (yogiGrade >=2)) // ==== 80 --> 89
// tiket 2 s/d 3
                    else if((jamConvert == 2) || (jamConvert ==3))
                        // (jamConvert < 4) && (jamConvert >=2)
                        // atau jamConvert == 4 && ==5 karena tiket tidak mungkin di beli setengah 4.5 
                    {
                         diskonNm1 = 0.025; // 2 s/d 5
                         
//                         // i create new obj
//                         LatihanInput3 yogi;
//                         yogi = new LatihanInput3();
//                         yogi.hitung(); // run yogi method 
                         
                         
                         //report banyak tiket
                         String lamaBanget;
                         lamaBanget = " Jumlah Tiket yang Di Beli \t: " +jamConvert +" PCS" ;
                         JOptionPane.showMessageDialog(null, lamaBanget);
                         
//                         //kalkulasi
//                         lm2 = jamConvert;
//                         lm = lm2/60;
                //perhitungan tiket buy
                         double totHrg;
                         totHrg = (hrgTribun * jamConvert);
                         double totBiaya;
                         totBiaya = totHrg - (totHrg * diskonNm1);
//                         double totalBi;
//                         totalBi = (1+pajak) * (lm*(hrgVip+handling));
                         
                          String saYogi;
                          String mataUang = String.format("Rp.%,.0f",hrgTribun).replaceAll(",",".")+",00";
                          String totUang = String.format("Rp.%,.0f",totBiaya).replaceAll(",",".")+",00";
                            saYogi = "Report Pembelian Tiket"
                                    + "\n ===================="
                                    + "\n 1. " +jnsM
                                    + "\n 2. " +jnsSpd
                                    + "\n 3. " +lamaBanget
                                    + "\n ===================="
                                    + "\n Biaya Sewa : " +mataUang
                                    + "\n Diskon : " +diskon1
                                    + "\n ===================="
                                    + "\n Total Biaya : " +totUang;
                            JOptionPane.showMessageDialog(null, saYogi,"Program Pusmania Ticket", JOptionPane.INFORMATION_MESSAGE);
                            
                            //method to sls
                            LatihanInput3 terAkhir;
                            terAkhir = new LatihanInput3();
                            terAkhir.selesai();
                    }
                    else if((jamConvert == 5) || (jamConvert ==4 )) //4 s/d 5 
                        // (jamConvert < 6) && (jamConvert >=4)
                        // atau jamConvert == 4 && ==5 karena tiket tidak mungkin di beli setengah 4.5 
                    {
                         diskonNm2 = 0.05; // 2 s/d 5
                         
                         //report banyak tiket
                         String lamaBanget;
                         lamaBanget = " Jumlah Tiket yang Di Beli \t: " +jamConvert +" PCS" ;
                         JOptionPane.showMessageDialog(null, lamaBanget);
                         
                         //perhitungan tiket buy
                         double totHrg;
                         totHrg = (hrgTribun * jamConvert);
                         double totBiaya;
                         totBiaya = totHrg - (totHrg * diskonNm2);
                         
                          String saYogi;
                          String mataUang = String.format("Rp.%,.0f",hrgTribun).replaceAll(",",".")+",00";
                          String totUang = String.format("Rp.%,.0f",totBiaya).replaceAll(",",".")+",00";
                            saYogi = "Report Pembelian Tiket"
                                    + "\n ===================="
                                    + "\n 1. " +jnsM
                                    + "\n 2. " +jnsSpd
                                    + "\n 3. " +lamaBanget
                                    + "\n ===================="
                                    + "\n Biaya Sewa : " +mataUang
                                    + "\n Diskon : " +diskon2
                                    + "\n ===================="
                                    + "\n Total Biaya : " +totUang;
                            JOptionPane.showMessageDialog(null, saYogi,"Program Pusmania Ticket", JOptionPane.INFORMATION_MESSAGE);
                            
                            //method to sls
                            LatihanInput3 terAkhir;
                            terAkhir = new LatihanInput3();
                            terAkhir.selesai();
                         
                    }
                  
            }
            else
            {
             String yoRam = "Maximal beli tiket 1 s/d 5"
                            + "\n Sllahkan Jalankan Ulang Program";
             JOptionPane.showMessageDialog(null, yoRam,"Program Pusamania Tiket",JOptionPane.ERROR_MESSAGE);
            }
        }
//NON MEMBER =======
        else if((jnsP == 2))
        {
            //================
            //ketentuan non member
            double hrgVip;
            hrgVip = 275000; //vip
            double hrgEks;
            hrgEks = 175000; //eksekutif
            double hrgTribun;
            hrgTribun = 100000; //tribun

           
            
            //================MENU OPTION TIME
                    String wkt1 ="Jika Beli 2 s/d 3 tiket diskon 2.5%";
                    String wkt2 ="Jika Beli 4 s/d 5 tiket diskon 5%";
                    String wkt3 ="NB : Max Beli tiket adalah 5";
                    
                    
            
            
            String jnsM;
            jnsM = "Anda Sebagai \t: Non Member" ;
            JOptionPane.showMessageDialog(null, jnsM);
            
            //converting string to int
            jnsAlat = JOptionPane.showInputDialog(null,"Masukan Kelas Ticket"
                    + "\n 1. VIP"
                    + "\n 2. EKSEKUTIF"
                    + "\n 3. Tribun","Program Pusamania Ticket", JOptionPane.INFORMATION_MESSAGE);
            jnsA = Integer.parseInt(jnsAlat);
            
            //to choose jenis tiket
      // VIP ===== MEMBER ======================================================================== 
            if((jnsA == 1))
            {
                String jnsSpd;
                jnsSpd = "Kelas Tiket Pilihan \t: VIP" ;
                JOptionPane.showMessageDialog(null, jnsSpd);
                    
                    jam = JOptionPane.showInputDialog(null,"Masukan Jumlah Tiket yang di Beli"
                            + "\n Keterangan"
                            + "\n (1).  " +wkt1
                            + "\n (2).  " +wkt2
                            + "\n (3).  " +wkt3
                            + "\n ======================"
                                    + "\n"
                                            + "\n                                            (C) 2018 @aw.yogi and Ramli"
                            ,"Program Pusamania Ticket", JOptionPane.INFORMATION_MESSAGE);
                    
                    //converting jam double to int untuk if
                    jamConvert = Integer.parseInt(jam);
                    
                    // jamConvert adalah inputan jumlah tiket
                    if((jamConvert == 1))
                    {
//                         // i create new obj
//                         LatihanInput3 yogi;
//                         yogi = new LatihanInput3();
//                         yogi.hitung(); // run yogi method 
                        
                         //report banyak tiket
                         String lamaBanget;
                         lamaBanget = " Jumlah Tiket yang Di Beli \t: " +jamConvert +" PCS" ;
                         JOptionPane.showMessageDialog(null, lamaBanget);
                         
//                         //kalkulasi
//                         lm2 = jamConvert;
//                         lm = lm2/60;
                //perhitungan tiket buy
                         double totHrg;
                         totHrg = (hrgVip * jamConvert);
                         double totBiaya;
                         totBiaya = totHrg - (totHrg * noDiskon);
//                         double totalBi;
//                         totalBi = (1+pajak) * (lm*(hrgVip+handling));
                         
                          String saYogi;
                          String mataUang = String.format("Rp.%,.0f",hrgVip).replaceAll(",",".")+",00";
                          String totUang = String.format("Rp.%,.0f",totBiaya).replaceAll(",",".")+",00";
                            saYogi = "Report Pembelian Tiket"
                                    + "\n ===================="
                                    + "\n 1. " +jnsM
                                    + "\n 2. " +jnsSpd
                                    + "\n 3. " +lamaBanget
                                    + "\n ===================="
                                    + "\n Biaya Sewa : " +mataUang
                                    + "\n Diskon : Tidak Dapat "
                                    + "\n ===================="
                                    + "\n Total Biaya : " +totUang;
                            JOptionPane.showMessageDialog(null, saYogi,"Program Pusmania Ticket", JOptionPane.INFORMATION_MESSAGE);
                            
                            //method to sls
                            LatihanInput3 terAkhir;
                            terAkhir = new LatihanInput3();
                            terAkhir.selesai();
                    }
//            else if((yogiGrade < 4) && (yogiGrade >=2)) // ==== 80 --> 89
// tiket 2 s/d 3
                    else if((jamConvert == 2) || (jamConvert ==3))
                        // (jamConvert < 4) && (jamConvert >=2)
                        // atau jamConvert == 4 && ==5 karena tiket tidak mungkin di beli setengah 4.5 
                    {
                         diskonNm1 = 0.025; // 2 s/d 5
                         
//                         // i create new obj
//                         LatihanInput3 yogi;
//                         yogi = new LatihanInput3();
//                         yogi.hitung(); // run yogi method 
                         
                         
                         //report banyak tiket
                         String lamaBanget;
                         lamaBanget = " Jumlah Tiket yang Di Beli \t: " +jamConvert +" PCS" ;
                         JOptionPane.showMessageDialog(null, lamaBanget);
                         
//                         //kalkulasi
//                         lm2 = jamConvert;
//                         lm = lm2/60;
                //perhitungan tiket buy
                         double totHrg;
                         totHrg = (hrgVip * jamConvert);
                         double totBiaya;
                         totBiaya = totHrg - (totHrg * diskonNm1);
//                         double totalBi;
//                         totalBi = (1+pajak) * (lm*(hrgVip+handling));
                         
                          String saYogi;
                          String mataUang = String.format("Rp.%,.0f",hrgVip).replaceAll(",",".")+",00";
                          String totUang = String.format("Rp.%,.0f",totBiaya).replaceAll(",",".")+",00";
                            saYogi = "Report Pembelian Tiket"
                                    + "\n ===================="
                                    + "\n 1. " +jnsM
                                    + "\n 2. " +jnsSpd
                                    + "\n 3. " +lamaBanget
                                    + "\n ===================="
                                    + "\n Biaya Sewa : " +mataUang
                                    + "\n Diskon : " +diskon1
                                    + "\n ===================="
                                    + "\n Total Biaya : " +totUang;
                            JOptionPane.showMessageDialog(null, saYogi,"Program Pusmania Ticket", JOptionPane.INFORMATION_MESSAGE);
                            
                            //method to sls
                            LatihanInput3 terAkhir;
                            terAkhir = new LatihanInput3();
                            terAkhir.selesai();
                    }
                    else if((jamConvert == 5) || (jamConvert ==4 )) //4 s/d 5 
                        // (jamConvert < 6) && (jamConvert >=4)
                        // atau jamConvert == 4 && ==5 karena tiket tidak mungkin di beli setengah 4.5 
                    {
                         diskonNm2 = 0.05; // 2 s/d 5
                         
                         //report banyak tiket
                         String lamaBanget;
                         lamaBanget = " Jumlah Tiket yang Di Beli \t: " +jamConvert +" PCS" ;
                         JOptionPane.showMessageDialog(null, lamaBanget);
                         
                         //perhitungan tiket buy
                         double totHrg;
                         totHrg = (hrgVip * jamConvert);
                         double totBiaya;
                         totBiaya = totHrg - (totHrg * diskonNm2);
                         
                          String saYogi;
                          String mataUang = String.format("Rp.%,.0f",hrgVip).replaceAll(",",".")+",00";
                          String totUang = String.format("Rp.%,.0f",totBiaya).replaceAll(",",".")+",00";
                            saYogi = "Report Pembelian Tiket"
                                    + "\n ===================="
                                    + "\n 1. " +jnsM
                                    + "\n 2. " +jnsSpd
                                    + "\n 3. " +lamaBanget
                                    + "\n ===================="
                                    + "\n Biaya Sewa : " +mataUang
                                    + "\n Diskon : " +diskon2
                                    + "\n ===================="
                                    + "\n Total Biaya : " +totUang;
                            JOptionPane.showMessageDialog(null, saYogi,"Program Pusmania Ticket", JOptionPane.INFORMATION_MESSAGE);
                            
                            //method to sls
                            LatihanInput3 terAkhir;
                            terAkhir = new LatihanInput3();
                            terAkhir.selesai();
                         
                    }
                    else
                    {
                        String yoRam = "Maximal beli tiket 1 s/d 5"
                                + "\n Sllahkan Jalankan Ulang Program";
                        JOptionPane.showMessageDialog(null, yoRam,"Program Pusamania Tiket",JOptionPane.ERROR_MESSAGE);
                    }
            }
//ini Eksekutif
//=================================================            
//            eksekutif
            else if((jnsA == 2))
            {
                String jnsSpd;
                jnsSpd = "Kelas Tiket Pilihan \t: EKSEKUTIF" ;
                JOptionPane.showMessageDialog(null, jnsSpd);
                    
                    jam = JOptionPane.showInputDialog(null,"Masukan Jumlah Tiket yang di Beli"
                            + "\n Keterangan"
                            + "\n (1).  " +wkt1
                            + "\n (2).  " +wkt2
                            + "\n (3).  " +wkt3
                            + "\n ======================"
                                    + "\n"
                                            + "\n                                            (C) 2018 @aw.yogi and Ramli"
                            ,"Program Pusamania Ticket", JOptionPane.INFORMATION_MESSAGE);
                    
                    //converting jam double to int untuk if
                    jamConvert = Integer.parseInt(jam);
                    
                    // jamConvert adalah inputan jumlah tiket
                    if((jamConvert == 1))
                    {
//                         // i create new obj
//                         LatihanInput3 yogi;
//                         yogi = new LatihanInput3();
//                         yogi.hitung(); // run yogi method 
                         
                         
                         //report banyak tiket
                         String lamaBanget;
                         lamaBanget = " Jumlah Tiket yang Di Beli \t: " +jamConvert +" PCS" ;
                         JOptionPane.showMessageDialog(null, lamaBanget);
                         
//                         //kalkulasi
//                         lm2 = jamConvert;
//                         lm = lm2/60;
                //perhitungan tiket buy
                         double totHrg;
                         totHrg = (hrgEks * jamConvert);
                         double totBiaya;
                         totBiaya = totHrg - (totHrg * noDiskon);
//                         double totalBi;
//                         totalBi = (1+pajak) * (lm*(hrgVip+handling));
                         
                          String saYogi;
                          String mataUang = String.format("Rp.%,.0f",hrgEks).replaceAll(",",".")+",00";
                          String totUang = String.format("Rp.%,.0f",totBiaya).replaceAll(",",".")+",00";
                            saYogi = "Report Pembelian Tiket"
                                    + "\n ===================="
                                    + "\n 1. " +jnsM
                                    + "\n 2. " +jnsSpd
                                    + "\n 3. " +lamaBanget
                                    + "\n ===================="
                                    + "\n Biaya Sewa : " +mataUang
                                    + "\n Diskon : Tidak Dapat "
                                    + "\n ===================="
                                    + "\n Total Biaya : " +totUang;
                            JOptionPane.showMessageDialog(null, saYogi,"Program Pusmania Ticket", JOptionPane.INFORMATION_MESSAGE);
                            
                            //method to sls
                            LatihanInput3 terAkhir;
                            terAkhir = new LatihanInput3();
                            terAkhir.selesai();
                    }
//            else if((yogiGrade < 4) && (yogiGrade >=2)) // ==== 80 --> 89
// tiket 2 s/d 3
                    else if((jamConvert == 2) || (jamConvert ==3))
                        // (jamConvert < 4) && (jamConvert >=2)
                        // atau jamConvert == 4 && ==5 karena tiket tidak mungkin di beli setengah 4.5 
                    {
                         diskonNm1 = 0.025; // 2 s/d 5
                         
//                         // i create new obj
//                         LatihanInput3 yogi;
//                         yogi = new LatihanInput3();
//                         yogi.hitung(); // run yogi method 
                         
                         
                         //report banyak tiket
                         String lamaBanget;
                         lamaBanget = " Jumlah Tiket yang Di Beli \t: " +jamConvert +" PCS" ;
                         JOptionPane.showMessageDialog(null, lamaBanget);
                         
//                         //kalkulasi
//                         lm2 = jamConvert;
//                         lm = lm2/60;
                //perhitungan tiket buy
                         double totHrg;
                         totHrg = (hrgEks * jamConvert);
                         double totBiaya;
                         totBiaya = totHrg - (totHrg * diskonNm1);
//                         double totalBi;
//                         totalBi = (1+pajak) * (lm*(hrgVip+handling));
                         
                          String saYogi;
                          String mataUang = String.format("Rp.%,.0f",hrgEks).replaceAll(",",".")+",00";
                          String totUang = String.format("Rp.%,.0f",totBiaya).replaceAll(",",".")+",00";
                            saYogi = "Report Pembelian Tiket"
                                    + "\n ===================="
                                    + "\n 1. " +jnsM
                                    + "\n 2. " +jnsSpd
                                    + "\n 3. " +lamaBanget
                                    + "\n ===================="
                                    + "\n Biaya Sewa : " +mataUang
                                    + "\n Diskon : " +diskon1
                                    + "\n ===================="
                                    + "\n Total Biaya : " +totUang;
                            JOptionPane.showMessageDialog(null, saYogi,"Program Pusmania Ticket", JOptionPane.INFORMATION_MESSAGE);
                            
                            //method to sls
                            LatihanInput3 terAkhir;
                            terAkhir = new LatihanInput3();
                            terAkhir.selesai();
                    }
                    else if((jamConvert == 5) || (jamConvert ==4 )) //4 s/d 5 
                        // (jamConvert < 6) && (jamConvert >=4)
                        // atau jamConvert == 4 && ==5 karena tiket tidak mungkin di beli setengah 4.5 
                    {
                         diskonNm2 = 0.05; // 2 s/d 5
                         
                         //report banyak tiket
                         String lamaBanget;
                         lamaBanget = " Jumlah Tiket yang Di Beli \t: " +jamConvert +" PCS" ;
                         JOptionPane.showMessageDialog(null, lamaBanget);
                         
                         //perhitungan tiket buy
                         double totHrg;
                         totHrg = (hrgVip * jamConvert);
                         double totBiaya;
                         totBiaya = totHrg - (totHrg * diskonNm2);
                         
                          String saYogi;
                          String mataUang = String.format("Rp.%,.0f",hrgVip).replaceAll(",",".")+",00";
                          String totUang = String.format("Rp.%,.0f",totBiaya).replaceAll(",",".")+",00";
                            saYogi = "Report Pembelian Tiket"
                                    + "\n ===================="
                                    + "\n 1. " +jnsM
                                    + "\n 2. " +jnsSpd
                                    + "\n 3. " +lamaBanget
                                    + "\n ===================="
                                    + "\n Biaya Sewa : " +mataUang
                                    + "\n Diskon : " +diskon2
                                    + "\n ===================="
                                    + "\n Total Biaya : " +totUang;
                            JOptionPane.showMessageDialog(null, saYogi,"Program Pusmania Ticket", JOptionPane.INFORMATION_MESSAGE);
                            
                            //method to sls
                            LatihanInput3 terAkhir;
                            terAkhir = new LatihanInput3();
                            terAkhir.selesai();
                         
                    }
                    else
                    {
                        String yoRam = "Maximal beli tiket 1 s/d 5"
                                + "\n Sllahkan Jalankan Ulang Program";
                        JOptionPane.showMessageDialog(null, yoRam,"Program Pusamania Tiket",JOptionPane.ERROR_MESSAGE);
                    }
            }
//ini Tribun
//=================================================            
//            Tribun
            else if((jnsA == 3))
            {
                String jnsSpd;
                jnsSpd = "Kelas Tiket Pilihan \t: Tribun" ;
                JOptionPane.showMessageDialog(null, jnsSpd);
                    
                    jam = JOptionPane.showInputDialog(null,"Masukan Jumlah Tiket yang di Beli"
                            + "\n Keterangan"
                            + "\n (1).  " +wkt1
                            + "\n (2).  " +wkt2
                            + "\n (3).  " +wkt3
                            + "\n ======================"
                                    + "\n"
                                            + "\n                                            (C) 2018 @aw.yogi and Ramli"
                            ,"Program Pusamania Ticket", JOptionPane.INFORMATION_MESSAGE);
                    
                    //converting jam double to int untuk if
                    jamConvert = Integer.parseInt(jam);
                    
                    // jamConvert adalah inputan jumlah tiket
                    if((jamConvert == 1))
                    {
//                         // i create new obj
//                         LatihanInput3 yogi;
//                         yogi = new LatihanInput3();
//                         yogi.hitung(); // run yogi method 
                         
                         
                         //report banyak tiket
                         String lamaBanget;
                         lamaBanget = " Jumlah Tiket yang Di Beli \t: " +jamConvert +" PCS" ;
                         JOptionPane.showMessageDialog(null, lamaBanget);
                         
//                         //kalkulasi
//                         lm2 = jamConvert;
//                         lm = lm2/60;
                //perhitungan tiket buy
                         double totHrg;
                         totHrg = (hrgTribun * jamConvert);
                         double totBiaya;
                         totBiaya = totHrg - (totHrg * noDiskon);
//                         double totalBi;
//                         totalBi = (1+pajak) * (lm*(hrgVip+handling));
                         
                          String saYogi;
                          String mataUang = String.format("Rp.%,.0f",hrgTribun).replaceAll(",",".")+",00";
                          String totUang = String.format("Rp.%,.0f",totBiaya).replaceAll(",",".")+",00";
                            saYogi = "Report Pembelian Tiket"
                                    + "\n ===================="
                                    + "\n 1. " +jnsM
                                    + "\n 2. " +jnsSpd
                                    + "\n 3. " +lamaBanget
                                    + "\n ===================="
                                    + "\n Biaya Sewa : " +mataUang
                                    + "\n Diskon : Tidak Dapat "
                                    + "\n ===================="
                                    + "\n Total Biaya : " +totUang;
                            JOptionPane.showMessageDialog(null, saYogi,"Program Pusmania Ticket", JOptionPane.INFORMATION_MESSAGE);
                            
                            //method to sls
                            LatihanInput3 terAkhir;
                            terAkhir = new LatihanInput3();
                            terAkhir.selesai();
                    }
//            else if((yogiGrade < 4) && (yogiGrade >=2)) // ==== 80 --> 89
// tiket 2 s/d 3
                    else if((jamConvert == 2) || (jamConvert ==3))
                        // (jamConvert < 4) && (jamConvert >=2)
                        // atau jamConvert == 4 && ==5 karena tiket tidak mungkin di beli setengah 4.5 
                    {
                         diskonNm1 = 0.025; // 2 s/d 5
                         
//                         // i create new obj
//                         LatihanInput3 yogi;
//                         yogi = new LatihanInput3();
//                         yogi.hitung(); // run yogi method 
                         
                         
                         //report banyak tiket
                         String lamaBanget;
                         lamaBanget = " Jumlah Tiket yang Di Beli \t: " +jamConvert +" PCS" ;
                         JOptionPane.showMessageDialog(null, lamaBanget);
                         
//                         //kalkulasi
//                         lm2 = jamConvert;
//                         lm = lm2/60;
                //perhitungan tiket buy
                         double totHrg;
                         totHrg = (hrgTribun * jamConvert);
                         double totBiaya;
                         totBiaya = totHrg - (totHrg * diskonNm1);
//                         double totalBi;
//                         totalBi = (1+pajak) * (lm*(hrgVip+handling));
                         
                          String saYogi;
                          String mataUang = String.format("Rp.%,.0f",hrgTribun).replaceAll(",",".")+",00";
                          String totUang = String.format("Rp.%,.0f",totBiaya).replaceAll(",",".")+",00";
                            saYogi = "Report Pembelian Tiket"
                                    + "\n ===================="
                                    + "\n 1. " +jnsM
                                    + "\n 2. " +jnsSpd
                                    + "\n 3. " +lamaBanget
                                    + "\n ===================="
                                    + "\n Biaya Sewa : " +mataUang
                                    + "\n Diskon : " +diskon1
                                    + "\n ===================="
                                    + "\n Total Biaya : " +totUang;
                            JOptionPane.showMessageDialog(null, saYogi,"Program Pusmania Ticket", JOptionPane.INFORMATION_MESSAGE);
                            
                            //method to sls
                            LatihanInput3 terAkhir;
                            terAkhir = new LatihanInput3();
                            terAkhir.selesai();
                    }
                    else if((jamConvert == 5) || (jamConvert ==4 )) //4 s/d 5 
                        // (jamConvert < 6) && (jamConvert >=4)
                        // atau jamConvert == 4 && ==5 karena tiket tidak mungkin di beli setengah 4.5 
                    {
                         diskonNm2 = 0.05; // 2 s/d 5
                         
                         //report banyak tiket
                         String lamaBanget;
                         lamaBanget = " Jumlah Tiket yang Di Beli \t: " +jamConvert +" PCS" ;
                         JOptionPane.showMessageDialog(null, lamaBanget);
                         
                         //perhitungan tiket buy
                         double totHrg;
                         totHrg = (hrgTribun * jamConvert);
                         double totBiaya;
                         totBiaya = totHrg - (totHrg * diskonNm2);
                         
                          String saYogi;
                          String mataUang = String.format("Rp.%,.0f",hrgTribun).replaceAll(",",".")+",00";
                          String totUang = String.format("Rp.%,.0f",totBiaya).replaceAll(",",".")+",00";
                            saYogi = "Report Pembelian Tiket"
                                    + "\n ===================="
                                    + "\n 1. " +jnsM
                                    + "\n 2. " +jnsSpd
                                    + "\n 3. " +lamaBanget
                                    + "\n ===================="
                                    + "\n Biaya Sewa : " +mataUang
                                    + "\n Diskon : " +diskon2
                                    + "\n ===================="
                                    + "\n Total Biaya : " +totUang;
                            JOptionPane.showMessageDialog(null, saYogi,"Program Pusmania Ticket", JOptionPane.INFORMATION_MESSAGE);
                            
                            //method to sls
                            LatihanInput3 terAkhir;
                            terAkhir = new LatihanInput3();
                            terAkhir.selesai();
                         
                    }
                  
            }
            else
            {
             String yoRam = "Maximal beli tiket 1 s/d 5"
                            + "\n Sllahkan Jalankan Ulang Program";
             JOptionPane.showMessageDialog(null, yoRam,"Program Pusamania Tiket",JOptionPane.ERROR_MESSAGE);
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
 
//    public void hitung() 
//    {
//        
//    }
    //method tampil hasil
    public void errorIn()
    {
    String errorIn = "Silahkan Inputkan Data Dengan Benar";
    JOptionPane.showMessageDialog(null,errorIn,"ERROR",JOptionPane.ERROR_MESSAGE);
    }
}
