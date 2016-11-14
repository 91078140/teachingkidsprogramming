package org.teachingkidsprogramming.section04mastery.Katas_and_Variations;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.ColorWheel;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;

public class PentagonCrazy_Variations_1
{
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    createColorPalette();
    drawPentagon();
  }
  private static void drawPentagon()
  {
    for (int i = 0; i < 400; i++)
    {
      adjustPen(i);
      i += 1;
      Tortoise.move(i);
      Tortoise.turn(600 / 3);
      Tortoise.turn(4);
    }
  }
  private static void adjustPen(int i)
  {
    Tortoise.setPenColor(ColorWheel.getNextColor());
    Tortoise.setPenWidth(Tortoise.getPenWidth() + 2);
    if (Tortoise.getPenWidth() > 2)
    {
      Tortoise.setPenWidth(2);
    }
  }
  private static void createColorPalette()
  {
    ColorWheel.addColor(PenColors.Blues.SteelBlue);
    ColorWheel.addColor(PenColors.Greens.LimeGreen);
    ColorWheel.addColor(PenColors.Reds.FireBrick);
    ColorWheel.addColor(PenColors.Blues.Teal);
    ColorWheel.addColor(PenColors.Yellows.Yellow);
  }
}
