import java.util.Scanner;

public class Colors {
    public static String getUserSelection() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter the first letter of the color and I will guess what color it is");
            String calc = scanner.nextLine().trim().toUpperCase();
            switch (calc) {
                case "A":
                    return "Alizarin";
                case "B":
                    return "Blue";
                case "C":
                    return "Cherry";
                case "D":
                    return "Denim";
                case "F":
                    return "Fuchsia";
                default:
                    System.out.println("Sorry I do not know this color please specify another.");
            }
        }
    }
    public static void main(String[] args) {
        String result = getUserSelection();
        System.out.println(result);
    }
}