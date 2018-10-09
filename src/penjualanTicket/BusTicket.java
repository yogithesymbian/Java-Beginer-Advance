/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penjualanTicket;

import javax.swing.JOptionPane;

/**
 *
 * @author Yogi Arif Widodo
 * www.scodeid.blogspot.com
 * www.scode.id
 * 17615006
 */
public class BusTicket 
{
    public static void main(String[] args) {
        // menu for jenis tiket dan kelas tiket
        String jnsTicketnKls = "";
        String infoYogi = "";
        String brtBr;
        String jmlOrgY;
        
        //kalkulasi
        double ekTicket = 0;
        double eksTicket = 0;
        
        double brtBrg = 0;
        double biayaTmbh =0;
        final double maxBrt = 15; //kilogram
        int jmlOrg = 0;
        
        //hasil
        double totaLebih = 0;
        double total = 0;
        
        //other
        String jurB = "Banjarmasin";
        String jurS = "Samarinda";
        String jurBo = "Bontang";
        
        String klsEk = "eknomi";
        String klsEks = "Eksekutif";
        //=====================================
        jnsTicketnKls = JOptionPane.showInputDialog(null,"Masukan Jenis Jurusan Tiket Pembelian"
                + "\n 1. " +jurB
                + "\n 2. " +jurS
                + "\n 3. " +jurBo,"Program Ticket", JOptionPane.INFORMATION_MESSAGE);
        if(jnsTicketnKls.equalsIgnoreCase("1"))
        {
//banjarmasin
            //ekonomi 135ribu / orang\
            //eksekutif 185
            //berat barang 15kg gratis if lebih denda 10 ribu per kg
            //System.out.println("1");
            jnsTicketnKls = JOptionPane.showInputDialog(null,"Masukan Jenis Kelas Tiket Pembelian"
                + "\n 1. " +klsEk
                + "\n 2. " +klsEks,"Program Ticket", JOptionPane.INFORMATION_MESSAGE);
//ekonomi
         biayaTmbh = 10000;
            if(jnsTicketnKls.equalsIgnoreCase("1"))
            {
//                infoYogi = "Report Pembelian Tiket";
//                 System.out.println("ekonomi");
//                 JOptionPane.showMessageDialog(null, infoYogi,"Program Pusmania Ticket", JOptionPane.INFORMATION_MESSAGE);
                ekTicket = 135000;
                
                brtBr = JOptionPane.showInputDialog(null,"Masukan Berat Barang"
                 ,"Program Ticket", JOptionPane.INFORMATION_MESSAGE);
                jmlOrgY = JOptionPane.showInputDialog(null,"Masukan Jumlah Orang"
                 ,"Program Ticket", JOptionPane.INFORMATION_MESSAGE);
                
                brtBrg = Integer.parseInt(brtBr);
                jmlOrg = Integer.parseInt(jmlOrgY);
                
//rumus
                if(brtBrg > maxBrt)
                {
                   Double hitBrg;
                   hitBrg = brtBrg - 15;
                   totaLebih = (jmlOrg * ekTicket) + (biayaTmbh * hitBrg);
                 infoYogi = "\n Jurusan : " +jurB
                        + "\n Kelas : " +klsEk
                        + "\n Berat Barang Bawaan : " +brtBrg
                        + "\n Berat Barang MAX : " +maxBrt +" Kg"
                        + "\n Denda Barang Rp." +biayaTmbh
                        + "\n Jumlah Orang : " +jmlOrg
                        + "\n Total Biaya Rp." +totaLebih;
                JOptionPane.showMessageDialog(null, infoYogi,"Program Penjualan Ticket", JOptionPane.INFORMATION_MESSAGE);
                
                }
                else
                {
                    total = (jmlOrg * ekTicket) + (biayaTmbh * brtBrg);
                    infoYogi = "\n Jurusan : " +jurB
                        + "\n Kelas : " +klsEk
                        + "\n Berat Barang Bawaan : " +brtBrg
                        + "\n Berat Barang MAX : " +maxBrt +" Kg"
                        + "\n Denda Barang Rp." +biayaTmbh
                        + "\n Jumlah Orang : " +jmlOrg
                        + "\n Total Biaya Rp." +total;
                JOptionPane.showMessageDialog(null, infoYogi,"Program Penjualan Ticket", JOptionPane.INFORMATION_MESSAGE);
                }
                
                
                
            }
//eksekutif
            else if(jnsTicketnKls.equalsIgnoreCase("2"))
            {
//                System.out.println("eksekutif");
                eksTicket = 185000;
                 brtBr = JOptionPane.showInputDialog(null,"Masukan Berat Barang"
                 ,"Program Ticket", JOptionPane.INFORMATION_MESSAGE);
                jmlOrgY = JOptionPane.showInputDialog(null,"Masukan Jumlah Orang"
                 ,"Program Ticket", JOptionPane.INFORMATION_MESSAGE);
                
                brtBrg = Integer.parseInt(brtBr);
                jmlOrg = Integer.parseInt(jmlOrgY);
                
//rumus
                if(brtBrg > maxBrt)
                {
                   Double hitBrg;
                   hitBrg = brtBrg - 15;
                   totaLebih = (jmlOrg * eksTicket) + (biayaTmbh * hitBrg);
                 infoYogi = "\n Jurusan : " +jurB
                        + "\n Kelas : " +klsEk
                        + "\n Berat Barang Bawaan : " +brtBrg
                        + "\n Berat Barang MAX : " +maxBrt +" Kg"
                        + "\n Denda Barang Rp." +biayaTmbh
                        + "\n Jumlah Orang : " +jmlOrg
                        + "\n Total Biaya Rp." +totaLebih;
                JOptionPane.showMessageDialog(null, infoYogi,"Program Penjualan Ticket", JOptionPane.INFORMATION_MESSAGE);
                
                }
                else
                {
                    total = (jmlOrg * eksTicket) + (biayaTmbh * brtBrg);
                    infoYogi = "\n Jurusan : " +jurB
                        + "\n Kelas : " +klsEk
                        + "\n Berat Barang Bawaan : " +brtBrg
                        + "\n Berat Barang MAX : " +maxBrt +" Kg"
                        + "\n Denda Barang Rp." +biayaTmbh
                        + "\n Jumlah Orang : " +jmlOrg
                        + "\n Total Biaya Rp." +total;
                JOptionPane.showMessageDialog(null, infoYogi,"Program Penjualan Ticket", JOptionPane.INFORMATION_MESSAGE);
                }
            }
            
        }
        
        else if(jnsTicketnKls.equalsIgnoreCase("2"))
        {
//samarinda
             //ekonomi 30ribu / orang\
            //eksekutif 40
            //berat barang 15kg gratis if lebih denda 5 ribu per kg
//            System.out.println("2");
         biayaTmbh = 5000;
            jnsTicketnKls = JOptionPane.showInputDialog(null,"Masukan Jenis Kelas Tiket Pembelian"
                + "\n 1. " +klsEk
                + "\n 2. " +klsEks,"Program Ticket", JOptionPane.INFORMATION_MESSAGE);
//ekonomi
            if(jnsTicketnKls.equalsIgnoreCase("1"))
            {
//                infoYogi = "Report Pembelian Tiket";
//                 System.out.println("ekonomi");
//                 JOptionPane.showMessageDialog(null, infoYogi,"Program Pusmania Ticket", JOptionPane.INFORMATION_MESSAGE);
                ekTicket = 30000;
                brtBr = JOptionPane.showInputDialog(null,"Masukan Berat Barang"
                 ,"Program Ticket", JOptionPane.INFORMATION_MESSAGE);
                jmlOrgY = JOptionPane.showInputDialog(null,"Masukan Jumlah Orang"
                 ,"Program Ticket", JOptionPane.INFORMATION_MESSAGE);
                
                brtBrg = Integer.parseInt(brtBr);
                jmlOrg = Integer.parseInt(jmlOrgY);
                
//rumus
                if(brtBrg > maxBrt)
                {
                   Double hitBrg;
                   hitBrg = brtBrg - 15;
                   totaLebih = (jmlOrg * ekTicket) + (biayaTmbh * hitBrg);
                 infoYogi = "\n Jurusan : " +jurS
                        + "\n Kelas : " +klsEk
                        + "\n Berat Barang Bawaan : " +brtBrg
                        + "\n Berat Barang MAX : " +maxBrt +" Kg"
                        + "\n Denda Barang Rp." +biayaTmbh
                        + "\n Jumlah Orang : " +jmlOrg
                        + "\n Total Biaya Rp." +totaLebih;
                JOptionPane.showMessageDialog(null, infoYogi,"Program Penjualan Ticket", JOptionPane.INFORMATION_MESSAGE);
                
                }
                else
                {
                    total = (jmlOrg * ekTicket) + (biayaTmbh * brtBrg);
                    infoYogi = "\n Jurusan : " +jurB
                        + "\n Kelas : " +klsEk
                        + "\n Berat Barang Bawaan : " +brtBrg
                        + "\n Berat Barang MAX : " +maxBrt +" Kg"
                        + "\n Denda Barang Rp." +biayaTmbh
                        + "\n Jumlah Orang : " +jmlOrg
                        + "\n Total Biaya Rp." +total;
                JOptionPane.showMessageDialog(null, infoYogi,"Program Penjualan Ticket", JOptionPane.INFORMATION_MESSAGE);
                }
            }
//eksekutif
            else if(jnsTicketnKls.equalsIgnoreCase("2"))
            {
//                System.out.println("eksekutif");
                eksTicket = 40000;
                brtBr = JOptionPane.showInputDialog(null,"Masukan Berat Barang"
                 ,"Program Ticket", JOptionPane.INFORMATION_MESSAGE);
                jmlOrgY = JOptionPane.showInputDialog(null,"Masukan Jumlah Orang"
                 ,"Program Ticket", JOptionPane.INFORMATION_MESSAGE);
                
                brtBrg = Integer.parseInt(brtBr);
                jmlOrg = Integer.parseInt(jmlOrgY);
                
//rumus
                if(brtBrg > maxBrt)
                {
                   Double hitBrg;
                   hitBrg = brtBrg - 15;
                   totaLebih = (jmlOrg * eksTicket) + (biayaTmbh * hitBrg);
                 infoYogi = "\n Jurusan : " +jurS
                        + "\n Kelas : " +klsEk
                        + "\n Berat Barang Bawaan : " +brtBrg
                        + "\n Berat Barang MAX : " +maxBrt +" Kg"
                        + "\n Denda Barang Rp." +biayaTmbh
                        + "\n Jumlah Orang : " +jmlOrg
                        + "\n Total Biaya Rp." +totaLebih;
                JOptionPane.showMessageDialog(null, infoYogi,"Program Penjualan Ticket", JOptionPane.INFORMATION_MESSAGE);
                
                }
                else
                {
                    total = (jmlOrg * eksTicket) + (biayaTmbh * brtBrg);
                    infoYogi = "\n Jurusan : " +jurB
                        + "\n Kelas : " +klsEk
                        + "\n Berat Barang Bawaan : " +brtBrg
                        + "\n Berat Barang MAX : " +maxBrt +" Kg"
                        + "\n Denda Barang Rp." +biayaTmbh
                        + "\n Jumlah Orang : " +jmlOrg
                        + "\n Total Biaya Rp." +total;
                JOptionPane.showMessageDialog(null, infoYogi,"Program Penjualan Ticket", JOptionPane.INFORMATION_MESSAGE);
                }
            }
            
        }
        else if(jnsTicketnKls.equalsIgnoreCase("3"))
        {
//bontang
             //ekonomi 85ribu / orang\
            //eksekutif 120
            //berat barang 15kg gratis if lebih denda 7.500 per kg
//            System.out.println("3");
          biayaTmbh = 75000;
            jnsTicketnKls = JOptionPane.showInputDialog(null,"Masukan Jenis Kelas Tiket Pembelian"
                + "\n 1. Ekonomi "
                + "\n 2. Eksekutif","Program Ticket", JOptionPane.INFORMATION_MESSAGE);
//ekonomi
            if(jnsTicketnKls.equalsIgnoreCase("1"))
            {
//                infoYogi = "Report Pembelian Tiket";
//                 System.out.println("ekonomi");
//                 JOptionPane.showMessageDialog(null, infoYogi,"Program Pusmania Ticket", JOptionPane.INFORMATION_MESSAGE);
            ekTicket = 85000;
            brtBr = JOptionPane.showInputDialog(null,"Masukan Berat Barang"
                 ,"Program Ticket", JOptionPane.INFORMATION_MESSAGE);
                jmlOrgY = JOptionPane.showInputDialog(null,"Masukan Jumlah Orang"
                 ,"Program Ticket", JOptionPane.INFORMATION_MESSAGE);
                
                brtBrg = Integer.parseInt(brtBr);
                jmlOrg = Integer.parseInt(jmlOrgY);
                
//rumus
                if(brtBrg > maxBrt)
                {
                   Double hitBrg;
                   hitBrg = brtBrg - 15;
                   totaLebih = (jmlOrg * ekTicket) + (biayaTmbh * hitBrg);
                 infoYogi = "\n Jurusan : " +jurBo
                        + "\n Kelas : " +klsEk
                        + "\n Berat Barang Bawaan : " +brtBrg
                        + "\n Berat Barang MAX : " +maxBrt +" Kg"
                        + "\n Denda Barang Rp." +biayaTmbh
                        + "\n Jumlah Orang : " +jmlOrg
                        + "\n Total Biaya Rp." +totaLebih;
                JOptionPane.showMessageDialog(null, infoYogi,"Program Penjualan Ticket", JOptionPane.INFORMATION_MESSAGE);
                
                }
                else
                {
                    total = (jmlOrg * ekTicket) + (biayaTmbh * brtBrg);
                    infoYogi = "\n Jurusan : " +jurB
                        + "\n Kelas : " +klsEk
                        + "\n Berat Barang Bawaan : " +brtBrg
                        + "\n Berat Barang MAX : " +maxBrt +" Kg"
                        + "\n Denda Barang Rp." +biayaTmbh
                        + "\n Jumlah Orang : " +jmlOrg
                        + "\n Total Biaya Rp." +total;
                JOptionPane.showMessageDialog(null, infoYogi,"Program Penjualan Ticket", JOptionPane.INFORMATION_MESSAGE);
                }
            }
//eksekutif
            else if(jnsTicketnKls.equalsIgnoreCase("2"))
            {
//                System.out.println("eksekutif");
                eksTicket = 120000;
                brtBr = JOptionPane.showInputDialog(null,"Masukan Berat Barang"
                 ,"Program Ticket", JOptionPane.INFORMATION_MESSAGE);
                jmlOrgY = JOptionPane.showInputDialog(null,"Masukan Jumlah Orang"
                 ,"Program Ticket", JOptionPane.INFORMATION_MESSAGE);
                
                brtBrg = Integer.parseInt(brtBr);
                jmlOrg = Integer.parseInt(jmlOrgY);
                
//rumus
                if(brtBrg > maxBrt)
                {
                   Double hitBrg;
                   hitBrg = brtBrg - 15;
                   totaLebih = (jmlOrg * eksTicket) + (biayaTmbh * hitBrg);
                 infoYogi = "\n Jurusan : " +jurBo
                        + "\n Kelas : " +klsEk
                        + "\n Berat Barang Bawaan : " +brtBrg
                        + "\n Berat Barang MAX : " +maxBrt +" Kg"
                        + "\n Denda Barang Rp." +biayaTmbh
                        + "\n Jumlah Orang : " +jmlOrg
                        + "\n Total Biaya Rp." +totaLebih;
                JOptionPane.showMessageDialog(null, infoYogi,"Program Penjualan Ticket", JOptionPane.INFORMATION_MESSAGE);
                
                }
                else
                {
                    total = (jmlOrg * eksTicket) + (biayaTmbh * brtBrg);
                    infoYogi = "\n Jurusan : " +jurBo
                        + "\n Kelas : " +klsEk
                        + "\n Berat Barang Bawaan : " +brtBrg
                        + "\n Berat Barang MAX : " +maxBrt +" Kg"
                        + "\n Denda Barang Rp." +biayaTmbh
                        + "\n Jumlah Orang : " +jmlOrg
                        + "\n Total Biaya Rp." +total;
                JOptionPane.showMessageDialog(null, infoYogi,"Program Penjualan Ticket", JOptionPane.INFORMATION_MESSAGE);
                }
            }
            
        }
    }
}

