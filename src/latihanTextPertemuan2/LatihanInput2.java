/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanTextPertemuan2;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Yogi Arif Widodo
 * www.scodeid.blogspot.com
 * www.scode.id
 * 17615006
 */
public class LatihanInput2 {
    public static void main(String[] args) {
        String nilai ="";
        
        String output ="";
        String outputlus ="";
        int nil;
        
        nilai = JOptionPane.showInputDialog("Masukan Nilai KHS Anda = ");
//        msg = "Hello " +nama +" !";
//        JOptionPane.showMessageDialog(null, msg);

        output = "Nilai anda adalah " +nilai;
        JOptionPane.showMessageDialog(null, output);
        
        nil = Integer.parseInt(nilai);
        if ((nil>=85))
        {
            outputlus = "Grade anda A" ;
            JOptionPane.showMessageDialog(null, outputlus);
        }
        else if ((nil>=75) && (nil<=84))
        {
            outputlus = "Grade anda B" ;
            JOptionPane.showMessageDialog(null, outputlus);
        }
        
        
        
    }
}
