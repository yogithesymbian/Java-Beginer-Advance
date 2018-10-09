/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dirumah;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

/**
 *
 * @author Dani
 */
public class BothBufferedJoption {
    public static void main(String[] args) {
        String jopYogi = "";
        String buffYogi = "";
         
        jopYogi = JOptionPane.showInputDialog(null, "apakah kamu suka dia ? ","Program Input 2 Method", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Click Ok dan lihat OUTPUT , follow the instruction","Jawaban Anda",JOptionPane.INFORMATION_MESSAGE);
        
        BufferedReader dataIn;
        dataIn = new BufferedReader (new InputStreamReader(System.in));
        
        
       System.out.print("Please enter your name = ");
        try
        {
          buffYogi = dataIn.readLine();
                }
        catch(IOException e)
        {
            System.out.println("Error!");
        }
        System.out.println("Hello " +buffYogi +" !");
        //sout from JOptionPane
        System.out.println("Ini adalah inputan dari JOptionPane : "+jopYogi);
       
        
    }
}
