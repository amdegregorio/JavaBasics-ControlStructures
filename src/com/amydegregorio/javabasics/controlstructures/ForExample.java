/**
 * 
 */
package com.amydegregorio.javabasics.controlstructures;

/**
 * Example of a for loop.
 * 
 * @author AMD
 */
public class ForExample {

   /**
    * Runs the for loop example.
    * 
    * @param args
    */
   public static void main(String[] args) {
      for (int i = 0; i < 5; i++) {
         System.out.println("i = " + i);
      }

      String[] colors = {"red", "orange", "yellow", "green", "blue", "indigo", "violet"};
      for (String color : colors) {
         System.out.print(color + " ");
      }
      
      for (int i = 0; i < 10; i++) {
         System.out.println("i = " + i);
         if (i == 6) {
            break;
         }
      }
      
      for (int i = 0; i < 10; i++) {
         System.out.println("i = " + i);
         if (i == 6 || i == 7) {
            continue;
         }
         System.out.println("This is additional code in the loop.");
      }
   }

}
