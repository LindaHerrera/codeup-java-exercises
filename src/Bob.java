import java.util.Scanner;

public class Bob {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Write something");
        String response = sc.nextLine().trim();

        if(response.endsWith("?")) {
            System.out.println("'Sure'");
        } else if(response.endsWith("!") || response.toUpperCase().equals(response) && !response.isEmpty() ){
            System.out.println("'Bruh...chillax'");
        }else if (response.isEmpty()){
            System.out.println("Fine. Be that way!");
        }




    }
}
