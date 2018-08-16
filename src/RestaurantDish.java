public class RestaurantDish {    //==> class but also object since it holds properties
    private int costInCents;     //==> properties vvv
    private String nameOfDish;
    private boolean wouldRecommend;

    public String eat(){
        return "Nom nom nom!";
    }

    public RestaurantDish() {}

    public RestaurantDish(int costInCents, String nameOfDish, boolean wouldRecommend) {
        this.costInCents = costInCents;
        this.nameOfDish = nameOfDish;
        this.wouldRecommend = wouldRecommend;
    }

    public int getCostIntCents(){
        return this.costInCents;
    }
    public void setCostInCents(int costInCents) {
        //include more logic
        this.costInCents = costInCents;
    }


    public String getNameOfDish() {
        return this.nameOfDish;
    }

    public void setNameOfDish(String nameOfDish) {
        this.nameOfDish = nameOfDish;
    }

    public boolean isWouldRecommend() {
        return wouldRecommend;
    }

    public void setWouldRecommend(boolean wouldRecommend) {
        this.wouldRecommend = wouldRecommend;
    }
}
