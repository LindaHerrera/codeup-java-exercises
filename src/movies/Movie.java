package movies;

public class Movie {  //==> class that holds all code

    private String name;    //==>private property fields/instances/properties
    private String category;

    public Movie(String name, String category) {  //==> constructor with two params
        this.name = name;   //==> assigning values vvv
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

}
