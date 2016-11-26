/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package moremathpractice;
import java.text.DecimalFormat;
/**
 *
 * @author Shane Bishop
 */
public class MoreMathPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double rectanglewidth;
        double rectanglelength;
        double doubleResult;
        
        rectanglewidth = 5.7;
        rectanglelength = 4.8;
        doubleResult = rectanglewidth * rectanglelength;
        
        System.out.println("The area of a rectangle\n5.7 feet by\n4.8 feet is\n" + doubleResult + " square feet\n");
        
        double carpetlength;
        double carpetwidth;
        double price;
        
        carpetlength = 8.5;
        carpetwidth = 6;
        price = 19.95;
        doubleResult = carpetlength * carpetwidth * price;
        DecimalFormat df2 = new DecimalFormat("0.00");
        
        System.out.println("Therefore, the cost to carpet a room of said dimesions is $" + df2.format(doubleResult));
        
        double printingDoubles;
        
        printingDoubles = 12.3456789;
        
        DecimalFormat df = new DecimalFormat("0.000");
        System.out.println("\nNumber to three decimal places: " + df.format(printingDoubles));   
    }
    
}
