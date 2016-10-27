package org.teachingkidsprogramming.section02methods;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;

public class PyramidsOfGiza
{
  public static void main(String[] args) throws Exception
  {
    setUpPyramidLand();
    Tortoise.turn(-90);
    Tortoise.move(220);
    Tortoise.turn(135);
    Tortoise.move(100);
    Tortoise.turn(90);
    Tortoise.move(100);
    Tortoise.turn(-90);
    Tortoise.move(100);
    Tortoise.turn(90);
    //  Move the tortoise 100 pixels
    Tortoise.move(100);
    //  Turn the tortoise 90 degrees to the left 
    Tortoise.turn(-90);
    //  Move the tortoise 100 pixels
    Tortoise.move(100);
    //  Turn the tortoise 90 degrees to the right 
    Tortoise.turn(90);
    //  Move the tortoise 100 pixels
    Tortoise.move(100);
    //  Turn the tortoise 135 degrees to the right
    Tortoise.turn(135);
    //  Move the tortoise 210 pixels
    Tortoise.move(210);
  }
  private static void setUpPyramidLand()
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    Tortoise.getBackgroundWindow().setBackground(PenColors.Blues.AliceBlue);
    Tortoise.setPenColor(PenColors.Yellows.DarkGoldenrod);
    Tortoise.setPenWidth(2);
    Tortoise.hide();
  }
}
