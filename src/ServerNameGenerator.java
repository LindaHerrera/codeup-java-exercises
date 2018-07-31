import java.util.Random;

public class ServerNameGenerator {

    public static void main(String[]args){

    String [] adjectives = new String[10];
    adjectives[0] = "bitter";
    adjectives[1] = "sharp";
    adjectives[2] = "frightened";
    adjectives[3] = "sweet";
    adjectives[4] = "rusted";
    adjectives[5] = "jealous";
    adjectives[6] = "cuddly";
    adjectives[7] = "drained";
    adjectives[8] = "crumpled";
    adjectives[9] = "shaggy";



//    String [] adjectives = {"bitter", "sharp", "yellow", "sweet", "rusted", "hunched", "bleached", "drained", "crumpled","starved"};


String [] nouns = new String[10];
    nouns[0] = "notebook";
    nouns[1] = "left shoe";
    nouns[2] = "chat room";
    nouns[3] = "glasses";
    nouns[4] = "coffee cup";
    nouns[5] = "nail polish";
    nouns[6] = "solo cup";
    nouns[7] = "car";
    nouns[8] = "tattoo";
    nouns[9] = "laser pointer";


    int rndN = new Random().nextInt(nouns.length);
    int rndA = new Random().nextInt(adjectives.length);
        System.out.println("Here is your server name:\n"+ adjectives[rndA]+"-"+nouns[rndN]);








    }

}
