import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
            Random random = new Random();
            int min = 0;
            int max = 0;
            int sum = 0;
            while (sum <5000) {
                int temp = random.nextInt(31);
                if (temp > max) max = temp;
                if (temp < min) min = temp;
                sum = sum + temp;
            }
            System.out.println(sum);
            System.out.println("max to " + max);
            System.out.println("Min to " + min);
    }
}
