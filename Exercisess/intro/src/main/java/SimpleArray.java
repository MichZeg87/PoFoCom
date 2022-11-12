public class SimpleArray {
    public static void main(String[] args) {
        String[] cars = new String[5];
        cars[0] = "Opel Kadett";
        cars[1] = "Ford Escort";
        cars[2] = "Alfa Romeo 156";
        cars[3] = "Opel Frontera";
        cars[4] = "Ford Fusion";
        System.out.println(cars[3]);
        int numberOfElements = cars.length;
        System.out.println(numberOfElements);
    }
}
