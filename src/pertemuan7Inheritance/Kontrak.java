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
public class Kontrak extends Karyawan
{
    String NIPK;
    Date tanggal_mulai;
    Date tanggal_akhir;

    public Kontrak() 
    {
        NIPK = "";
    }

    public Kontrak(String NIPK, Date tanggal_mulai, Date tanggal_akhir)
    {
        this.NIPK = NIPK;
        this.tanggal_mulai = tanggal_mulai;
        this.tanggal_akhir = tanggal_akhir;
    }

    public String getNIPK() 
    {
        return NIPK;
    }

    public void setNIPK(String NIPK) 
    {
        this.NIPK = NIPK;
    }

    public Date getTanggal_mulai() 
    {
        return tanggal_mulai;
    }

    public void setTanggal_mulai(Date tanggal_mulai) 
    {
        this.tanggal_mulai = tanggal_mulai;
    }

    public Date getTanggal_akhir() 
    {
        return tanggal_akhir;
    }

    public void setTanggal_akhir(Date tanggal_akhir) {
        this.tanggal_akhir = tanggal_akhir;
    }

    @Override
    public void viewData() 
    {
        super.viewData(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
    
}
