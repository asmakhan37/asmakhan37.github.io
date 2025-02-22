/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package h2;

/**
 *
 * @author navee
 */
public class Rectangle {
        private double length, width;
        //provide default constructor 
        Rectangle()
        {
           length = 0 ;
           width = 0 ;
           }
        //as well as one with 2 parameters for length and width 
        Rectangle(double l, double w)
        {
           length = l ;
           width = w ;
           }
           
        //NOTE THAT length is the first parameter, width the second
        //provide getLength, getWidth, setLength, setWidth, area, and perimeter. 
        
        public double getLength() {
           return length ;
           }
           
           public double getWidth() 
           {
              return width ;
              }
              
              public void setLength(double l) 
              {
                 length = l ;
                 }
                 
                 public void setWidth(double w) 
                 {                    
                    width = w ;
                    }
                    
                    public double area() 
                    {
                       return width * length ;
                       }
                       
                       public double perimeter() 
                       {
                          return 2 * (width + length) ;
                          
               }
               
         }

