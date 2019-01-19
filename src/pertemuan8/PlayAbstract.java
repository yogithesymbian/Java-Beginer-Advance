/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan8;

import javax.swing.JOptionPane;

/**
 *
 * @author Yogi Arif Widodo <Yogi at scodeid.blogspot.com>
 */
public class PlayAbstract {
    public static void main(String[] args) {
//        Segitiga s1 = new Segitiga() {};
//        System.out.println("Luas Segitiga" +s1.computArea(1,3));


//       Shape s1 = new Shape() {
//           @Override
//           double computArea(double a, double t) {
//               throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//           }
//       };
       
                                    //with bracket
       Segitiga s2 = new Segitiga() {};
       
       String valueAlas;
       String valueTinggi;
       
       double alas;
       double tinggi;
       
       // string = 
       valueAlas = JOptionPane.showInputDialog("Masukan Alas");
       alas = Double.parseDouble(valueAlas);
       valueTinggi = JOptionPane.showInputDialog("Masukan Tinggi");
       tinggi = Double.parseDouble(valueTinggi);
       
       String hasil;
       
       hasil = "Hasil = " +s2.computAreaSegitiga(alas, tinggi);
       JOptionPane.showMessageDialog(null, hasil );
       
       
       
       System.out.println("Luas Segitiga  = "+s2.computAreaSegitiga(2, 2));
       System.out.println("Luas Persegi Panjang  = "+s2.computAreaPersegi(2, 4));
       System.out.println("Luas Circle = " +s2.computAreaCircle(2));
       
    }
}
