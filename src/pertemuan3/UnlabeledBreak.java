/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan3;

/**
 *
 * @author Yogi Arif Widodo
 * www.scodeid.blogspot.com
 * www.scode.id
 * 17615006
 */
public class UnlabeledBreak {
    public static void main(String[] args) {
        String names[] = {"Yogi", "Arif", "Widodo"};
        
        String cariNama = "Yogi";
        boolean ditemukan = false;
        
        for (int i = 0; i < names.length; i++)
        {
            if(names[i].equals(cariNama))
            {
                ditemukan = true;
                break;
            }
        }
        if(ditemukan)
        {
            System.out.println(cariNama +" Ditemukan");
        }
        else
        {
            System.out.println(cariNama +" Tidak Ditemukan");
        }
    }
}
