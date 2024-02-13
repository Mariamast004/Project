import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Main {




        public static void main(String[] args) {
            Student student = new Student();
            Scanner scanner = new Scanner(System.in);

            boolean continueOperation = true;
            while (continueOperation){
                System.out.println("Choose an operation: ");
                System.out.println("1. Enroll Student ");
                System.out.println("2. Display Students");
                System.out.println("3. Exit");
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice){
                    case 1:
                        student.studentEnrollment();
                        break;

                    case 2:
                        student.displayStudents();
                        break;

                    case 3:
                        continueOperation = false;
                        break;

                    default:
                        System.out.println("Invalid Choice. Please enter a valid option.");
                }

            }



////Staff Enrollment Form.
            Staff staff = new Staff();
            Scanner scanner2 = new Scanner(System.in);

            boolean continueOperation1 = true;
            while (continueOperation1){
                System.out.println("Choose an operation: ");
                System.out.println("1. Enroll Staff ");
                System.out.println("2. Display Staff");
                System.out.println("3. Exit");
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice){
                    case 1:
                        staff.staffEnrollmentForm();
                        break;

                    case 2:
                        staff.displayStaffs();
                        break;

                    case 3:
                        continueOperation1 = false;
                        break;

                    default:
                        System.out.println("Invalid Choice. Please enter a valid option.");
                }

            }
            scanner.close();




        }
}
