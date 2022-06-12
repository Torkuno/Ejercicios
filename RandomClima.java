public class RandomClima{
    public static void main (String[] args) {
        double climaRandom = Math.random();
        System.out.println("Clima = "+ climaRandom);

        if (climaRandom <= 0.2) {
            System.out.println("Esta lloviendo fuerte.");
        } else if (climaRandom > 0.2 && climaRandom <=0.5) {
            System.out.println("Esta lloviendo con truenos.");
        } else {
            System.out.println("El clima esta soleado.");
        }
    }
}