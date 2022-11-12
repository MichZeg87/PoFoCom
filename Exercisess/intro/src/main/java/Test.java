import java.util.Random;

public class Test {
    public int getCountOfRandomNumber(int max) {
        Random random = new Random();
        int result = 0;
        int sum = 0;
        while (sum < max) {
            int temp = random.nextInt(10);
            sum = sum + temp;
            result++;
        }
        return result;
    }

    public static void main(String[] args) {
        Test test= new Test();
        test.getCountOfRandomNumber(20);
    }
}
