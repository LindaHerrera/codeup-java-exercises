import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args){


//        boolean condition = true;
//        int i = 5;
//
//        while(condition){
//            if(i == 15){
//                condition = false;
//            }
//            System.out.print(i + " ");
//            i++;
//        }
//
//--------------------------------------
//        int i = 100;
//        do {
//            System.out.println(i);
//            i -= 5;
//        } while(i >= -10);

//---------------------------------------------

//        for(int n = 5; n <=15; n++){
//            System.out.println("this is the for loop: " + n);
//            }
//---------------------------------------
//        long i = 2;     ==> the variable had to be changed to long since int couldn't hold it'
//        do{
//            System.out.println(i);
//            i *= i;
//        }while(i <= 65536);

//---------------------------------------------
//        for(int i = 1; i<= 100; i++) {
//            if (i % 15 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else if(i % 3 == 0) {
//                System.out.println("Fizz");
//            }else {
//                System.out.println(i);
//            }
//        }
//**we need to reorder the conditions to make sure rarest condition is listed first then most likly as we go down
//---------------------------------------------
        Scanner sc = new Scanner(System.in);
        System.out.print("What number would you like to go up to? ");
        int ans = sc.nextInt();
        System.out.println();
        System.out.println("Here is your table! " + ans);
        System.out.println();
        System.out.println("number | squared | cubed");
        System.out.println("------ | ------- | ------");
        for(int i = 1; i <= ans; i += 1){

        }




    }
}
