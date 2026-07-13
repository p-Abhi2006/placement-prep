package placementprep.day01;

public class IfElseDemo {

    public static void main(String[] args) {

        int number = 25;

        if (number % 2 == 0) {
            System.out.println(number + " is Even");
        } else {
            System.out.println(number + " is Odd");
        }

        int a = 15;
        int b = 20;

        if (a > b) {
            System.out.println(a + " is greater");
        } else {
            System.out.println(b + " is greater");
        }
    }
}