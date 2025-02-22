//This Java program reads the length and width of the yard and radius of the flower bed
//It calculates the cost of the fence and sod.
//The results with two decimal places will be displayed.
package h2;

import java.util.Scanner;
import java.text.DecimalFormat;

public class H2 {

    
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        DecimalFormat DF = new DecimalFormat("##.00");
        System.out.println("Please enter length");
        double length = scnr.nextDouble();
        
        System.out.println("Please enter width");
        double width = scnr.nextDouble();
        
        System.out.println("Please enter radius");
        double radius = scnr.nextDouble();
        
        final double FenceCostPerFoot = 2.50;
        final double SodCostSqPerFoot = 1.50;

        Rectangle rYard = new Rectangle(length,width);
        Circle cFlowers = new Circle(radius);
        
        //Calculate perimeter of rectangular yard
        double perimeter = rYard.perimeter();
        
        //Calculate area of rectangular yard
        double yardArea = rYard.area();
        
        //Calculate Area of flower bed
        double flowerBedArea = cFlowers.area();
        
        //Calculate Sod Area
        double sodArea = yardArea - flowerBedArea;
        
        //Cost of fence
        double fenceCost = Math.ceil(perimeter) * FenceCostPerFoot;
        double sodCost = Math.ceil(sodArea) * SodCostSqPerFoot;
        
        //Calculate total cost
        double totalCost = fenceCost + sodCost;
        
        //Disply results:
        System.out.println("The cost of fence is $" + DF.format(fenceCost));
        System.out.println("The cost of sod is $" + DF.format(sodCost));
        System.out.println("Total cost is $" + DF.format(totalCost));
    }
    
}
