package org.teachingkidsprogramming.section03ifs.Katas_and_Variations;

import org.teachingextensions.approvals.lite.util.NumberUtils;
import org.teachingextensions.logo.Sound;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;
//-------------------- Kata Question ---------------------
//How would you make sure the guess is not zero
//  and end the game if the guess is zero?
//How would you make sure the guess is not a negative number
// but go to the next turn if the guess is negative
//Then translate the steps into code
//Make sure to run after each line

//
public class HiLowNoZeroNoNegativeAndPlayOn
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
      // Use an else if to check for a negative number--#1
      else if (guess < 0)
      {
        // Tell them input is invalid and then move on--#2
        MessageBox.showMessage("This input is invalid! Next guess.");
      }
      else if (guess == 0)
      {
        MessageBox.showMessage("This input is unvalid! Program done.");
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