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
abstract class Segitiga extends Shape
{
//
//    @Override
//    public abstract void shape();
    
    
    @Override
    public double computAreaSegitiga(double a, double t) 
    {
        return 0.5 * a * t;
    }   

    @Override
    double computAreaPersegi(double a, double t)
    {
        return a * t;
    }

    @Override
    double computAreaCircle(double r)
    {
        return 3.14 * r * r;
    }

    
    
    
    
    
    
}
