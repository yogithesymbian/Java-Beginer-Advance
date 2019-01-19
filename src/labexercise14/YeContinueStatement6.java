/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labexercise14;

/**
 *
 * @author Yogi Arif Widodo
 * www.scodeid.blogspot.com
 * www.scode.id
 * 17615006
 */
public class YeContinueStatement6 
{
    public static void main(String[] args) {
        String names[] = {"Linus","Torvalds","Yogi"};
        
        int count =0;
        for (int i = 0; i < names.length; i++) 
        {
            //tampil 1 
            //jika kondisi if ini hilang menampilkan angka 3
            if (!names[i].equals("Linus"))
            {
                continue;
            }
            count++;
        }
        System.out.println("There are "+count+" Linus in the list");
    }
}
