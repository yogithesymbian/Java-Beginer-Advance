/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

/**
 *
 * @author Yogi Arif Widodo
 * www.scodeid.blogspot.com
 * www.scode.id
 * github yogithesymbian
 * 17615006
 */
public class YaBigNum42  //bigData
{
    public String pilMenu;
    public String menuInData;
    public int poin [] = new int[11]; //1 for overflow but it is danger by vuln dcom 0
    public int bigDataNya = 0;
    //==========================
    public int justForReport = 0;
    
    public void jopBig()
    {
        //poin.length . . .  
        for (int i = 0; i < 10; i++) 
        {
            justForReport = justForReport + 1;
            menuInData = JOptionPane.showInputDialog(null,"Masukan 10 Nomor yang kamu sukai"
                    + "\n                                 ("+justForReport+") ","Program Search Big Data",JOptionPane.INFORMATION_MESSAGE);
            System.out.println("Nilai Inputan : "+menuInData);
            poin[i] = Integer.parseInt(menuInData);
            if (poin[i] > bigDataNya) 
            {
                bigDataNya = poin[i];
            }
            
        }
        JOptionPane.showMessageDialog(null, ""
                + "\nNilai Big Data nya = "+bigDataNya,"Program Big Data",JOptionPane.INFORMATION_MESSAGE);
    }
    public void jopBuffered()
    {
        System.out.println("Program Big Data"
                + "\n____________________________");
        System.out.println("Masukan 10 Nomor yang kamu sukai : ");
        for (int i = 0; i < 10; i++) 
        {
            justForReport = justForReport + 1;
            BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
            System.out.print( "\n -> ");
            try 
            {
                menuInData = dataIn.readLine();
                poin[i] = Integer.parseInt(menuInData);
            } 
            catch (Exception e) 
            {
                System.out.println("error!");
            }
            if (poin[i] > bigDataNya) 
            {
                bigDataNya = poin[i];
            }
            
        }
        System.out.println("\nNilai Big Data nya = "+bigDataNya);
    }
    public void menu()
    {
        pilMenu = JOptionPane.showInputDialog(null,"Masukan Angka Pilihan Method"
                + "\n==============================="
                + "\n 1. JOptionPane  "
                + "\n 2. BufferedReader"
                + "\n ==============================","Program Big Data",JOptionPane.INFORMATION_MESSAGE);
    }
    public void copyRight()
    {
        String dataRight = ""
                + "\n__________________________________"
                + "\nNIM   : 17615006"
                + "\nNAMA  : Yogi Arif Widodo"
                + "\nCLASS : TI 3A"
                + "\n__________________________________"
                + "\n Cycber Security and Programmer"
                + "\n__________________________________"
                + "\n Talks is Cheap -> Show Me The Code"
                + "\n mailto : yogirenbox33@gmail.com  ";
        JOptionPane.showMessageDialog(null, ""+dataRight,"Thanks For Use My Program",JOptionPane.INFORMATION_MESSAGE);
        System.out.println(""+dataRight);
        
    }
    public static void main(String[] args) 
    {
        YaBigNum42 bigNumber = new YaBigNum42();
        bigNumber.menu();
        if (bigNumber.pilMenu.equalsIgnoreCase("1"))
        {
            bigNumber.jopBig();
            bigNumber.copyRight();
        }
        else if (bigNumber.pilMenu.equalsIgnoreCase("2"))
        {
            bigNumber.jopBuffered();
            bigNumber.copyRight();
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Invalid Number \nPlease Try Again with Click Ok ","Program Big Data", JOptionPane.ERROR_MESSAGE);
            bigNumber.menu();
        }
    }
}
