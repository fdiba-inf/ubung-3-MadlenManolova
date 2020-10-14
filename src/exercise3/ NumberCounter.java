package exercise3;

import java.util.Scanner;

public class NumberCounter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int counternegativ = 0;
        int counterpositiv = 0;
        int sum = 0;
        int number = input.nextInt();
        float average = sum/(counterpositiv + counternegativ);
        while (number != 0) {

          if (number > 0) 
          { counterpositiv++;}     
          else 
          { counternegativ++;} 
          sum = sum + number;
          number = input.nextInt();
        }

          
        
        
          
        System.out.println("Negative numbers: " + counternegativ);
        System.out.println("Positive numbers: " + counterpositiv);
        System.out.println("Sum: " + sum );
        System.out.println("Average: " + avarage);
    }

}
