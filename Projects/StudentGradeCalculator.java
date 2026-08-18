import java.util.Scanner;

class StudentGradeCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Student Grade Calculator ===");

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        int[] marks = new int[5];

        System.out.println("Enter marks for 5 subjects:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

        int total = 0;

        for (int i = 0; i < 5; i++) {
            total = total + marks[i];
        }

        System.out.println("\nHello, " + name + "!");
        System.out.println("Total Marks: " + total);

        sc.close();
    }
}