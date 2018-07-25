import java.util.Scanner;

public class Bob {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("What did you eat for lunch?");
        String response = sc.next();
            if(response.equalsIgnoreCase("food")){
                System.out.println(" \'Sure\'");
            }


    }
}
