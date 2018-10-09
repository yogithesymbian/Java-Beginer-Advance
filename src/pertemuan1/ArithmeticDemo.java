/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan1;

/**
 *
 * @author Dani
 */
public class ArithmeticDemo {
    public static void main(String[] args) { //psvm
        
        //deklarasi and deskripsi
        //declare and assign
        int i = 5;
        int j = 2;
       
        float arif = 25.5f; // hindari float untuk pembagian 
                            //tidak dapat menyimpan belakang koma tidak habis
                            
        double xyogi = 27.123; //else float
        double yogi = 7.22;
        
        System.out.println("Variable values...");
        System.out.println("i = " + i); //concatenation character + 
        System.out.println("j = " +j);
        System.out.println("x = " +xyogi);
        System.out.println("yogi = " +yogi);
        System.out.println("");
        System.out.println("Adding . . .");
        //proses and output
        System.out.println("i + j = " +(i+j));
        System.out.println("x + y = " +(xyogi+yogi));
        
        //======================================================
        
        //substracting numbers
        System.out.println("Sustracting . . .");
        System.out.println("i - j" + (i - j));
        System.out.println("xyogi - yogi " + (xyogi - yogi));
        System.out.println("");
        
        //multiplaying numbers
        System.out.println("Multiplaying . . .");
        System.out.println("i * j = " + (i*j));
        System.out.println("xyogi * yogi = " +(xyogi * yogi));
        System.out.println("");
        
        //dividing numbers
        System.out.println("Dividing . . .");
        System.out.println("i / j = " + (i/j));
        System.out.println("xyogi / yogi = " +(xyogi / yogi));
        System.out.println("");
        
        //computingg the remainder resulting from dividing
        //numbers
        System.out.println("Computing Numbers . . .");
        System.out.println("i % j = " +(i%j));
        System.out.println("xyogi % yogi = " +(xyogi % yogi));
        System.out.println("");
        
        //mixing types
        System.out.println("Mixing . . .");
        System.out.println("i + j = " +(i+j));
        System.out.println("xyogi * yogi = " +(xyogi * yogi));
        System.out.println("");
    }
}
