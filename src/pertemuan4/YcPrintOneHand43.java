/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4;

import javax.swing.JOptionPane;

/**
 *
 * @author Yogi Arif Widodo
 * www.scodeid.blogspot.com
 * www.scode.id
 * github yogithesymbian
 * 17615006
 */
public class YcPrintOneHand43 
{
    private String whos ="";
    public String pilMenu ="";
    public final int MAX_LOOP = 100;
    public int vatas = 1;
  
    public void messageY(int yogi)
    {
        JOptionPane.showMessageDialog(null, ""+yogi
                    + " Nama Anda "+getWhos()
                            + "\n"
                                    + "\n TIP : Hold Enter on Keyboard","Print 100x Program",JOptionPane.INFORMATION_MESSAGE);
    }
    public void sayFor()
    {
        for (int yogi = 1; yogi <= MAX_LOOP; yogi++) 
        {
           messageY(yogi);
        }
    }
    public void sayWhile()
    {
        
        while (vatas <=MAX_LOOP) 
        {            
            messageY(vatas);
            vatas++;
        }
    }
    public void doWhile()
    {
        do
        {
            messageY(vatas);
            vatas++;
        }while(vatas <= MAX_LOOP);
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
        YcPrintOneHand43 mineTwo = new YcPrintOneHand43();
        mineTwo.menu();
        mineTwo.setWhos("yogi arif widodo");
        if (mineTwo.pilMenu.equalsIgnoreCase("1")) 
        {
            mineTwo.sayFor();
            mineTwo.copyRight();
        }
        else if(mineTwo.pilMenu.equalsIgnoreCase("2"))
        {
            mineTwo.sayWhile();
            mineTwo.copyRight();
        }
        else if(mineTwo.pilMenu.equalsIgnoreCase("3"))
        {
            mineTwo.doWhile();
            mineTwo.copyRight();
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Invalid Number \nPlease Try Again with Click Ok ","Print 100x Program", JOptionPane.ERROR_MESSAGE);
            mineTwo.menu();
        }
    }

    /**
     * @return the whos
     */
    public String getWhos() 
    {
        return whos;
    }

    /**
     * @param whos the whos to set
     */
    public void setWhos(String whos) 
    {
        this.whos = whos;
    }
}
