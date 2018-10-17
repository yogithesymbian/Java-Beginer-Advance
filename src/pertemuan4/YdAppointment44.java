/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4;

import javax.swing.JOptionPane;

/**
 *
 * @author Yogi Arif Widodo
 * www.scodeid.blogspot.com
 * www.scode.id
 * github yogithesymbian
 * 17615006
 */
public class YdAppointment44 {
     //kalkulasi
    private int nil1;
    private int nil2; //pangkat
    private String arif = "";
    private String widodo = ""; //pangkat
    private double hasilNil;
    
    //menu
    private String menuYogi;
    public void copyRight()
    {
        String dataRight = ""
                + "\n__________________________________"
                + "\nNIM   : 17615006"
                + "\nNAMA  : Yogi Arif Widodo"
                + "\nCLASS : TI 3A"
                + "\n__________________________________"
                + "\n Cycber Security and Programmer"
                + "\n__________________________________"
                + "\n Talks is Cheap -> Show Me The Code"
                + "\n mailto : yogirenbox33@gmail.com  ";
        JOptionPane.showMessageDialog(null, ""+dataRight,"Thanks For Use My Program",JOptionPane.INFORMATION_MESSAGE);
        System.out.println(""+dataRight);
    }
    public void konVers()//JOptionConvert
    {
        setNil1(Integer.parseInt(getArif()));
        setNil2(Integer.parseInt(getWidodo()));
    }
    public void hitung()
    {
        //process
        this.setHasilNil(Math.pow(getNil1(), getNil2())); //pemangkatan dengan pow
    }
    public void hasil()
    {
        //output
       JOptionPane.showMessageDialog(null, "Hasil Dari "
               + "" +this.getNil1()
               + " pangkat " +this.getNil2()
               + "\n adalah : " +this.getHasilNil(),"Program Pemangkatan",JOptionPane.INFORMATION_MESSAGE);
    }
    public void inPut()
    {
        //io
        setArif(JOptionPane.showInputDialog(null,"Masukan Nilai Pangkat","Program Pemangkatan",JOptionPane.INFORMATION_MESSAGE));
        setWidodo(JOptionPane.showInputDialog(null,"Masukan Nilai Pangkatnya","Program Pemangkatan",JOptionPane.INFORMATION_MESSAGE));
    }

    /**
     * @return the nil1
     */
    public int getNil1() {
        return nil1;
    }

    /**
     * @param nil1 the nil1 to set
     */
    public void setNil1(int nil1) {
        this.nil1 = nil1;
    }

    /**
     * @return the nil2
     */
    public int getNil2() {
        return nil2;
    }

    /**
     * @param nil2 the nil2 to set
     */
    public void setNil2(int nil2) {
        this.nil2 = nil2;
    }

    /**
     * @return the arif
     */
    public String getArif() {
        return arif;
    }

    /**
     * @param arif the arif to set
     */
    public void setArif(String arif) {
        this.arif = arif;
    }

    /**
     * @return the widodo
     */
    public String getWidodo() {
        return widodo;
    }

    /**
     * @param widodo the widodo to set
     */
    public void setWidodo(String widodo) {
        this.widodo = widodo;
    }

    /**
     * @return the hasilNil
     */
    public double getHasilNil() {
        return hasilNil;
    }

    /**
     * @param hasilNil the hasilNil to set
     */
    public void setHasilNil(double hasilNil) {
        this.hasilNil = hasilNil;
    }

    /**
     * @return the menuYogi
     */
    public String getMenuYogi() {
        return menuYogi;
    }

    /**
     * @param menuYogi the menuYogi to set
     */
    public void setMenuYogi(String menuYogi) {
        this.menuYogi = menuYogi;
    }
}
//main
class Yogi extends YdAppointment44
{
    public static void main(String[] args) 
    {
        //for
        int iNi = 1;
        int hiU = 1;
        
        //object
        YdAppointment44 yogi = new YdAppointment44();
        //menu
        yogi.setMenuYogi(JOptionPane.showInputDialog(null,"Menu Perulangan Method"
                + "\n 1. WHILE"
                + "\n 2. DO WHILE"
                + "\n 3. FOR","Program Pemangkatan",JOptionPane.INFORMATION_MESSAGE));
        if((yogi.getMenuYogi().equalsIgnoreCase("1")))
        {
            
            
            yogi.inPut();
            yogi.konVers();
            while(iNi <= yogi.getNil2())
            {
                hiU = hiU*yogi.getNil1();
                iNi++;
            }
            yogi.setHasilNil(+hiU);
            yogi.hasil();
            yogi.copyRight();
        }
        else if((yogi.getMenuYogi().equalsIgnoreCase("2")))
        {
            
            yogi.inPut();
            yogi.konVers();
            do 
            {
                hiU = hiU * yogi.getNil1();
                iNi++;
            } while (iNi <= yogi.getNil2());
            yogi.setHasilNil(+hiU);
            yogi.hasil();
            yogi.copyRight();
        }
        else if((yogi.getMenuYogi().equalsIgnoreCase("3")))
        {
            yogi.inPut();
            yogi.konVers();
            for(iNi =1; iNi <= yogi.getNil2(); iNi++)
            {
                hiU = hiU * yogi.getNil1();
            }
            yogi.setHasilNil(+hiU);
            yogi.hasil();
            yogi.copyRight();
        }        
    }
}
