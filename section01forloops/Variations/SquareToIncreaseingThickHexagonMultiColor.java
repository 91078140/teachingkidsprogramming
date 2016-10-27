package org.teachingkidsprogramming.section01forloops.Variations;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.virtualproctor.VirtualProctor;

public class SquareToIncreaseingThickHexagonMultiColor
{
  // ----Kata Question ----
  // How would you make a hexagon ...
  // with 20 pixel thick sides
  // with multi-colored lines
  // and with side lengths of 25 that increase by 2 times?
  // Write out steps in English
  // Then translate the steps into code
  // Make sure to run after each line
  public static void main(String[] args) throws Exception
  {
    VirtualProctor.setName("Timothy and John");
    VirtualProctor.setClassName("Palm Digital");
    Tortoise.show();
    Tortoise.setSpeed(10);
    Tortoise.setPenWidth(20);
    // Change number of sides to 6
    int sides = 6;
    // Start side length at 25 pixels
    int length = 5;
    for (int i = 0; i < sides; i++)
    {
      // change the color of the line to multicolor
      Tortoise.setPenColor(PenColors.getRandomColor());
      // every time through the loop double length
      Tortoise.move(length);
      length = length * 2;
      Tortoise.turn(360 / sides);
    }
  }
}
