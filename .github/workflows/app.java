import java.util.Scanner;
public calss App {
    public static void main(String[] args) {
       int age;
       int Gpa;
       String fullName;
       String SerName;
       boolean isstudent;
       boolean isgraduated;
       int studentId;
      Scanner scanner = new Scanner(System.in);
      for (int i = 0; i < 3; i++) {
        System.out.println("Enter your full name:");
        fullName = scanner.nextLine();
        System.out.println("Enter your surname:");
        SerName = scanner.nextLine();
        System.out.println("Enter your student ID:");
        studentId = scanner.nextInt();
        System.out.println("Enter your age:");
        age = scanner.nextInt();
        System.out.println("Enter your GPA:");
        Gpa = scanner.nextInt();
        System.out.println("Are you a student? (true/false):");
        isstudent = scanner.nextBoolean();
        System.out.println("Have you graduated? (true/false):");
        isgraduated = scanner.nextBoolean();
        
        
        // Process the input data as needed
      }
    }
}
