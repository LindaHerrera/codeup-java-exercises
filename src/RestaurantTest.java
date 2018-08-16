public class RestaurantTest {
    public static void main (String[] args){

        RestaurantDish dish = new RestaurantDish(1500, "Pho", true ); //==>
        RestaurantDish dish2 = new RestaurantDish();

        dish2.setCostInCents(2000);
        dish2.setNameOfDish("AwesomeDish");
        dish2.setWouldRecommend(true);
        System.out.println(dish2);
        System.out.println(dish2.getCostIntCents());
        // object being called and also the type

//        dish.nameOfDish = "Pad Se Ew";
//        dish.wouldRecommend = true;
        dish.eat();

//        System.out.println(dish.costInCents);
//        System.out.println(dish.nameOfDish);
//        System.out.println(dish.wouldRecommend);

        System.out.println(dish.eat());


    }
}
