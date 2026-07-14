import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Employee Number: ");
        int empNo = input.nextInt();

        System.out.print("Enter Department (IT/HR/SALES): ");
        String department = input.next().toUpperCase();

        switch (empNo) {
            case 1 -> {
                System.out.println("Employee Name: Abhishek P");

                switch (department) {
                    case "IT" -> System.out.println("Department: IT");
                    case "HR" -> System.out.println("Department: HR");
                    case "SALES" -> System.out.println("Department: Sales");
                    default -> System.out.println("Invalid Department");
                }
            }
            case 2 -> System.out.println("Employee Name: Akhilesh H");
            case 3 -> System.out.println("Employee Name: Arun");
            default -> System.out.println("Invalid Employee Number");
        }

        input.close();
    }
}