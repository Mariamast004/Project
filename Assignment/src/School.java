import java.util.ArrayList;
import java.util.Scanner;

public class School {
    private String schoolName;
    private String schoolAddress;
    private String schoolType;


    public School() {
    }

    public School(String schoolName, String schoolAddress, String schoolType) {
        this.schoolName = schoolName;
        this.schoolAddress = schoolAddress;
        this.schoolType = schoolType;
    }

    public void studentEnrollment (){

    }

    public void staffEnrollmentForm(){


    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSchoolAddress() {
        return schoolAddress;
    }

    public void setSchoolAddress(String schoolAddress) {
        this.schoolAddress = schoolAddress;
    }

    public String getSchoolType() {
        return schoolType;
    }

    public void setSchoolType(String schoolType) {
        this.schoolType = schoolType;
    }




}
class  Student extends School{
    private ArrayList<Student> students;
    private Scanner scanner;

    public Student(){
        students = new ArrayList<>();
        scanner = new Scanner(System.in);
    }


    private String studentName;
    private int studentId;
    private  String studentGender;


    public Student(ArrayList<Student> students, Scanner scanner, String studentName, int studentId, String studentGender) {
        this.students = students;
        this.scanner = scanner;
        this.studentName = studentName;
        this.studentId = studentId;
        this.studentGender = studentGender;
    }

    public Student(String studentName, int studentId, String studentGender){
        this.studentName = studentName;
        this.studentId = studentId;
        this.studentGender = studentGender;
    }

    @Override
    public void studentEnrollment(){
        System.out.println("Eneter Student Name: ");
        String studentName = scanner.nextLine();
        System.out.println("Enter Student Id: ");
        int studentId = scanner.nextInt();
        System.out.println("Enter Student Gender: ");
        String studentGender = scanner.nextLine();
        scanner.nextLine();

      //  check if student already exists
        boolean isStudentExisting = false;
        for (Student student : students){
            if (student.getStudentName().equalsIgnoreCase(studentName)){
                isStudentExisting = true;
                break;
            }
            }
        if (isStudentExisting){
            System.out.println("Student already Exist. Enrollment faild. ");
        }
        else {
            // create a new student object with the entered details.
            Student student = new Student(studentName, studentId, studentGender);
            students.add(student);
            System.out.println("Student enrolled successfully! ");
        }

    }

    // method to display all enrolled students
    public void displayStudents(){
        if (students.isEmpty()){
            System.out.println("No Student enrolled yet.");
        }
        else {
            System.out.println("Enroll Students: ");
            for (Student student : students){
                System.out.println("Name: " + student.getStudentName() + ", StudentId: " + student.getStudentId() + ", StudentGender: " + student.getStudentGender());
            }
        }
    }




    public String getStudentName() {
        return studentName;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentGender() {
        return studentGender;
    }


}

class Staff extends School {
    private ArrayList<Staff> staffs;
    private Scanner scanner;

    public Staff() {
        staffs = new ArrayList<>();
        scanner = new Scanner(System.in);
    }


    private String staffName;
    private int staffContact;
    private String staffPosition;


    public Staff(String staffName, int staffContact, String staffPosition) {
        this.staffName = staffName;
        this.staffContact = staffContact;
        this.staffPosition = staffPosition;
    }


    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public int getStaffContact() {
        return staffContact;
    }

    public void setStaffContact(int staffContact) {
        this.staffContact = staffContact;
    }

    public String getStaffPosition() {
        return staffPosition;
    }

    public void setStaffPosition(String staffPosition) {
        this.staffPosition = staffPosition;
    }

    @Override
    public void staffEnrollmentForm() {
        System.out.println("Enter Staff Name: ");
        String staffName = scanner.nextLine();

        System.out.println("Enter Staff Contact: ");
        int staffContact = scanner.nextInt();

        System.out.println("Enter StaffPosition Gender: ");
        String staffPosition = scanner.nextLine();
        scanner.nextLine();

        //  check if staff already exists
        boolean isStaffExisting = false;
        for (Staff staff : staffs) {
            if (staff.getStaffName().equalsIgnoreCase(staffName)) {
                isStaffExisting = true;
                break;
            }
        }
        if (isStaffExisting) {
            System.out.println("Staff already Exist. Enrollment faild. ");
        } else {
            // create a new student object with the entered details.
            Staff staff = new Staff(staffName, staffContact, staffPosition);
            staffs.add(staff);
            System.out.println("Staff enrolled successfully! ");
        }

    }


// Object to Display all the Staff Enrolled
    public void displayStaffs() {
        if (staffs.isEmpty()) {
                System.out.println("No Staff enrolled yet.");
            } else {
                System.out.println("Enroll Staffs: ");
                for (Staff staff : staffs) {
                    System.out.println("Name: " + staff.getStaffName() + ", StaffContact : " + staff.getStaffContact() + ", Staff Position : " + staff.getStaffPosition());
                }
            }


        }

    }












