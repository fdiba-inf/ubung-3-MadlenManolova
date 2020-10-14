package exercise3;

import java.util.Scanner;
public class NumberSearch {
 public static void main (String[] args) {

   Scanner input = new Scanner (System.in);
   int count = 0;
   for (int i = 100; i <= 1000; i++) {
     if (i/5 && i/6) {
       System.out.print(i);
     }
   }
 }
}