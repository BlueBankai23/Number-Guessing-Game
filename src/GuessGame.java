import java.util.Scanner;
public class GuessGame {
   public static void main(String[] args) {
    int secretNum = (int)(Math.random()*100+1);
    int guess;
    boolean correct=false;
    Scanner KeyBoard=new Scanner(System.in);
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
