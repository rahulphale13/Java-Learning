import java.util.Scanner;

class StudentGradeCalculator {
     public static void main (String[] args){
         Scanner sc = new Scanner(System.in);

         System.out.println("=== Student Grade Calculator ===");

         System.out.println("Enter Student Name: ");
         String name = sc.nextLine();

         System.out.println("Hello, "+name + "!");

         sc.close();
         

     }
}