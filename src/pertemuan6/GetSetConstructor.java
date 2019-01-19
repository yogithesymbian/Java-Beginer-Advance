/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan6;

/**
 *
 * @author Yogi Arif Widodo <Yogi at scodeid.blogspot.com>
 */
public class GetSetConstructor
{
  //asd

    String merek;
    String platRacing;
    String bahanBakar;
    String colorKb;
    String model;

// ============================ S I M P L E --- C O N S T R U C T O R =================================================

    public GetSetConstructor(String merek, String platRacing, String bahanBakar, String colorKb, String model)
    {
        this.merek = merek;
        this.platRacing = platRacing;
        this.bahanBakar = bahanBakar;
        this.colorKb = colorKb;
        this.model = model;
    }

    public GetSetConstructor()
    {
        merek = "";
        platRacing = "";
        bahanBakar = "";
        colorKb = "";
        model = "";

    }

// ====================================== GET AND SETTER =====================================

    public String getMerek()
    {
        return merek;
    }

    public void setMerek(String merek)
    {
        this.merek = merek;
    }

    public String getPlatRacing()
    {
        return platRacing;
    }

    public void setPlatRacing(String platRacing)
    {
        this.platRacing = platRacing;
    }

    public String getBahanBakar()
    {
        return bahanBakar;
    }

    public void setBahanBakar(String bahanBakar)
    {
        this.bahanBakar = bahanBakar;
    }

    public String getColorKb()
    {
        return colorKb;
    }

    public void setColorKb(String colorKb)
    {
        this.colorKb = colorKb;
    }

    public String getModel()
    {
        return model;
    }

    public void setModel(String model)
    {
        this.model = model;
    }
    public void yogiViewBigData()
    {
        System.out.println(""
                + "\nMerek : "+merek
                + "\nPlat  : "+platRacing
                + "\nFuel  : "+bahanBakar
                + "\nColor : "+colorKb
                + "\nModel : "+model);
    }
//Main View ===========================================

    public static void main(String[] args)
    {
        GetSetConstructor data1 = new GetSetConstructor();
        GetSetConstructor data2 = new GetSetConstructor();
        GetSetConstructor data3 = new GetSetConstructor("Yogioh","KT B1","Uranium","Black","Legend"); // param

        System.out.println("\n Data Kendaraan Bermotor di Planet Mars \n "
                + "____________________________________ \n ");
        // set data ===============================
        data1.setMerek("Yamaha");
        data1.setPlatRacing("KT B2");
        data1.setBahanBakar("Air");
        data1.setColorKb("Green");
        data1.setModel("Indonesia");

        //============
        data1.yogiViewBigData();

        //set data and get=================================
        data2.setMerek("Honda");
        data2.setPlatRacing("KT B3");
        data2.setBahanBakar("Bensi");
        data2.setColorKb("BLACK");
        data2.setModel("Unik");

        data2.yogiViewBigData();

        System.out.println(""
                + "\nMerek :" +data2.getMerek()
                + "\nPlat  :" +data2.getPlatRacing()
                + "\nFuel  :" +data2.getBahanBakar()
                + "\nColor :" +data2.getColorKb()
                + "\nModel :" +data2.getModel());

        //================================================
        data3.yogiViewBigData();


    }
}
