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
public class TipeData { //camel case nama gaya nya ( awal besar )
                        //kata benda untuk class
                        //ArrayList,Array
    
    public static void main(String[] args) //kata kerja untuk method ini
                                           //getIndex,setIndex,
                                           //selalu di awali huruf kecil
                                           //next gede
    {
        
    //deklarasi variable dan tipe datanya
    //ini gaya camel-Case
    //ini juga namanya attribut
    int gajiPokok;
    float potonganGaji;
    float gajiBersih;
    String namaBoss;
    String kodeBoss;
    //char golDarah;
    String golDarah;
    
    //assignment nilai pada setiap variable
    kodeBoss = "K00001";
    namaBoss = "Yogi Arif Widodo";
    //golDarah = 'A';
    golDarah = "AB";
    gajiPokok = 9000000;
    potonganGaji = (float) 0.2;
    gajiBersih = gajiPokok - (potonganGaji * gajiPokok);
    
    //tampilkan output
        System.out.println("KODE BOSS   : " +kodeBoss);
        System.out.println("NAMA BOSS   : " +namaBoss);
        System.out.println("GOL DARAH   : " +golDarah);
        System.out.println("GAJI POKOK  : " +gajiPokok);
        System.out.println("GAJI BERSIH : " +gajiBersih);
        
    }
    
}
