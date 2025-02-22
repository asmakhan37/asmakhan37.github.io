//this program reads a file called H5.txt, which creates a fraction object.
//it prints out fraction and also biggest and smallest fraction.
package h5;


public class Fraction {
    //variables 
        private int numerator;
        private int denominator;
         
        public Fraction(){
        numerator = 0;
        denominator = 1;
        }
        //constructor which creates fraction object 
        public Fraction(int n, int d){
            
            //if denominator is negative, convert both numerator and denominator to positive
            if (d < 0){
                n = n * -1;
                d = d * -1;
            }
                int g = gcd(n, d);
                numerator = n/g;
                denominator = d/g;
        }
        
        //accessor method
    public int getNumerator(){
        return numerator;
    }
    //mutator method
    public void setNumerator(int n){
        int d = denominator;
        int g = gcd(n, d);
        numerator = n/g;
        denominator = d/g;
    }
    
    //accesor method
    public int getDenominator(){
        return denominator;
    }
    
    //mutator method
    public void setDenominator(int d){
        int n = numerator;
        int g = gcd(n, d);
       
        //divide numerator by greatest common divisor, whose variable is g
        numerator = n/g;
        
        //divide denominator by greatest common divisor, whose variable is g
        denominator = d/g;
    }
     
    //method to calculate gcd(greatest common divisible)
    private int gcd(int int1, int int2)
       {
       int num = 0;
       int g = 1;
         if (int1 > int2)
       {
          num = int2;
       }
       else{
          num = int1;
          }
        for (int i = num; i > 1; i--)
        {
           if ((int1 % i == 0) && (int2 % i == 0))
           {
              g = i;
             break;
           }
        }
        return g;
       }
       
    //method to convert fraction into decimal
    public double Double(){
           return (double)numerator/(double)denominator;
       }
       
    //method to compare two method objects
    public int compareTo(Fraction f){
        
        //convert both fractions to decimal
           double d1 = this.Double();
           double d2 = f.Double();
           
           //if fraction is greter, return 1
           if (d1 > d2){
               return 1;
           }
           //if fraction is smallest, return -1
           else if (d1 < d2){
               return -1;
           }
           //if fractiona are equal, return 0
           else {
               return 0;
           }
    }
 
    @Override //method to convert fraction object to a string
    public String toString()
        {
            return numerator + "/" + denominator;
        }
    }    
