package org.teachingkidsprogramming.section06modelviewcontroller.Katas_and_Variations;

import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class AdLibsVariation01
{
  public static void main(String[] args)
  {
    String adverb = askAdverb();
    //MessageBox.showMessage("The adverb is " + adverb);
    String edVerb = askEdVerb();
    //MessageBox.showMessage("The edverb is " + edVerb);
    String bodyPart = askBodyPart();
    //MessageBox.showMessage("The body part is " + bodyPart);
    String currentStory = "Today ";
    currentStory = currentStory + "I woke " + adverb + ". " + "Then I " + edVerb + " " + "my " + bodyPart + ".";
    MessageBox.showMessage(currentStory);
  }
  public static String askAdverb()
  {
    String adverb = MessageBox.askForTextInput("What is the adverb");
    if (adverb.isEmpty())
    {
      MessageBox.showMessage("Please enter an adverb");
      adverb = askAdverb();
    }
    if (adverb.matches("[\\d]*"))
    {
      MessageBox.showMessage("Please enter an adverb");
      adverb = askAdverb();
    }
    return adverb;
  }
  public static String askEdVerb()
  {
    String edVerb = MessageBox.askForTextInput("What is the edverb");
    if (edVerb.isEmpty())
    {
      MessageBox.showMessage("Please enter an edverb");
      edVerb = askEdVerb();
    }
    if (edVerb.matches("[\\d]*"))
    {
      MessageBox.showMessage("Restart since you don't know what an adverb is.");
      edVerb = askEdVerb();
    }
    return edVerb;
  }
  public static String askBodyPart()
  {
    String bodyPart = MessageBox.askForTextInput("What is the body part");
    if (bodyPart.isEmpty())
    {
      MessageBox.showMessage("Please enter a body part");
      bodyPart = askBodyPart();
    }
    if (bodyPart.matches("[\\d]*"))
    {
      MessageBox.showMessage("No body, no story, pay attention and start over!");
      bodyPart = askBodyPart();
    }
    return bodyPart;
  }
}