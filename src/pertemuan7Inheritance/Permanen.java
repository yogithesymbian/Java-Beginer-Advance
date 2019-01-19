/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan7Inheritance;

import java.util.Date;

/**
 *
 * @author Yogi Arif Widodo <Yogi at scodeid.blogspot.com>
 */
public class Permanen extends Karyawan
{
    //propertie
    String NIP;
    Date tanggal_bergabung;

    //method 
    
    //tanpa param
    public Permanen() 
    {
        System.out.println("Child tanpa param");
        NIP = "";
        
    }

    public Permanen(String NIP, String nik, String nama) {
        super(nik, nama);
        this.NIP = NIP;
    }

    public Permanen(Date tanggal_bergabung, String nik, String nama) {
        super(nik, nama);
        this.tanggal_bergabung = tanggal_bergabung;
    }

    
    
    

    public String getNIP() {
        return NIP;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    @Override //method
    public void viewData() {
        super.viewData(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("NIP ="+NIP);
    }

    
    
}
