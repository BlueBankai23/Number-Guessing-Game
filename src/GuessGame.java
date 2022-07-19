import java.util.Scanner;

public class GuessGame {
   public static void main(String[] args) {
    int range;
    int secretNum;
    System.out.println("Choose the range: ");
    System.out.println("10 ");
    System.out.println("100");
    System.out.println("1000");
    Scanner KeyBoard=new Scanner(System.in);
    range=KeyBoard.nextInt();
    int guess;
    boolean correct=false;
    if(range==10) 
    {
         secretNum = (int)(Math.random()*10+1);
         while(!correct)
         {
            System.out.println("Guess: ");
            guess=KeyBoard.nextInt();
            if(guess == secretNum){
            correct=true;
            System.out.println("You Guessed Correctly");
            }
            else if(guess<secretNum)
            {
               System.out.println("Guess Higher");
            }
            else if(guess>secretNum)
            {
               System.out.println("Guess Lower");
            }
         }
     } 
     else if(range==100)
     {
      secretNum = (int)(Math.random()*100+1);
      while(!correct)
      {
        
         System.out.println("Guess: ");
         guess=KeyBoard.nextInt();
         if(guess == secretNum){
         correct=true;
         System.out.println("You Guessed Correctly");
         }
         else if(guess<secretNum)
         {
            System.out.println("Guess Higher");
         }
         else if(guess>secretNum)
         {
            System.out.println("Guess Lower");
         }
      }
     }
     else if(range==1000)
     {
      secretNum = (int)(Math.random()*1000+1);
      while(!correct)
      {
         System.out.println("Guess: ");
         guess=KeyBoard.nextInt();
         if(guess == secretNum){
         correct=true;
         System.out.println("You Guessed Correctly");
         }
         else if(guess<secretNum)
         {
            System.out.println("Guess Higher");
         }
         else if(guess>secretNum)
         {
            System.out.println("Guess Lower");
         }
      }
     }
  }
}
