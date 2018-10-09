/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dirumah;
/**
 *
 * @author Yogi Arif Widodo
 * www.scodeid.blogspot.com
 * www.scode.id
 * 17615006
 */
public class OperasiBilanganDevelopment {
    public int bill1;
    public int bill2;
    private int hasil;
    
    public void jumlah()
    {
        this.hasil = this.bill1 + this.bill2;
    }
    public void outputnya()
    {
        System.out.println("Penjumlahanya = "+this.hasil);
    }
    
    /**
     *
     * @param args
     */
    public static void main(String[] args) 
    {
        OperasiBilanganDevelopment yogi;
        yogi = new OperasiBilanganDevelopment();
        yogi.bill1 = 5;
        yogi.bill1 = 10;
        yogi.jumlah();
        yogi.outputnya();

        OperasiBilanganDevelopment arif = new OperasiBilanganDevelopment();
        arif.bill1 = 10;
        arif.bill2 = 10;
        arif.jumlah();
        arif.outputnya();
        
        
    }
}
