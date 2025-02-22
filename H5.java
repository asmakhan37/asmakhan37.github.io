//this program reads a file called H5.txt, which creates a fraction object.
//it prints out fraction and also biggest and smallest fraction.

package h5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class H5 {
    //main method
    public static void main(String[] args){
        //file object to show input file
     File f = new File("H5.txt");
     Scanner fileInput = null;
try{
    //scanner object
fileInput = new Scanner(f);
}
catch (FileNotFoundException e)
{ 
    //if file not found, print error message
    System.out.println("File Not Found");
}  

//two integers from file
int numerator = fileInput.nextInt();
int denominator = fileInput.nextInt();

//fraction object to read file
Fraction frac= new Fraction(numerator, denominator);

//variables to hold biggest and smallest fraction
      Fraction biggest = frac;
      Fraction smallest = frac;
      
      //print fraction
      System.out.println(frac);

      //loop through each line
      while (fileInput.hasNext()){
          
          //two integers from file
          numerator = fileInput.nextInt();
          denominator = fileInput.nextInt();
          
          //frac object 
       frac = new Fraction(numerator, denominator);   
      
       //print fraction
       System.out.println(frac);
       
       //if fraction is biggest
       if (frac.compareTo(biggest)>0){
           biggest = frac;
           
       }
       //if fraction is smallest
           if (frac.compareTo(smallest)<0){
               smallest = frac;
       }
      }
      //print biggest fraction
      System.out.println("Biggest Fraction: " + biggest);
      
      //print smallest fraction
      System.out.println("Smallest Fraction: " + smallest);
      
    }
}

   
