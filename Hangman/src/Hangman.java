
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Hangman {
    public static void main(String[] args) {
        //initialize the scanner
        Scanner scanner = new Scanner(System.in);
        //print out the Enter the hangman word:
        System.out.print("Enter the hangman word: ");
        //prompt
        String input = scanner.nextLine();
        //declare first array to convert the inputed string to array
        List<Character> hangmanword = new ArrayList <Character> ();
        for(int i =0  ; i < input.length(); i++){
                hangmanword.add(input.charAt(i));
         }
        Character check;
        List<Character> answer = new ArrayList <Character> ();
        for(int j =0  ;j < hangmanword.size(); j++){
            answer.add('-');
        }
        int life = 5;
        while(life > 0){
        System.out.print("Enter the char to guess: ");
        String guess = scanner.next();
        if (!hangmanword.contains(guess.charAt(0))){
                life = life - 1;
        }
        for(int j =0  ;j < hangmanword.size(); j++){
           check = input.charAt(j);
           if (check.equals(guess.charAt(0)) ){
               System.out.println("You Guess it right!!!");
               answer.set(j , check);
           }
        }
            System.out.println(life + "\n" +answer + "\n\n");
        if (!answer.contains('-')){
            System.out.println("\n Winner!!!" + "\n\n");
            break;
        }
        }
        if(life == 0) {
            System.out.println("\n Game Over!!!" + "\n\n");
        }
    }
}
