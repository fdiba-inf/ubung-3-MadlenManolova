package exercise3;

import java.util.Scanner;

public class NumberCounter{

 public static void main (String[] args){
  Scanner input = new Scanner(System.in);

        int counternegativ = 0;
        int counterpositiv = 0;
        double sum = 0.0;
        int number = input.nextInt();
        int count = 0;
        double average = 0.0;
        while (number != 0) {
          
          if (number > 0) 
          {counterpositiv++;}     
          else 
          {counternegativ++;} 
          count++;
          sum = sum + number; 
          number = input.nextInt();
        }

          
         
        average = sum/count;
          
        System.out.println("Negative numbers: " + counternegativ);
        System.out.println("Positive numbers: " + counterpositiv);
        System.out.println("Sum: " + sum );
        System.out.println("Average: " + average);
    


 }
}