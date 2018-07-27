import java.util.Scanner;

public class sandbox {
    static Scanner sc;

    public static void main(String[] args){

landing("");

    }



    public static String landing(String response) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome\nBegin a game? [y/n]");
        String input = sc.nextLine().trim().toLowerCase();
        if (input.endsWith("y")) {
            return start("");
        } else if (input.endsWith("n") || input.isEmpty()) { //ends with ! or upper case and is empty..
            System.out.println("Oh..");
            return noGood("Too bad");

        }
        return landing("");
    }
    public static String noGood(String blank){
        System.out.println("Pity");
        return ("");
    }

    public static String start(String response){
        System.out.println("Wonderfull.\nLet's see how far you can get.");

        return noGood("");
    }



}

    //have a statement to execute when a letter other than y or n is entered//