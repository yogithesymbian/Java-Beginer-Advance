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
 
 public class Student extends Person{
     public Student()
     { 
         //super( "SomeName", "SomeAddress");
         //super(); 
         //super.name = "name";
         System.out.println("Inside Student:Constructor");
     }
     public static void main( String[] args) 
     { 
         Student anna = new Student(); 
     } 
} 