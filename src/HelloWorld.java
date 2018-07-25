public class HelloWorld {

public int x;

    public static void main(String[] args) {
        System.out.println("Testing 123..456...");

        int myFavoriteNumber = 23;
        System.out.println("My favorite number is: " + myFavoriteNumber);

        String myString = "You gotta be odd to be number one";
        System.out.println("Here is my string: " + myString);

        myString = "yeah yeah yeah";
        System.out.println("new string: " + myString);

        char oneLetter = 'y';
        System.out.println("This is one letter: " + oneLetter);

        double aNumber = 3.14159;
        System.out.println("Here is a number: " + aNumber);

        float myNumber = 123;
        System.out.println("Here is the second number:" + myNumber);

        int x = 5;
        System.out.println(x++);
        System.out.println(x);

         x = 6;
        System.out.println(++x);
        System.out.println(x);

        int y = 4;
        System.out.println(++y + " is the value of y");

        int num1 = 3;
        int num2 = 4;
        num2 = num1 * num2;
        System.out.println("value of num2: " + num2);

        int a = 10;
        int b = 2;
        a = a / b;
        b = b - a;
        System.out.println("value of a: " + a);
        System.out.println("value of b: " + b);

    }
}
