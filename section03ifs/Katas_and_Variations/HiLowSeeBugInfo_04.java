package org.teachingkidsprogramming.section03ifs.Katas_and_Variations;

import org.teachingextensions.approvals.lite.util.NumberUtils;
import org.teachingextensions.logo.Sound;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;
//-------------------- Kata Question ---------------------
//What happens when you enter letters (i.e. 'abc') as your guess?
//How can you see what your guess is exactly?
//Write out the steps in English
//Then translate the steps into code
//Make sure to run after each line

//
public class HiLowSeeBugInfo_04
{
  public static void main(String[] args)
  {
    int answer = NumberUtils.getRandomInt(1, 100);
    MessageBox.showMessage("The answer is " + answer); // delete (or comment out) this line after testing the game 
    for (int i = 0; i < 2; i++)
    {
      int guess = MessageBox.askForNumericalInput("Guess a number");
      if (guess == answer)
      {
        Sound.playBeep();
        MessageBox.showMessage("You won!");
        System.exit(0);
      }
      // make and else if to check if they enter zero--#1
      else if (guess == 0)
      {
        // Tell them that they can't enter that number--#2
        MessageBox.showMessage("This input is invalid! Program done.");
        // End the game if they enter zero--#3
        System.exit(0);
      }
      else if (guess > answer)
      {
        MessageBox.showMessage("Too high");
      }
      else
      {
        MessageBox.showMessage("Too low");
      }
    }
    MessageBox.showMessage("You lost");
  }
}