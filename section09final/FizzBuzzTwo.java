package org.teachingkidsprogramming.section09final;

public class FizzBuzzTwo
{
  public void main(String[] args)
  {
    for (int i = 1; i < 101; i++)
    {
      if ((i % 15) == 0)
      {
        System.out.println("FizzBuzz");
      }
      else if ((i % 3) == 0)
      {
        System.out.println("Fizz");
      }
      else if ((i % 5) == 0)
      {
        System.out.println("Buzz");
      }
      if ((i % 3) != 0 && (i % 5) != 0)
      {
        System.out.println(i);
      }
    }
  }
}
