package org.teachingkidsprogramming.section03ifs;

import org.teachingextensions.approvals.lite.util.NumberUtils;
import org.teachingextensions.logo.Sound;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class HiLow
{
  public static void main(String[] args)
  {
    NumberUtils.getRandomInt(1, 100);
    int answer = NumberUtils.getRandomInt(1, 100);
    for (int i = 0; i < 8; i++)
    {
      int guess = MessageBox.askForNumericalInput("Make a guess");
      if (guess == answer)
      {
        Sound.playBeep();
        MessageBox.showMessage("You win");
        System.exit(0);
      }
      else if (guess > answer)
      {
        MessageBox.showMessage("Too high!");
      }
      else if (guess < answer)
      {
        MessageBox.showMessage("Too low!");
      }
    }
    MessageBox.showMessage("You lose!");
  }
}
