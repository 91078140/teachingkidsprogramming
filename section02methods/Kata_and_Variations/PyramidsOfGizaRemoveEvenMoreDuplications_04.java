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
//------------Kata Question----------
//Where do you see duplications lines of code?
//and how can you refactor to make this code more readable?
//write out the steps in English
//Then translate the steps into code
//Make sure to run each line
//------------Kata Question----------
//Where do you see duplications lines of code?
//and how can you refactor to make this code more readable?
//write out the steps in English
//Then translate the steps into code
//Make sure to run each line
//Be aware: this is an example of too much refactoring, i.ei after
// we're done 

//
public class PyramidsOfGizaRemoveEvenMoreDuplications_04
{
  public static void main(String[] args) throws Exception
  {
    setUpPyramidLand();
    // bad refactoring
    int[][] degreesAndLength = {{-90, 220},
                                {135, 100},
                                {90, 100},
                                {-90, 100},
                                {90, 100},
                                {-90, 100},
                                {90, 100},
                                {135, 210},};
    for (int[] i : degreesAndLength)
    {
      Tortoise.turn(i[0]);
      Tortoise.move(i[1]);
    }
  }
  private static void setUpPyramidLand()
  // bad refactoring
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    Tortoise.getBackgroundWindow().setBackground(PenColors.Blues.AliceBlue);
    Tortoise.setPenColor(PenColors.Yellows.DarkGoldenrod);
    Tortoise.setPenWidth(2);
    Tortoise.hide();
  }
}
