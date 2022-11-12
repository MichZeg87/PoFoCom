public class LeapYear {
    public static void main(String[] args) {
        int Year = 2088;

        System.out.println(Year);

        if (Year%4 == 0
                && Year%100 != 0) {
            System.out.println("Year is Leap");
        } else if
            (Year%4 == 0
                    && Year%100 == 0
                    && Year%400 == 0){
            System.out.println("Year is Leap");
        } else {
            System.out.println("Year isn`t Leap");
        }
    }
}

