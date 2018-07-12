/**
 * 
 */
package com.amydegregorio.javabasics.controlstructures;

/**
 * Examples of switch statements.
 * 
 * @author AMD
 *
 */
public class SwitchExample {
   /**
    * An enumeration of weather conditions to use while demonstrating a switch statement
    * using an enumeration.
    */
   public enum Weather {
      SUNNY, CLOUDY, WINDY, RAINING, SLEETING, SNOWING, ICING
   }

   /**
    * Runs the examples.
    * 
    * @param args
    */
   public static void main(String[] args) {
      // Switch Statement using an int
      int coffeeConsumed = 3;
      String caffeinationLevel = "";
      
      switch(Math.abs(coffeeConsumed)) {
         case 5:
            caffeinationLevel = "Totally wired";
            break;
         case 4:
            caffeinationLevel = "Slightly Wired";
            break;
         case 3:
            caffeinationLevel = "Wide awake";
            break;
         case 2:
            caffeinationLevel = "Maintenance level";
            break;
         case 1:
            caffeinationLevel = "Halfway Functional";
            break;
         case 0:
            caffeinationLevel = "Tragically un-coffeed";
            break;
         default:
            caffeinationLevel = "Never Sleeping again!";
            break;
      }
      
      System.out.println(caffeinationLevel);

      //Switch statement with a string
      String currentCondition = "raining";
      
      switch(currentCondition.toLowerCase()) {
         case "sunny":
            System.out.println("Don't forget your sunscreen!");
            break;
         case "cloudy":
            System.out.println("Hedge your bets: sunscreen and an umbrella!");
            break;
         case "raining":
            System.out.println("Bring your umbrella!");
            break;
         case "snowing":
            System.out.println("Start shoveling");
            break;
         case "sleeting": case "icing": 
            System.out.println("Go back to bed.");
            break;
         case "windy":
            System.out.println("Maybe leave the hat at home today.");
            break;
         default:
            System.out.println("Welcome to New England! We're going to have ALL the weather today.");
            break;
      }
      
      //Switch statement with an enum
      Weather currentWeather = Weather.SLEETING;
      
      switch(currentWeather) {
         case SUNNY:
            System.out.println("Don't forget your sunscreen!");
            break;
         case CLOUDY:
            System.out.println("Hedge your bets: sunscreen and an umbrella!");
            break;
         case RAINING:
            System.out.println("Bring your umbrella!");
            break;
         case SNOWING:
            System.out.println("Start shoveling");
            break;
         case SLEETING: case ICING:
            System.out.println("Go back to bed.");
            break;
         case WINDY:
            System.out.println("Maybe leave the hat at home today.");
            break;
         default:
            System.out.println("Welcome to New England! We're going to have ALL the weather today.");
            break;   
      }
   }

}
