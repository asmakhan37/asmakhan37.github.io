

package h2;

 public class Circle{  
    private double radius;
  //your code goes here
  
  //provide default constructor, constructor with one parameter, area, and circumference
  public Circle() 
  {
     radius = 0;
     }

  public Circle(double x) 
  {
     radius = x;
     }
     
     public double getRadius() 
     {
        return radius;
        }
        
        public void setRadius(double r) 
        {
           radius = r;
           }
      
       public double circumference() 
       {
             return 2*Math.PI*radius;
        }  
        
         public double area() 
         {
            return Math.PI*radius*radius;
            
            }
            
 }
