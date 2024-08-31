import java.util.*;
public class Game{
    int num;
    int comp_num;
    String ans;
    public void random(){
        comp_num = new Random().nextInt(100);
    }
    public void user(){
        System.out.print("Enter your number : ");
        num = new Scanner(System.in).nextInt();
    }
    public void num_detect(){
        if(comp_num==num){
            System.out.println("Congratulation you are right guess number");
            System.out.println();
            System.out.println("do you want to play again\ntype 'yes' or 'no'");
            ans = new Scanner(System.in).next();
            if(ans.equals("yes")){
                System.out.println("✨✨✨✨✨✨✨✨✨✨✨✨");
                System.out.println("Guess the number Game");
                System.out.println();
                Game play = new Game();
                play.user();
                play.random();
                play.num_detect();
            }
            else {
                System.out.println("Thanks for play this game");
                System.out.println("\uD83D\uDE4F\uD83C\uDFFB\uD83D\uDE4F\uD83C\uDFFB\uD83D\uDE4F\uD83C\uDFFB\uD83D\uDE4F\uD83C\uDFFB");
            }

        }
        else if (comp_num<num) {
            System.out.println("your number is greater");
            user();
            num_detect();
        }
        else {
            System.out.println("your number is less");
            user();
            num_detect();
        }
    }


}
//**********************************************************************************************************************
class Guess_the_num {
    public static void main(String[] args) {
        System.out.println("Guess the number Game \uD83C\uDFAE\uD83C\uDFAE");
        System.out.println();
        Game play = new Game();
        play.user();
        play.random();
        play.num_detect();
    }
}