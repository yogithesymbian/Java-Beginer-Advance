/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan8;

/**
 *
 * @author Yogi Arif Widodo <Yogi at scodeid.blogspot.com>
 */
public class Pakaian {
    private int ID = 0; // Default ID untuk semua Pakaian  private String keterangan = "-keterangan diperlukan-"; // default  
    private double harga = 0.0; // Harga default untuk semua Pakaian  private int jmlStok = 0; // jumlah default untuk semua Pakaian  
    private static int UNIQUE_ID=0; //Static member ditambahkan dalam

    //constructor                                     
    //untuk menghasilkan ID yang unik
    public Pakaian() 
    {
        ID=UNIQUE_ID++; 
    }
    
    public int getID() 
    {
        return ID;
    }
    
    
}
