import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
<<<<<<< HEAD


=======
>>>>>>> 4e3ac32 (Modify Project)
public class Main {




        public static void main(String[] args) {
            Student student = new Student();
            Scanner scanner = new Scanner(System.in);
<<<<<<< HEAD
=======
            System.out.println("-------------------------Student Enrollment Form---------------------");
>>>>>>> 4e3ac32 (Modify Project)

            boolean continueOperation = true;
            while (continueOperation){
                System.out.println("Choose an operation: ");
<<<<<<< HEAD
                System.out.println("1. Enroll Student ");
                System.out.println("2. Display Students");
                System.out.println("3. Exit");
=======
                System.out.println("--------------------");
                System.out.println("1. Enroll Student ");
                System.out.println("2. Display Students");
                System.out.println("3. Removed Student.");
                System.out.println("4. Update Student Details.");
                System.out.println("5. Exit");
>>>>>>> 4e3ac32 (Modify Project)
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice){
                    case 1:
                        student.studentEnrollment();
                        break;

                    case 2:
                        student.displayStudents();
<<<<<<< HEAD
                        break;

                    case 3:
=======
                        System.out.println("-------------------------Thank you---------------------");
                        break;

                    case 3:
                        student.removeStudents();
                        System.out.println("-------------------------T---------------------");
                        break;

                    case 4:
                        student.updateStudentDetails();
                        System.out.println("------------------------------");
                        break;

                    case 5:
>>>>>>> 4e3ac32 (Modify Project)
                        continueOperation = false;
                        break;

                    default:
                        System.out.println("Invalid Choice. Please enter a valid option.");
                }

            }



////Staff Enrollment Form.
            Staff staff = new Staff();
            Scanner scanner2 = new Scanner(System.in);
<<<<<<< HEAD
=======
            System.out.println("------------------------------Staff Enrollment Form-------------------------------");
            System.out.println();

>>>>>>> 4e3ac32 (Modify Project)

            boolean continueOperation1 = true;
            while (continueOperation1){
                System.out.println("Choose an operation: ");
                System.out.println("1. Enroll Staff ");
                System.out.println("2. Display Staff");
<<<<<<< HEAD
                System.out.println("3. Exit");
=======
                System.out.println("3. Remove Staff");
                System.out.println("4. Update Staff Details");
                System.out.println("5. Exit");
>>>>>>> 4e3ac32 (Modify Project)
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice){
                    case 1:
                        staff.staffEnrollmentForm();
<<<<<<< HEAD
=======
                        System.out.println("---------------------------");
>>>>>>> 4e3ac32 (Modify Project)
                        break;

                    case 2:
                        staff.displayStaffs();
<<<<<<< HEAD
                        break;

                    case 3:
                        continueOperation1 = false;
=======
                        System.out.println("--------------------------");
                        break;

                    case 3 :
                        staff.removeStaffs();
                        System.out.println("-------------------------------");
                        break;

                    case 4 :
                        staff.updateStaffDetails();
                        System.out.println("---------------------------------------");
                        break;


                    case 5:
                        continueOperation1 = false;
                        System.out.println("-------------------");
>>>>>>> 4e3ac32 (Modify Project)
                        break;

                    default:
                        System.out.println("Invalid Choice. Please enter a valid option.");
                }

            }
            scanner.close();




        }
}
