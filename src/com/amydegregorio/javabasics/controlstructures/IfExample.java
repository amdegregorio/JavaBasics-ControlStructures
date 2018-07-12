/**
 * 
 */
package com.amydegregorio.javabasics.controlstructures;

/**
 * Examples of if statements/
 * 
 * @author AMD
 */
public class IfExample {

   /**
    * Runs the examples.
    * 
    * @param args
    */
   public static void main(String[] args) {
      
      // If statement
      boolean isAwake = true;
      
      if (isAwake) {
         System.out.println("Good Morning!");
      }
      
      // If/Else statement
      isAwake = false;
      
      if (isAwake) {
         System.out.println("Good Morning!");
      } else {
         System.out.println("WAKE UP!");
      }
      
      
      // If/then/else statement
      int coffeeConsumed = 2;
      
      if (coffeeConsumed >= 4) {
         System.out.println("Whoa! Slow down there.");
      } else if (coffeeConsumed >= 3) {
         System.out.println("You might think of stopping soon.");
      } else if (coffeeConsumed >= 2) {
         System.out.println("Just the right level of caffienation.");
      } else if (coffeeConsumed >= 1) {
         System.out.println("You're just getting started.");
      } else {
         System.out.println("What no coffee? This is a tragedy!");
      }
      
     
      
   }
   
}
