/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizDua;

/**
 *
 * @author Yogi Arif Widodo <Yogi at scodeid.blogspot.com>
 */
public class Karyawan //pilihan 2
{
    
    //default
    String nama;
    String alamat;
    String statusKaryawan;
    String posisi;
    int umur;
    
    
    //constructor with argument
    public Karyawan(String nama, String alamat, String statusKaryawan, String posisi, int umur) {
        this.nama = nama;
        this.alamat = alamat;
        this.statusKaryawan = statusKaryawan;
        this.posisi = posisi;
        this.umur = umur;
    }
    
    //constructor without argumen
    public Karyawan()
    {
        nama = "";
        alamat ="";
        statusKaryawan ="";
        posisi = "";
        umur = 0;
    }

    public String getNama() 
    {
        return nama;
    }

    public void setNama(String nama) 
    {
        this.nama = nama;
    }

    public String getAlamat() 
    {
        return alamat;
    }

    public void setAlamat(String alamat) 
    {
        this.alamat = alamat;
    }

    public String getStatusKaryawan() 
    {
        return statusKaryawan;
    }

    public void setStatusKaryawan(String statusKaryawan) 
    {
        this.statusKaryawan = statusKaryawan;
    }

    public String getPosisi() 
    {
        return posisi;
    }

    public void setPosisi(String posisi) 
    {
        this.posisi = posisi;
    }

    public int getUmur()
    {
        return umur;
    }

    public void setUmur(int umur)
    {
        this.umur = umur;
    }
    
    public void view()
    {
        System.out.println(""
                + "\nNama : "+nama
                + "\nAlamat  : "+alamat
                + "\nStatus Karyawan  : "+statusKaryawan
                + "\nPosisi : "+posisi
                + "\nUmur : "+umur);
    }
    public static void main(String[] args) 
    {
         Karyawan data1 = new Karyawan();
        Karyawan data2 = new Karyawan();
        Karyawan data3 = new Karyawan("Dani","Arab Saudi","Activ","Technic Sipil", 19); // param

        System.out.println("\n Data Karyawan Partner Google \n "
                + "____________________________________ \n ");
        // set data ===============================
        data1.setNama("Yogi Arif Widod");
        data1.setAlamat("Australia");
        data1.setStatusKaryawan("Active");
        data1.setPosisi("Google Secure");
        data1.setUmur(19);

        //============
        data1.view();

        //set data and get=================================
        data2.setNama("Arif");
        data2.setAlamat("Google Street");
        data2.setStatusKaryawan("Active");
        data2.setPosisi("Hacker");
        data2.setUmur(20);

        data2.view();

        System.out.println(""
                + "\nNama :" +data2.getNama()
                + "\nAlamat  :" +data2.getAlamat()
                + "\nStatus Karyawan  :" +data2.getStatusKaryawan()
                + "\nPosisi :" +data2.getPosisi()
                + "\nUmur :" +data2.getUmur());

        //================================================
        data3.view();
    }
}
