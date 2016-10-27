package org.teachingkidsprogramming.section02methods.Kata_and_Variations;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
//------------Kata Question----------
//Where do you see duplications lines of code?
// and how can you refactor to make this code more readable?
//write out the steps in English
// Then translate the steps into code
//Make sure to run each line
//------------Kata Question----------
//Where do you see duplications lines of code?
//and how can you refactor to make this code more readable?
//write out the steps in English
//Then translate the steps into code
//Make sure to run each line

public class PyramidsOfGizaRemoveMoreDuplications_02
{
  public static void main(String[] args) throws Exception
  {
    setUpPyramidLand();
    Tortoise.turn(-90);
    Tortoise.move(220);
    Tortoise.turn(135);
    Tortoise.move(100);
    moveDown();
    moveUp();
    moveDown();
    moveUp();
    moveDown();
    Tortoise.turn(135);
    Tortoise.move(210);
  }
  private static void moveUp()
  {
    // Look for duplicate lines of code
    // refactor code that moves tortoise up
    Tortoise.turn(-90); //!!!
    Tortoise.move(100); //!!!
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
