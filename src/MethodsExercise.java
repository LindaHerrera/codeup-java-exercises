public class MethodsExercise {

    public static void main(String[] args){

        System.out.println("The sum of the numbers you entered: "+isAdd(4, 2));
        System.out.println("The difference in the numbers is: "+isMinus(4,2));
        System.out.println("The total for those numbers are: "+ multi(4, 2));
        System.out.println("When you divide those numbers you get: "+ divide(4, 2));
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
        int product = num1 * num2;
        return product;
}
public static int divide(int num1, int num2){
        int result = num1 /num2;
        return result;
}

}
