package org.teachingkidsprogramming.section02methods.Kata_and_Variations;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;

//------------Kata Question----------
//Where do you see duplications lines of code?
// and how can you refactor to make this code more readable?
//write out the steps in English
// Then translate the steps into code
//Make sure to run each line
public class PyramidsOfGizaRemoveDuplications_01
{
  public static void main(String[] args) throws Exception
  {
    setUpPyramidLand();
    Tortoise.turn(-90);
    Tortoise.move(220);
    Tortoise.turn(135);
    Tortoise.move(100);
    moveDown();
    Tortoise.turn(-90);
    Tortoise.move(100);
    moveDown();
    Tortoise.turn(-90);
    Tortoise.move(100);
    moveDown();
    Tortoise.turn(135);
    Tortoise.move(210);
  }
  private static void moveDown()
  {
    //move the tortoise down
    // extract the method and name it moveDown()
    Tortoise.turn(90);//!!!
    Tortoise.move(100);//!!!
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
