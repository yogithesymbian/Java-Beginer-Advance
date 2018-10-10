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
    public String infoYogi = "";
    public String brtBr;
    public String jmlOrgY;
        
        //kalkulasi
        public double ekTicket = 0;
        public double eksTicket = 0;
        
        public double brtBrg = 0;
        public double biayaTmbh =0;
        public final double maxBrt = 15; //kilogram
        public int jmlOrg = 0;
        
        //hasil
        public double totaLebih = 0;
        public double total = 0;
        
        //other
        public String jurB = "Banjarmasin";
        public String jurS = "Samarinda";
        public String jurBo = "Bontang";
        
        public String klsEk = "eknomi";
        public String klsEks = "Eksekutif";
    public static void main(String[] args) {
        // menu for jenis tiket dan kelas tiket
        String jnsTicketnKls = "";
        BusTicket yogi;
        yogi = new BusTicket(); // this for method
        
        jnsTicketnKls = JOptionPane.showInputDialog(null,"Masukan Jenis Jurusan Tiket Pembelian"
                + "\n 1. " +yogi.jurB
                + "\n 2. " +yogi.jurS
                + "\n 3. " +yogi.jurBo,"Program Ticket", JOptionPane.INFORMATION_MESSAGE);
        if(jnsTicketnKls.equalsIgnoreCase("1"))
        {
//banjarmasin
            //ekonomi 135ribu / orang\
            //eksekutif 185
            //berat barang 15kg gratis if lebih denda 10 ribu per kg
            //System.out.println("1");
            jnsTicketnKls = JOptionPane.showInputDialog(null,"Masukan Jenis Kelas Tiket Pembelian"
                + "\n 1. " +yogi.klsEk
                + "\n 2. " +yogi.klsEks,"Program Ticket", JOptionPane.INFORMATION_MESSAGE);
//ekonomi
         yogi.biayaTmbh = 10000;
            if(jnsTicketnKls.equalsIgnoreCase("1"))
            {
//                infoYogi = "Report Pembelian Tiket";
//                 System.out.println("ekonomi");
//                 JOptionPane.showMessageDialog(null, infoYogi,"Program Pusmania Ticket", JOptionPane.INFORMATION_MESSAGE);
                yogi.ekTicket = 135000;
                
                yogi.brtBr = JOptionPane.showInputDialog(null,"Masukan Berat Barang"
                 ,"Program Ticket", JOptionPane.INFORMATION_MESSAGE);
                yogi.jmlOrgY = JOptionPane.showInputDialog(null,"Masukan Jumlah Orang"
                 ,"Program Ticket", JOptionPane.INFORMATION_MESSAGE);
                
                yogi.brtBrg = Integer.parseInt(yogi.brtBr);
                yogi.jmlOrg = Integer.parseInt(yogi.jmlOrgY);
                
//rumus
                if(yogi.brtBrg > yogi.maxBrt)
                {
                   Double hitBrg;
                   hitBrg = yogi.brtBrg - 15;
                   yogi.totaLebih = (yogi.jmlOrg * yogi.ekTicket) + (yogi.biayaTmbh * hitBrg);

                yogi.infoReport(); //memanggil method report
                yogi.infoYogi = "\n Total Biaya Rp." +yogi.totaLebih;
                JOptionPane.showMessageDialog(null, yogi.infoYogi,"Program Penjualan Ticket", JOptionPane.INFORMATION_MESSAGE);
                
                }
                else
                {
                   yogi.total = (yogi.jmlOrg * yogi.ekTicket) + (yogi.biayaTmbh * yogi.brtBrg);
                   yogi.infoReport();
                   yogi.infoYogi = "\n Total Biaya Rp." +yogi.total;
                JOptionPane.showMessageDialog(null, yogi.infoYogi,"Program Penjualan Ticket", JOptionPane.INFORMATION_MESSAGE);
                }
                
                
                
            }
//eksekutif
            else if(jnsTicketnKls.equalsIgnoreCase("2"))
            {
//                System.out.println("eksekutif");
                yogi.eksTicket = 185000;
                 yogi.brtBr = JOptionPane.showInputDialog(null,"Masukan Berat Barang"
                 ,"Program Ticket", JOptionPane.INFORMATION_MESSAGE);
                yogi.jmlOrgY = JOptionPane.showInputDialog(null,"Masukan Jumlah Orang"
                 ,"Program Ticket", JOptionPane.INFORMATION_MESSAGE);
                
                yogi.brtBrg = Integer.parseInt(yogi.brtBr);
                yogi.jmlOrg = Integer.parseInt(yogi.jmlOrgY);
                
//rumus
                if(yogi.brtBrg > yogi.maxBrt)
                {
                   Double hitBrg;
                   hitBrg = yogi.brtBrg - 15;
                   yogi.totaLebih = (yogi.jmlOrg * yogi.eksTicket) + (yogi.biayaTmbh * hitBrg);
                   yogi.infoReport();
                   yogi.infoYogi = "\n Total Biaya Rp." +yogi.totaLebih;                
                   JOptionPane.showMessageDialog(null, yogi.infoYogi,"Program Penjualan Ticket", JOptionPane.INFORMATION_MESSAGE);
                }
                else
                {
                    yogi.total = (yogi.jmlOrg * yogi.eksTicket) + (yogi.biayaTmbh * yogi.brtBrg);
                    yogi.infoReport();
                    yogi.infoYogi ="\n Total Biaya Rp." +yogi.total;
                JOptionPane.showMessageDialog(null, yogi.infoYogi,"Program Penjualan Ticket", JOptionPane.INFORMATION_MESSAGE);
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
         yogi.biayaTmbh = 5000;
            jnsTicketnKls = JOptionPane.showInputDialog(null,"Masukan Jenis Kelas Tiket Pembelian"
                + "\n 1. " +yogi.klsEk
                + "\n 2. " +yogi.klsEks,"Program Ticket", JOptionPane.INFORMATION_MESSAGE);
//ekonomi
            if(jnsTicketnKls.equalsIgnoreCase("1"))
            {
//                infoYogi = "Report Pembelian Tiket";
//                 System.out.println("ekonomi");
//                 JOptionPane.showMessageDialog(null, infoYogi,"Program Pusmania Ticket", JOptionPane.INFORMATION_MESSAGE);
                yogi.ekTicket = 30000;
                yogi.brtBr = JOptionPane.showInputDialog(null,"Masukan Berat Barang"
                 ,"Program Ticket", JOptionPane.INFORMATION_MESSAGE);
                yogi.jmlOrgY = JOptionPane.showInputDialog(null,"Masukan Jumlah Orang"
                 ,"Program Ticket", JOptionPane.INFORMATION_MESSAGE);
                
                yogi.brtBrg = Integer.parseInt(yogi.brtBr);
                yogi.jmlOrg = Integer.parseInt(yogi.jmlOrgY);
                
//rumus
                if(yogi.brtBrg > yogi.maxBrt)
                {
                   Double hitBrg;
                   hitBrg = yogi.brtBrg - 15;
                   yogi.totaLebih = (yogi.jmlOrg * yogi.ekTicket) + (yogi.biayaTmbh * hitBrg);
                   yogi.infoReport();
                 yogi.infoYogi ="\n Total Biaya Rp." +yogi.totaLebih;
                 JOptionPane.showMessageDialog(null, yogi.infoYogi,"Program Penjualan Ticket", JOptionPane.INFORMATION_MESSAGE);
                
                }
                else
                {
                    yogi.total = (yogi.jmlOrg * yogi.ekTicket) + (yogi.biayaTmbh * yogi.brtBrg);
                    yogi.infoYogi ="\n Total Biaya Rp." +yogi.total;
                    yogi.infoReport();
                JOptionPane.showMessageDialog(null, yogi.infoYogi,"Program Penjualan Ticket", JOptionPane.INFORMATION_MESSAGE);
                }
            }
//eksekutif
            else if(jnsTicketnKls.equalsIgnoreCase("2"))
            {
//                System.out.println("eksekutif");
                yogi.eksTicket = 40000;
                yogi.brtBr = JOptionPane.showInputDialog(null,"Masukan Berat Barang"
                 ,"Program Ticket", JOptionPane.INFORMATION_MESSAGE);
                yogi.jmlOrgY = JOptionPane.showInputDialog(null,"Masukan Jumlah Orang"
                 ,"Program Ticket", JOptionPane.INFORMATION_MESSAGE);
                
                yogi.brtBrg = Integer.parseInt(yogi.brtBr);
                yogi.jmlOrg = Integer.parseInt(yogi.jmlOrgY);
                
//rumus
                if(yogi.brtBrg > yogi.maxBrt)
                {
                   Double hitBrg;
                   hitBrg = yogi.brtBrg - 15;
                   yogi.totaLebih = (yogi.jmlOrg * yogi.eksTicket) + (yogi.biayaTmbh * hitBrg);
                   yogi.infoReport();
                 yogi.infoYogi = "\n Total Biaya Rp." +yogi.totaLebih;
                JOptionPane.showMessageDialog(null, yogi.infoYogi,"Program Penjualan Ticket", JOptionPane.INFORMATION_MESSAGE);
                
                }
                else
                {
                    yogi.total = (yogi.jmlOrg * yogi.eksTicket) + (yogi.biayaTmbh * yogi.brtBrg);
                    yogi.infoReport();
                    yogi.infoYogi ="\n Total Biaya Rp." +yogi.total;
                JOptionPane.showMessageDialog(null, yogi.infoYogi,"Program Penjualan Ticket", JOptionPane.INFORMATION_MESSAGE);
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
          yogi.biayaTmbh = 75000;
            jnsTicketnKls = JOptionPane.showInputDialog(null,"Masukan Jenis Kelas Tiket Pembelian"
                + "\n 1. Ekonomi "
                + "\n 2. Eksekutif","Program Ticket", JOptionPane.INFORMATION_MESSAGE);
//ekonomi
            if(jnsTicketnKls.equalsIgnoreCase("1"))
            {
//                infoYogi = "Report Pembelian Tiket";
//                 System.out.println("ekonomi");
//                 JOptionPane.showMessageDialog(null, infoYogi,"Program Pusmania Ticket", JOptionPane.INFORMATION_MESSAGE);
            yogi.ekTicket = 85000;
            yogi.brtBr = JOptionPane.showInputDialog(null,"Masukan Berat Barang"
                 ,"Program Ticket", JOptionPane.INFORMATION_MESSAGE);
                yogi.jmlOrgY = JOptionPane.showInputDialog(null,"Masukan Jumlah Orang"
                 ,"Program Ticket", JOptionPane.INFORMATION_MESSAGE);
                
                yogi.brtBrg = Integer.parseInt(yogi.brtBr);
                yogi.jmlOrg = Integer.parseInt(yogi.jmlOrgY);
                
//rumus
                if(yogi.brtBrg > yogi.maxBrt)
                {
                   Double hitBrg;
                   hitBrg = yogi.brtBrg - 15;
                   yogi.totaLebih = (yogi.jmlOrg * yogi.ekTicket) + (yogi.biayaTmbh * hitBrg);
                   yogi.infoReport();
                 yogi.infoYogi ="\n Total Biaya Rp." +yogi.totaLebih;
                JOptionPane.showMessageDialog(null, yogi.infoYogi,"Program Penjualan Ticket", JOptionPane.INFORMATION_MESSAGE);
                
                }
                else
                {
                    yogi.total = (yogi.jmlOrg * yogi.ekTicket) + (yogi.biayaTmbh * yogi.brtBrg);
                    yogi.infoReport();
                    yogi.infoYogi = "\n Total Biaya Rp." +yogi.total;
                JOptionPane.showMessageDialog(null, yogi.infoYogi,"Program Penjualan Ticket", JOptionPane.INFORMATION_MESSAGE);
                }
            }
//eksekutif
            else if(jnsTicketnKls.equalsIgnoreCase("2"))
            {
//                System.out.println("eksekutif");
                yogi.eksTicket = 120000;
                yogi.brtBr = JOptionPane.showInputDialog(null,"Masukan Berat Barang"
                 ,"Program Ticket", JOptionPane.INFORMATION_MESSAGE);
                yogi.jmlOrgY = JOptionPane.showInputDialog(null,"Masukan Jumlah Orang"
                 ,"Program Ticket", JOptionPane.INFORMATION_MESSAGE);
                
                yogi.brtBrg = Integer.parseInt(yogi.brtBr);
                yogi.jmlOrg = Integer.parseInt(yogi.jmlOrgY);
//rumus
                if(yogi.brtBrg > yogi.maxBrt)
                {
                   Double hitBrg;
                   hitBrg = yogi.brtBrg - 15;
                   yogi.totaLebih = (yogi.jmlOrg * yogi.eksTicket) + (yogi.biayaTmbh * hitBrg);
                   yogi.infoReport();
                 yogi.infoYogi = "\n Total Biaya Rp." +yogi.totaLebih;
                JOptionPane.showMessageDialog(null, yogi.infoYogi,"Program Penjualan Ticket", JOptionPane.INFORMATION_MESSAGE);
                }
                else
                {
                    yogi.total = (yogi.jmlOrg * yogi.eksTicket) + (yogi.biayaTmbh * yogi.brtBrg);
                    yogi.infoYogi ="\n Total Biaya Rp." +yogi.total;
                JOptionPane.showMessageDialog(null, yogi.infoYogi,"Program Penjualan Ticket", JOptionPane.INFORMATION_MESSAGE);
                }
            }
            
        }
    }
       public void infoReport()
       {
           infoYogi = "\n Jurusan : " +jurB
                        + "\n Kelas : " +klsEk
                        + "\n Berat Barang Bawaan : " +brtBrg
                        + "\n Berat Barang MAX : " +maxBrt +" Kg"
                        + "\n Denda Barang Rp." +biayaTmbh
                        + "\n Jumlah Orang : " +jmlOrg;
           JOptionPane.showMessageDialog(null, infoYogi,"Program Penjualan Ticket", JOptionPane.INFORMATION_MESSAGE);
       }
}