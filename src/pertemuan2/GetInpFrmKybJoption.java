/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan2;

import javax.swing.*;

/**
 *
 * @author Dani
 */
public class GetInpFrmKybJoption {
    public static void main(String[] args) {
        String nama;
        String msg;
       
        
        nama = JOptionPane.showInputDialog("Please enter your name"); //ini string
        msg = "Hello " +nama +" !";
        JOptionPane.showMessageDialog(null, msg);
        
    }
}
