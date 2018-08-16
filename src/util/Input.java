package util;
import java.util.Scanner;

public class Input {

    private Scanner sc = new Scanner(System.in);

    public String getString(){
        System.out.println("Type: ");
        return this.sc.nextLine().trim();
    }

//    public boolean yesNo(){
//        System.out.println("Type yes or no (y/n)");
//        this.getString(); //==> or you can use this.getString because it returns the same thing
//    }


}
