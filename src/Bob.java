import java.util.Scanner;

public class Bob {
    public static void main(String[] args){

    talkToBob("Hello");         //calling method



    }

    public static void talkToBob(String input){         //declare and initialize method

        Scanner sc = new Scanner(System.in);            //set scanner

        System.out.println("Write something to Bob");   //print question
        String response = sc.nextLine().trim();         //declare variable to hold the input

        if(response.endsWith("?")) {            // if input ends with ?
            System.out.println("'Sure'");       //then do this

        } else if(response.endsWith("!") || (response.toUpperCase().equals(response) && !response.isEmpty() )){ //ends with ! or upper case and is empty..
            System.out.println("'Bruh...chillax'");

        }else if (response.isEmpty()){      //is the input is empty
            System.out.println("Fine. Be that way!");   //then do this

        }else if (response.endsWith("Bob")){        //if input ends with his name
            System.out.println("...");              //then do this

        }


    }
}
