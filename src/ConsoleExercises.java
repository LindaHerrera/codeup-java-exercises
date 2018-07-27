import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter a number: ");        //asking question//
        int num = sc.nextInt();                 //holds answer
        sc.nextLine();                          //break to eat so the return isn't taken from int answer
        System.out.print("Thank you for entering " + num + "! \n");

        System.out.println("enter a word ");       //ask question
        String word1 = sc.nextLine();           //holds answer. no empty break needed since we're dealing with strings

        System.out.println("enter a second word");    //ask question
        String word2 = sc.nextLine();           //holds answer

        System.out.printf("Your words are: %s and %s", word1, word2);
        sc.nextLine();



        System.out.println("Give me a sentence");
        String sentence = sc.nextLine();
        System.out.println("Your sentence is");

        System.out.println(sentence);

        System.out.println("Give me length");
        String length = sc.nextLine();

        System.out.println("now the width");
        String width = sc.nextLine();

        double area = Double.parseDouble(length) * Double.parseDouble(width);
        System.out.println(length +" x " +width + "= "+ area);



    }

}
