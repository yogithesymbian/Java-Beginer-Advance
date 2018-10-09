/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dirumah;

/**
 *
 * @author Dani
 */
public class OperasiBilangan 
{
    //deklarasi attribut atau properti
    public int bil1; //public bisa di akses di semua class
    public int bil2;
    private int hasil; //hanya di satu class ini saja private
    //ini namaya modifiers menentukan aksesbilitas terhadap method dan attr
    
    //method jumlah
    public void jumlah() 
    {
        this.hasil = this.bil1 + this.bil2;
    }
    
    //method tampil hasil
    public void tampilHasil()
    {
        System.out.println("Hasil Operasi Bilangan : " +this.hasil);
    }
}
class Arif extends OperasiBilangan
{
    public static void main(String[] args) {
        OperasiBilangan yogi = new OperasiBilangan(); //hanya sebuah instantisasi
                                                       //create new obyek 
        yogi.bil1 = 10; //set attr
        yogi.bil2 = 5;
        yogi.jumlah(); //run the method
        yogi.tampilHasil(); //sama juga sob
    }
}
