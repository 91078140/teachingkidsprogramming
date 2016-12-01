package org.teachingkidsprogramming.section06modelviewcontroller.Katas_and_Variations;

import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class AdLibsVariation01
{
  public static void main(String[] args)
  {
    String adverb = askAdverb();
    MessageBox.showMessage("The adverb is " + adverb);
    String edVerb = askEdVerb();
    MessageBox.showMessage("The edverb is " + edVerb);
  }
  public static String askAdverb()
  {
    String adverb = MessageBox.askForTextInput("What is the adverb");
    if (adverb.isEmpty())
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
    return edVerb;
  }
}