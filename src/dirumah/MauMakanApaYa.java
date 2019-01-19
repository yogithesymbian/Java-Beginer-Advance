/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dirumah;

import java.util.Random;

/**
 *
 * @author Yogi Arif Widodo <Yogi at scodeid.blogspot.com>
 */
public class MauMakanApaYa 
{
    public static void main(String[] args) 
    {
        String laper [] = {"Food Telor Mata Sapi","Ayam Chicken Geprek","Nugget dan Sambel","Mie Instant 2x Goreng","Nasi Goreng Food","Tempe dan Tahu Food"};
        Random yogi = new Random();
        int randomPil = yogi.nextInt(laper.length);
        System.out.println("Makan = "+laper[randomPil]);
        
        String haus [] = {"Air Putih","Es Bening","Ice Tea","Moca","coffe chocolate","Susu CAP mil","hot Tea"};
        int randomPilEx = yogi.nextInt(haus.length);
        System.out.println("Minum nya = "+haus[randomPilEx]);
        
    }
}
