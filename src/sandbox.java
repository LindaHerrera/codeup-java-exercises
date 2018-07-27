import java.util.Scanner;

public class sandbox {

    public static void main(String[] args){
testRun("");

    }
    public static String testRun(String response) {         //declare and initialize method

        Scanner sc = new Scanner(System.in);            //set scanner

        System.out.println("Welcome");   //print question
        System.out.println("Would you like to give me some of your time? [y/n]");
        String input = sc.nextLine().trim().toLowerCase();         //declare variable to hold the input
        if (input.endsWith("y")) {            // if input ends with ?
            System.out.println("So gracious. Let's begin...");       //then do this
        } else if (input.endsWith("n") ) { //ends with ! or upper case and is empty..
            System.out.println("Pitty..");
        } else if (input.isEmpty()) {      //is the input is empty
            System.out.println("Fine. Be that way!");

        }
        return testRun("");
    }


}
