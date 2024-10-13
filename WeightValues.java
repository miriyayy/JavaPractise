import java.util.Scanner;

public class WeightValues {

    // gezegenlerin ağırlık sayıları, dünyaya
    enum Gezegen {
        MERCURY(0.378),
        VENUS(0.907),
        EARTH(1.0),
        MARS(0.377),
        JUPITER(2.364),
        SATURN(0.916),
        URANUS(0.889),
        NEPTUNE(1.125);

        private final double weightcoefficient;

        Gezegen(double weightcoefficient) {
            this.weightcoefficient = weightcoefficient;
        }

        public double getWeightcoefficient() {
            return weightcoefficient;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your weight on earth in kilograms: ");
        double worldWeight = scanner.nextDouble();

        System.out.println("Here's your weight on other planets:");

        Gezegen[] planets = Gezegen.values();
        for (Gezegen planet : planets) {
            double weight = worldWeight * planet.getWeightcoefficient();

            System.out.println(planet + ": "+ weight +  "kilogram");
        }

        scanner.close();
    }
}
