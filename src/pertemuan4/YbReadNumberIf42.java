/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4;

import com.sun.corba.se.spi.orb.ParserImplBase;
import javax.swing.*;

/**
 *
 * @author Yogi Arif Widodo
 * www.scodeid.blogspot.com
 * www.scode.id
 * github yogithesymbian
 * 17615006
 */
public class YbReadNumberIf42 
{
    public String numbre;
    public int num;
    
    public void numberOut()
    {
        JOptionPane.showMessageDialog(null,"Anda Memasukan Angka "+numbre,"Program Read Number", JOptionPane.INFORMATION_MESSAGE);
    }
    public void numberErr()
    {
        JOptionPane.showMessageDialog(null,"Invalid Number \nPlease Try Again with Click Ok ","Program Read Number", JOptionPane.ERROR_MESSAGE);
        numberIn();
    }
    public void numberIn()
    {
        numbre = JOptionPane.showInputDialog(null,"Masukan Angka [1..10] ","Program Read Number", JOptionPane.INFORMATION_MESSAGE);
        num = Integer.parseInt(numbre);
        if ((num >= 1) && (num <=10)) 
        {
            numberOut();
        }
        else
        {
            numberErr();
        }
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
        YbReadNumberIf42 metRead = new YbReadNumberIf42();
        metRead.numberIn();
        metRead.copyRight();
    }
            
            
}
