//Nishat Quyoum
//In class assignment 3 
//Due 3/8/2022
import java.util.Scanner;

public class AvgRainfall {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner scnr = new Scanner(System.in);
       int numYears;
       double value;
       double total = 0;
       double avrgRain;
       System.out.print("Enter number of years: ");
       numYears = scnr.nextInt();
       for(int i = 0; i<numYears; i++){
           System.out.println( "Year(s): " + i+1);
           for(int j = 0; j<12; j++){
               System.out.print(j+1 + " Month(s): ");
               value = scnr.nextDouble();
               total = total + value;
           }
       }
       
      System.out.println("Total years: " + numYears);
      System.out.println("Total rainfall: " + total);
      System.out.println("Average rainfall: " + total/(numYears*12));
    }
    
}
