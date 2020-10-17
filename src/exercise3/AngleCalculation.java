package exercise3;

import java.util.Scanner;

public class AngleCalculation{

  public static void main (String[] args){

   Scanner input = new Scanner(System.in);

        float a  = input.nextFloat();
        
        char einheit = input.next().charAt(0);

        do{
          if (einheit == 'r'){
            double grad = a*180.0/Math.PI;
            System.out.println("Angle: " + grad + "d");

          } else {
            double radiant = a*Math.PI/180.0;
            System.out.println("Angle: " + radiant + "r");

            
          } 
          a  = input.nextFloat();
          einheit = input.next().charAt(0);
        
        }
         
        while (einheit == 'd' || einheit == 'r');
        
  }
}