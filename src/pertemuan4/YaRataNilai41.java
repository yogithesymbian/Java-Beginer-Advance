/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4;
import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Yogi Arif Widodo
 * www.scodeid.blogspot.com
 * www.scode.id
 * github yogithesymbian
 * 17615006
 */
public class YaRataNilai41
{
        String nilYogi="";
        double nilai [] = new double[4];
        
        double rataRata = 0;
        final int jml = 3; //batas_inputan
        double banyak=0; //for kalkulasi ctrl + click
        private String smileFace;
        
    //report void
    public void rePort()
    {
        YaRataNilai41 smile = new YaRataNilai41();
         if (rataRata >= 60) 
        {
            //to set smileFace
            smile.setSmileFace("\u263A Nice !!!");
        }
        else
        {
            //!rt>60
            smile.setSmileFace("\u263A Dont to Be :-(");
        }
         
        JOptionPane.showMessageDialog(null,"Nilai KHS anda : "
                + "\n_________________________________"
                + "\n 1. System Analysis : "+nilai[0]
                + "\n 2. Progammer          : "+nilai[1]
                + "\n 3. Tester                    : "+nilai[2]
                + "\n_________________________________"
                + "\n Jumlah Nilai              : " +banyak
                + "\n Nilai Rata-Rata         = " +rataRata
                + "  Keep Smile Anything Result  " +smile.getSmileFace());
    }
    public void yogi()//kalkulasi
    {    
        //3x input
        for (int i = 0; i < jml; i++) 
        {
            nilYogi = JOptionPane.showInputDialog("Masukan Nilai KHS TI 3A \u263A : ");
            nilai[i] = Integer.parseInt(nilYogi);
            banyak = banyak + nilai[i];  //jumlah nilai
        }
       
        //rataRata = jumlah_nilai / banyak_nilai
        rataRata = banyak/jml; 
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
        YaRataNilai41 yogi = new YaRataNilai41();
        //object.method
        yogi.yogi();
        yogi.rePort();
        yogi.copyRight();
    }
    /**
     * @return the smileFace
     */
    public String getSmileFace() 
    {
        return smileFace;
    }
    /**
     * @param smileFace the smileFace to set
     */
    public void setSmileFace(String smileFace) 
    {
        this.smileFace = smileFace;
    }
}
