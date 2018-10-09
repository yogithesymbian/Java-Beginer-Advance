/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanTextPertemuan2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author Yogi Arif Widodo
 * www.scodeid.blogspot.com
 * www.scode.id
 * 17615006
 */
public class LatihanInput1 { 
    public static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) throws IOException {
       int nim = 0;
      
   
//        String nim ="";
        String nama ="";
        String jurusan = "";
        int usia = 0;
//        String usia ="";
        int tambah = 0;
        
        
        
       BufferedReader yogiIn;
       yogiIn = new BufferedReader(new InputStreamReader(System.in));
        
        try
        {
            System.out.println("Masukan Nim : ");
//          nim = yogiIn.read();
//          nim = yogiIn.readLine();
            nim = Integer.parseInt(input.nextLine());
       
            System.out.println("Masukan Nama : ");
            nama = yogiIn.readLine();
            System.out.println("Masukan Jurusan : ");
            jurusan = yogiIn.readLine();
            System.out.println("Masukan Usia : ");
            usia = Integer.parseInt(input.nextLine());
//          tambah = Integer.parseInt(usia)+3;
           
        }
        catch(IOException e)
        {
            System.out.println("Error!");
        }
        System.out.println("NIM : " +nim);
        System.out.println("NAMA : " +nama);
        System.out.println("JURUSAN : " +jurusan);
        System.out.println("USIA : " +usia);
        tambah = usia+=3;
        System.out.println("LULUS : " +tambah);
        
        
    }
//    public static void main(String[] args) {
//        
//    }
}
