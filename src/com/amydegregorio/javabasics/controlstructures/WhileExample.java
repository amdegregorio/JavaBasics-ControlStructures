/**
 * 
 */
package com.amydegregorio.javabasics.controlstructures;

/**
 * Example of while and do while loops.
 * 
 * @author AMD
 *
 */
public class WhileExample {

   /**
    * Runs while loop examples.
    * 
    * @param args
    */
   public static void main(String[] args) {
      int counter = 0;
      while (counter < 5) {
         System.out.println("Counter = " + counter);
         counter++;
      }

      int doWhileCounter = 0;
      do {
         System.out.println("doWhileCounter = " + doWhileCounter);
         doWhileCounter++;
      } while (doWhileCounter < 5);
   }

}
