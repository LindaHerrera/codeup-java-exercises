public class Person {

        private String name; //==> class variable

       public String getName(){ //==> getter. get+name of property in camel case
        return this.name; //==> we'e using this. so we know it comes from the class var
       }
       public void setName(String name){    //==> setter
           this.name = name;    //==> property ='s parameter
       }
       public void sayHello(){  //==> this is a void because it only does an action of print
           System.out.println("Hello "+this.name);
       }

}
