/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package h10;

import java.util.Random;

/**
 *
 * 
 * @author navee
 */
public class H10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] nameArray = {"Frankie", "Janet", "Sam", "Abbie"};
        String[] flowerArray = {"petunia", "pansy", "rose", "violet", "carnation"};
        int flowers[][] = new int [4][5];
        
        Random randgen=new Random();  
        int row;
        int col;
        int k;
        
        for (row=0; row<4; row++)
            for (col=0; col<5; col++)
                flowers[row][col]=randgen.nextInt(30); // generate random number
        
        for (k=0; k<5; k++)
            System.out.print("\t" +flowerArray[k]);
            System.out.println("");
        
        for (row=0; row<4; row++){
            System.out.print(nameArray[row]+"\t");
            
             for (col=0; col<5; col++)
                System.out.print(flowers[row][col] + "\t");
            System.out.println("");
        }
        
        for (int j=0; j<4; j++){
            int total = 0;
               for (k=0; k<4; k++)
                total = total + flowers[j][k];
              System.out.println(nameArray[0] + " sold " + total + " flowers");
        }       
        
        for (int h=0; h<4; h++){
            int FlowerTotal = 0;
               for (int m=0; m<4; m++)
                FlowerTotal = FlowerTotal + flowers[m][h];
              System.out.println("We sold " + FlowerTotal + " " + flowerArray[h] + "s");
        }

    }//end loop
    }//end loop