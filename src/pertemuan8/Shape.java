/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan8;

/**
 *
 * @author Yogi Arif Widodo <Yogi at scodeid.blogspot.com>
 */
abstract class Shape 
{
       
    
    String bangunRuang;
    
//
//    public abstract void shape();
//    
//    public String getBangunRuang() 
//    {
//        return bangunRuang;
//    }
//
//    public void setBangunRuang(String bangunRuang) 
//    {
//        this.bangunRuang = bangunRuang;
//    }
    
    abstract double computAreaSegitiga(double a, double t);
    abstract double computAreaPersegi(double a, double t);
    abstract double computAreaCircle(double r);
   
//   public double computArea()
//    {
//        return 0;
//   }
}
