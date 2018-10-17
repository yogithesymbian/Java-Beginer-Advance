/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4;

import java.io.BufferedReader;
import java.io.InputStream;
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
public class YaRataNilaiBuffer41 
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
        YaRataNilaiBuffer41 smile = new YaRataNilaiBuffer41();
         if (rataRata >= 60) 
        {
            //to set smileFace
            smile.setSmileFace("\u263A");
        }
        else
        {
            //!rt>60
            smile.setSmileFace("\u263A");
        }
         System.out.println("\n Your Point KHS "
                + "\n_________________________________"
                + "\n 1. System Analysis : "+nilai[0]
                + "\n 2. Progammer       : "+nilai[1]
                + "\n 3. Tester          : "+nilai[2]
                + "\n_________________________________"
                + "\n Jumlah Nilai       : " +banyak
                + "\n Nilai Rata-Rata    = " +rataRata
                + "  Keep Smile Anything Result  " +smile.getSmileFace());
              
    }
    public void yogiKalkulasi()//kalkulasi
    {    
        System.out.println("Please add value KHS Exam : ");
        //3x input
        for (int i = 0; i < jml; i++) 
        {
            BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
            try 
            {
                System.out.print("Nilai : ");
                nilYogi = dataIn.readLine();
            } catch (Exception e) 
            {
                System.out.println("Error");
            }
            
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
        YaRataNilaiBuffer41 yogi = new YaRataNilaiBuffer41();
        //object.method
        yogi.yogiKalkulasi();
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
