package exercise3;

import java.util.Scanner;

public class Triangle {

public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        float a = input.nextFloat();
        float b = input.nextFloat();
        float c = input.nextFloat();

        do{

          
          if (a > 0 && a < (b + c) && b < (a + c) && c < (a + b)) {
            if (a == b || b == c) {
              System.out.println("Triangle: " + "equilateral");
          } else if ( a == b || a == c || b == c) {
              System.out.println("Triangle: " + "isosceles");
          } else if (a != b && a != c && b != c ){
             System.out.println("Triangle: " + "scalene");
          }

          float s = (a+b+c)/2;
          double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));

          System.out.println("Area: " + area);

          
          } else {
          System.out.println("Values are not correct!");
          }
          a= input.nextFloat ();
          b= input.nextFloat ();
          c = input.nextFloat ();
        }

        while (a>0 && b>0 && c>0 );
}

}