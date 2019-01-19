/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan7Inheritance;

/**
 *
 * @author Yogi Arif Widodo <Yogi at scodeid.blogspot.com>
 */
public class Karyawan 
{
    //properties
    String nik;
    String nama;
    
    //method
    public Karyawan() 
    {
        System.out.println("parent tanpa param");
        nik = "";
        nama = "";
    }
    
    public Karyawan(String nik, String nama) 
    {
        System.out.println("parent dengan parameter");
        this.nik = nik;
        this.nama = nama;
    }
      

    public String getNik() 
    {
        return nik;
    }

    public void setNik(String nik) 
    {
        this.nik = nik;
    }

    public String getNama() 
    {
        return nama;
    }

    public void setNama(String nama) 
    {
        this.nama = nama;
    }
   
    // ==== VIEW ===== D A T A =======
    public void viewData()
    {
        System.out.println("NIK  = " +nik);
        System.out.println("NAMA = " +nama);
    }
    
    
}
