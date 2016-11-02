package org.teachingkidsprogramming.section03ifs.Katas_and_Variations;

import java.awt.Color;

import org.teachingextensions.approvals.lite.util.ThreadUtils;
import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class ChooseYourOwnAdventure2
{
  public static void main(String[] args)
  {
    startStory();
  }
  private static void startStory()
  {
    tellMoreStory("One morning the Tortoise woke up in a dream.");
    animateStartStory();
    String action = askAQuestion("Do you want to 'wake up' or 'explore' the dream?");
    if ("wake up".equalsIgnoreCase(action))
    {
      wakeUp();
    }
    else if ("explore".equalsIgnoreCase(action))
    {
      approachOoze();
      String action1 = askAQuestion("Do you want to pour the ooze into the 'backyard' or 'toilet'?");
      if ("toilet".equalsIgnoreCase(action1))
      {
        pourIntoToilet();
        if ("yes".equalsIgnoreCase(action1))
        {
          MessageBox
              .showMessage("Awesome dude! You live out the rest of your life fighting crimes and eating pizza!");
        }
        if ("heck yes".equalsIgnoreCase(action1))
        {
          MessageBox
              .showMessage("Awesome dude! You live out the rest of your life fighting crimes and eating pizza!");
        }
        else if (action1 == null)
        {
          endStory();
        }
      }
      if ("backyard".equalsIgnoreCase(action1))
      {
        pourIntoBackyard();
        if ("faint".equalsIgnoreCase(action1))
        {
          startStory();
        }
        if ("scream".equalsIgnoreCase(action1))
        {
          MessageBox.showMessage("You made a delicious soup! Yum! The end.");
        }
        else if (action1 == null)
        {
          endStory();
        }
      }
      else if (action1 == null)
      {
        endStory();
      }
    }
    else
    {
      endStory();
    }
  }
  private static void pourIntoBackyard()
  {
    MessageBox.showMessage(
        "As you walk into the backyard a net scoops you up and a giant takes you to a boiling pot of water.");
    MessageBox.askForTextInput("As the man starts to prepare you as soup, do you...'Scream' or 'Faint'?");
  }
  private static void pourIntoToilet()
  {
    MessageBox.showMessage(
        "As you pour the ooze into the toilet it backs up, gurgles, and explodes, covering you in radioactive waste.");
    MessageBox.askForTextInput("Do you want to train to be a NINJA?  'Yes' or 'HECK YES'?");
  }
  private static void endStory()
  {
    MessageBox.showMessage("You don't know how to read directions. You can't play this game. The end.");
  }
  private static void wakeUp()
  {
    MessageBox.showMessage("Wake up and get back to your miserable life.");
  }
  private static void approachOoze()
  {
    MessageBox.showMessage("You approch a glowing bucket of green ooze.");
    MessageBox.showMessage("Afraid of getting in troble you pick up the bucket.");
  }
  private static void animateStartStory()
  {
    Tortoise.show();
    Color color = PenColors.Grays.Black;
    for (int i = 0; i < 25; i++)
    {
      Tortoise.getBackgroundWindow().setColor(color);
      color = PenColors.lighten(color);
      ThreadUtils.sleep(100);
    }
  }
  private static void tellMoreStory(String message)
  {
    MessageBox.showMessage(message);
  }
  private static String askAQuestion(String question)
  {
    String answer = MessageBox.askForTextInput(question);
    return answer;
  }
}
