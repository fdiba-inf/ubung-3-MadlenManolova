package exercise3;

import java.util.Scanner;

public class PrimeNumber {
  public static void main(String[] args) {
    Scanner input = new Scanner (System.in);

    System.out.println ("Eingeben Sie eine Zahl in der Konsole");

    int number = input.nextInt();
    int d=2;
    boolean prime = true;
    while (d < number){
      if (number % d == 0) {
        prime = false;
        break;
      }
      d++;
    }
    System.out.println ("Prime number: " + prime);

  }

}
