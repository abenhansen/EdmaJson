package learnedma;

import learnedma.generated.valuedomains.Bird;
import learnedma.generated.valuedomains.Climates;


public class Play {

    public static void main(String[] args) {

        Climates climates = Climates.begin().add("Tropical").add("Dry").end();
        Bird bird = Bird.create().species("Phorusrhacidae").canFly(false).color("Grey").weight(0f).climate(climates).isExtinct(true);

        System.out.println(toString(bird));
    }

    public static String toString(Bird bird) {
        String json = "";
        json += "{\n" + "\t Species: " + bird.species().toString()+",";
        json += "\n" + "\t canFly: " + bird.canFly().toString()+",";
        json += "\n" + "\t color: " + bird.color().toString()+",";
        json += "\n" + "\t weight: " + bird.weight().toString()+",";
        String climates = bird.climate().toString().replaceAll("[()]","");
        json += "\n" + "\t climates: [" + climates+"],";
        json += "\n" + "\t isExtinct: " + bird.isExtinct().toString()+"\n }";
        return json;
    }
}
