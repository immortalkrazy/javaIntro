package help_programming;

import java.util.Scanner;

public class SeperatingCharacters {
      public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter your name: ");
            String name = sc.nextLine();
            int numberOfCharacters = name.length();
            int counter = 1;
            while (counter <= numberOfCharacters) {
                  char charAtCounter = name.charAt(counter - 1);
                  if (charAtCounter == 0) {
                        System.out.println("Zero");
                  } else {
                        System.out.println(counter + "." + " character: " + Character.toUpperCase(charAtCounter));
                  }
                  counter++;
            }

      }
}
