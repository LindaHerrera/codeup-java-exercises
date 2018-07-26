import java.util.Scanner;

public class MethodsExercise {

    public static void main(String[] args){

        System.out.println("The sum of the numbers you entered: "+isAdd(4, 2));
        System.out.println("The difference in the numbers is: "+isMinus(4,2));
        System.out.println("The product for those numbers are: "+ multi(4, 2));
        System.out.println("When you divide those numbers you get: "+ divide(4, 2));
        int userInput = getInterger(1,10);
        System.out.println("You entered in " + userInput);
    }

public static int isAdd(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
}

public static int isMinus (int num1, int num2){
        int difference = num1 - num2;
        return difference;
}
public static int multi(int num1, int num2){
//        int product = num1 * num2;
//        return product;
        int product = 0;
        for(int i = 0; i < num2; i++){
            product = product + num1;
        }
    return product;

}
public static int divide(int num1, int num2){
        int result = num1 /num2;
        return result;
}


//-----------------------------------------

    public static int getInterger(int min, int max){    //initialize method with params
    Scanner sc = new Scanner(System.in);                //declare scanner for response
        String getNumberMessage = "Enter a number between 1 and 10: "; //variable holding Q
        System.out.println(getNumberMessage); //prompting user for information
        String response = sc.nextLine();        //variable to hold response
        int convertResp = Integer.parseInt(response); //converting response from Str to int


        if(convertResp > min && convertResp < max){     //compare response to params
            System.out.println("Thanks! This was your number: "+ convertResp);
        }else{
            System.out.println("That's not right. Try again");
        }
            return getInterger(min,max) ;
    }

}
