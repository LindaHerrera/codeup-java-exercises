public class BurgerTester {
    public static void main(String[]args){

        BurgerTools b = new BurgerTools();  //==> class/object being called to access properties
        b.mostPopularTopping = "fried egg";
        b.averageDaysBeforeExpiration = 5;
        b.temperatureWhenCooked = 160;

        System.out.println("most popular topping is: "+ b.mostPopularTopping);
        System.out.println("days before expiration: " + b.averageDaysBeforeExpiration);
        System.out.println("temp when cooked: " + b.temperatureWhenCooked);

        b.grill();  //==> the void method of grill cannot be sout because it's a void method and has nothing to return. simply calling it will do
    }
}
