public class AbstractDemo {
    public static void main(String[] args) {

        Salary personToPay = new Salary("Lisa", "123 Apple Valley", 20, 4700.00);
        System.out.println("Calling salary reference using salary method");

        personToPay.mailCheck();

        Employee anotherPersonToPay = new Salary("Thomas", "5058 Rose Dr", 40, 5000.00);

        System.out.println("\nCalling mail check using employee reference ");

        anotherPersonToPay.mailCheck();

    }


}
