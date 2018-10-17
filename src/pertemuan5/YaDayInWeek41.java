/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan5;

import javax.swing.JOptionPane;

/**
 *
 * @author Yogi Arif Widodo
 * www.scodeid.blogspot.com
 * www.scode.id
 * github yogithesymbian
 * 17615006
 */
public class YaDayInWeek41
{
    public String pilMenu;//menu                                                               // bufferOverFlow
    public String days[] ={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday",null};
    public int kurang=0;
    public int kurangWhile = 0;
    
    
    public void menuInFor()
    {
        
        for (int yogi = 1; yogi <days.length; yogi++) 
        {
            kurang = yogi - 1;
            System.out.println("Hari ke-"+yogi
                    + "adalah "+days[kurang]);
        }
    }
    public void menuInWhile()
    {
        kurang =1;
        while(kurang < days.length)
        {
           kurangWhile = kurang - 1; //for 1 -  1 = 0 so we can set 1 array to where is zero place
           System.out.println("Hari ke-"+kurang
                    + "adalah "+days[kurangWhile]); 
           kurang++;
        }
    }
    public void menuInDoWhile()
    {
        kurang++; //just for started from 1
        do
        {
            //ini kurang doWhile yang menggunakan kurang While
            kurangWhile = kurang - 1;
            
            System.out.println("Hari ke-"+kurang
                    + "adalah "+days[kurangWhile]);
            kurang++;
        }while(kurang < days.length);
    }
    public void menu()
    {
        pilMenu = JOptionPane.showInputDialog(null,"Masukan Angka Pilihan Method"
                + "\n==============================="
                + "\n 1. For Loop  "
                + "\n 2. While Loop"
                + "\n 3. Do While  "
                + "\n ==============================","Print 100x Program",JOptionPane.INFORMATION_MESSAGE);
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
        YaDayInWeek41 callYogi = new YaDayInWeek41();
        callYogi.menu();
        if (callYogi.pilMenu.equalsIgnoreCase("1")) 
        {
            callYogi.menuInFor();
            callYogi.copyRight();
        }
        else if(callYogi.pilMenu.equalsIgnoreCase("2"))
        {
            callYogi.menuInWhile();
            callYogi.copyRight();
        }
        else if(callYogi.pilMenu.equalsIgnoreCase("3"))
        {
            callYogi.menuInDoWhile();
            callYogi.copyRight();
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Invalid Number \nPlease Try Again with Click Ok ","Print 100x Program", JOptionPane.ERROR_MESSAGE);
            callYogi.menu();
        }
    }
}
