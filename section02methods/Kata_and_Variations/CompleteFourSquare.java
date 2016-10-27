package org.teachingkidsprogramming.section02methods.Kata_and_Variations;
//-------------FourSquare Kata------------

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;

// Use the Tortoise to draw four squares, each with a width and height of 50 pixels
//Write out the steps in English
//Then translate the steps into code
// Make sure to run after each line
public class CompleteFourSquare
{
  public static void main(String[] args)
  {
    System.out.println("be sure to complete the main method to start");
    //TODO: write comments and then code here
    // Show the tortoise--#1
    Tortoise.show();
    // Move the tortoise as fast as possible--#6
    Tortoise.setSpeed(10);
    // Repeat 4 times--#8.1
    for (int i = 0; i < 4; i++)
    {
      // Turn the tortoise 90 degrees to the right--#9
      Tortoise.turn(90);
      drawSquare();
      // ---Repeat--#8.2
    }
  }
  private static void drawSquare()
  {
    //   drawSquare (recipe below)--#7.1 
    // Repeat the following 4 times--#5.1
    for (int i = 0; i < 4; i++)
    {
      // Make the pen color random--#4
      Tortoise.setPenColor(PenColors.getRandomColor());
      // Move the tortoise 50 pixels--#2
      Tortoise.move(50);
      // Turn the tortoise 90 degrees to the right--#3
      Tortoise.turn(90);
      // ---Repeat--#5.2
    }
    //   ------------- Recipe for drawSquare--#7.2 
    //      set the method--#7.3
  }
}