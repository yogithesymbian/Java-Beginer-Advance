/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dirumah;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author Yogi Arif Widodo <Yogi at scodeid.blogspot.com>
 */
public class Enkripsi 
{
        private String kataHasil;
    
        public int key = 66+12;                      
        public String[] huruf = new String[94];
        
        public String cipher = "";
    public void yogiNih()
    {
        System.out.print("Masukan Data yang akan di enkripsi : ");
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        try {
            kataHasil = dataIn.readLine();
        } catch (Exception e) {
            System.out.println("error");
        }
    }
    public void decIn()
    {
        Enkripsi wow = new Enkripsi();
        System.out.print("Masukan Data yang akan di de - enkripsi : ");
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        try {
            //kataHasil
            cipher = dataIn.readLine();
        } catch (Exception e) {
            System.out.println("error");
        }
         String plaintext = "";
           wow.rum();
            //  Proses Dekrip
            loop1:
            for(int a = 0; a < cipher.length(); a++)
            {
               
                //  Cari nomor tiap karakter cipher
                int index_cipher = -1;
                for(int b = 0; b < huruf.length; b++)
                {
                    // Teknik Penulisan Short Hand If Else
                    index_cipher = (String.valueOf(cipher.charAt(a)).equals(huruf[b])) ? b : -1;
                    // Jika Ketemu  
                    if(index_cipher !=-1)
                    {
                        // Rumus Dekrip --> P = (nomor_karakter_cipher - key) mod 26
                        // jika (nomor_karakter_cipher - key) < 0 maka, 26 + (nomor_karakter_cipher - key)
                        // jika (nomor_karakter_cipher - key) >= 0 maka, (nomor_karakter_cipher - key) mod 26  
                        plaintext += ((index_cipher - key) >= 0) ? huruf[(index_cipher - key) % 94] : huruf[94 + (index_cipher - key)];
                        continue loop1;
                    }
                    
                }
               
                //  Jika tidak ketemu
                plaintext += cipher.charAt(a);
                
            }           
            //  Tampilkan Hasil Dekrip
            
            System.out.println("Hasil Dekrip : "+plaintext);
    }
    public void ohYogi()
    {
        getKataHasil();
    }
    public void rum()
    {
        for(char c = 33; c <= 126; c++)
        {  
                        huruf[c - 33] = String.valueOf(c);
        }
    }
    public static void main(String[] args)
    {
       
        Enkripsi wow = new Enkripsi();
        //  variable
        wow.yogiNih();
        wow.getKataHasil();
        //  isi array huruf
        String besarKatat = wow.kataHasil.toUpperCase();
        //rum
        wow.rum();
        //  Tampilkan Plain Text
        System.out.println("Plain Text : "+wow.kataHasil);
       
        //  Proses Enkripsi
        
        loop1:
        for(int a = 0; a < besarKatat.length(); a++)
        {                  
            //  cari nomor dari tiap huruf variable kata
            int index_plain = -1;
            for(int b = 0; b < wow.huruf.length; b++)
            {
                // Teknik Penulisan Short Hand If Else
                index_plain = (String.valueOf(besarKatat.charAt(a)).equals(wow.huruf[b])) ? b : -1;
                // Jika Ketemu Karakternya
                if(index_plain != -1)
                {
                    // Rumus Enkripsi --> C = (nomor_karakter_plain + key) mod 26                  
                    wow.cipher += wow.huruf[(index_plain + wow.key) % 94];
                    continue loop1;
                }              
            }
           
            //  Jika plain text tidak mengandung huruf maka, langsung dimasukkan ke variable cipher
            //  Misal, spasi atau angka
            wow.cipher += besarKatat.charAt(a);
        }
       
        //  Tampilkan hasil cipher
        System.out.println("Cipher Text : "+wow.cipher);
       
        //  Konfirmasi apakah ingin di dekrip
        System.out.print("Apakah ingin di dekrip(Y/N)? ");
        String jawab = new Scanner(System.in).nextLine();
               
        if(jawab.equalsIgnoreCase("Y"))
        {          
            String plaintext = "";
           
            //  Proses Dekrip
            loop1:
            for(int a = 0; a < wow.cipher.length(); a++)
            {
               
                //  Cari nomor tiap karakter cipher
                int index_cipher = -1;
                for(int b = 0; b < wow.huruf.length; b++)
                {
                    // Teknik Penulisan Short Hand If Else
                    index_cipher = (String.valueOf(wow.cipher.charAt(a)).equals(wow.huruf[b])) ? b : -1;
                    // Jika Ketemu  
                    if(index_cipher !=-1)
                    {
                        // Rumus Dekrip --> P = (nomor_karakter_cipher - key) mod 26
                        // jika (nomor_karakter_cipher - key) < 0 maka, 26 + (nomor_karakter_cipher - key)
                        // jika (nomor_karakter_cipher - key) >= 0 maka, (nomor_karakter_cipher - key) mod 26  
                        plaintext += ((index_cipher - wow.key) >= 0) ? wow.huruf[(index_cipher - wow.key) % 94] : wow.huruf[94 + (index_cipher - wow.key)];
                        continue loop1;
                    }
                    
                }
               
                //  Jika tidak ketemu
                plaintext += wow.cipher.charAt(a);
                
            }           
            //  Tampilkan Hasil Dekrip
            wow.ohYogi();
            System.out.println("Hasil Dekrip : "+wow.getKataHasil());
        }              
        wow.decIn();
    }

    /**
     * @return the kataHasil
     */
    public String getKataHasil() {
        return kataHasil;
    }

    /**
     * @param kataHasil the kataHasil to set
     */
    public void setKataHasil(String kataHasil) {
        this.kataHasil = kataHasil;
    }
}
