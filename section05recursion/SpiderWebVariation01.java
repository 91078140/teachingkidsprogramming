package org.teachingkidsprogramming.section05recursion;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.Turtle.Animals;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;

public class SpiderWebVariation01
{
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    Tortoise.setPenWidth(5);
    Tortoise.setAnimal(Animals.Spider);
    Tortoise.setPenColor(PenColors.Browns.SandyBrown);
    Tortoise.getBackgroundWindow().setBackground(PenColors.Browns.SaddleBrown);
    float length = 15f;
    float zoom = 5f;
    for (int i = 0; i < 15; i++)
    {
      length = weaveOneLayer(length, zoom);
      zoom = zoom * 6f;
    }
  }
  private static float weaveOneLayer(float length, float zoom)
  {
    for (int i = 0; i < 15; i++)
    {
      drawTriangle(length, zoom);
      Tortoise.turn(720 / 40);
      length = length + zoom;
    }
    return length;
  }
  private static void drawTriangle(float length, float zoom)
  {
    for (int i = 0; i < 35; i++)
    {
      Tortoise.move(length);
      Tortoise.turn(720 / 29);
    }
  }
}
