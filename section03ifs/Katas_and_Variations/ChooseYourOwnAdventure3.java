package org.teachingkidsprogramming.section03ifs.Katas_and_Variations;

import java.awt.Color;

import org.teachingextensions.approvals.lite.util.ThreadUtils;
import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class ChooseYourOwnAdventure3
{
  public static void main(String[] args)
  {
    startStory();
  }
  private static void startStory()
  {
    tellMoreStory("One morning Godzilla saw a city");
    animateStartStory();
    String action = askAQuestion("Do you want to 'enter' or 'walk away' from the city?");
    if ("walk away".equalsIgnoreCase(action))
    {
      wakeUp();
    }
    else if ("enter".equalsIgnoreCase(action))
    {
      approachOoze();
      String action1 = askAQuestion("Do you want to 'breack it' or 'destory it'?");
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
      if ("drink it".equalsIgnoreCase(action1))
      {
        MessageBox.askForTextInput(
            "It is so bad that you stop drinking it do you want to continue 'drinking' or 'stop'.");
        if ("stop".equalsIgnoreCase(action1))
        {
          MessageBox
              .showMessage("You stoped and the ooze melts your stomach, you can't move and you die. THE END");
        }
        if ("drinking".equalsIgnoreCase(action1))
        {
          MessageBox.showMessage(
              "You feel great, so great that you fly away and fight crime until you become the villan. The end.");
        }
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
    MessageBox.showMessage("There is a brige in your way.");
    MessageBox.showMessage("You are so big that you can't go under.");
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
