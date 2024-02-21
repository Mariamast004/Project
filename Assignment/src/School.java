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
<<<<<<< HEAD
class  Student extends School{
    private ArrayList<Student> students;
    private Scanner scanner;

    public Student(){
=======
class  Student extends School {
    private ArrayList<Student> students;
    private Scanner scanner;

    public Student() {
>>>>>>> 4e3ac32 (Modify Project)
        students = new ArrayList<>();
        scanner = new Scanner(System.in);
    }


    private String studentName;
    private int studentId;
<<<<<<< HEAD
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
=======
    private String studentGender;
    private int age;
    private String presentAddress;
    private String permanentAddress;
    private String emergencyContact;

    public Student(String studentName, int studentId, String studentGender, int age, String presentAddress, String permanentAddress, String emergencyContact) {
        this.studentName = studentName;
        this.studentId = studentId;
        this.studentGender = studentGender;
        this.age = age;
        this.presentAddress = presentAddress;
        this.permanentAddress = permanentAddress;
        this.emergencyContact = emergencyContact;
    }

    @Override
    public void studentEnrollment() {
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        Scanner scan3 = new Scanner(System.in);
        Scanner scan4 = new Scanner(System.in);
        System.out.println("Enter Student Name: ");
        String studentName = scanner.nextLine();
        System.out.println("Enter Student Id: ");
        int studentId = scan1.nextInt();
        System.out.println("Enter Student Gender: ");
        String studentGender = scan2.nextLine();
        System.out.println("Enter Age: ");
        int age = scan3.nextInt();
        System.out.println("Enter Present Address: ");
        String presentAddress = scanner.nextLine();
        System.out.println("Enter PermanentAddress: ");
        String permanentAddress = scan4.nextLine();
        System.out.println("Enter EmergencyContact:");
        String emergencyContact = scan2.nextLine();
        scanner.nextLine();


        //  check if student already exists
        boolean isStudentExisting = false;
        for (Student student : students) {
            if (student.getStudentName().equalsIgnoreCase(studentName)) {
                isStudentExisting = true;
                break;
            }
        }
        if (isStudentExisting) {
            System.out.println("Student already Exist. Enrollment faild. ");
        } else {
            // create a new student object with the entered details.
            Student student = new Student(studentName, studentId, studentGender, age, presentAddress, permanentAddress, emergencyContact);
>>>>>>> 4e3ac32 (Modify Project)
            students.add(student);
            System.out.println("Student enrolled successfully! ");
        }

    }

<<<<<<< HEAD
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

=======


    // Method to Update Student Details
    public  void  updateStudentDetails() {
    if (students.isEmpty()){
        System.out.println("No Students Enrolled Yet");
        return;
    }
        System.out.print("Enter Id Number of Student to Update: ");
    int studentId = scanner.nextInt();

    int index = findStudentIndex(studentId);
    if (index == -1){
        System.out.println("Student not found. ");
        return;
    }

        System.out.println("Current Student Details: ");
        System.out.println("Student Name:" + students.get(index).getStudentName());
        System.out.println("Student Id: " + students.get(index).getStudentId());
        System.out.println("Student Gender:" + students.get(index).getStudentGender());
        System.out.println("Student Age: " + students.get(index).getAge());
        System.out.println("Enter PresentAddress: " + students.get(index).getPresentAddress());
        System.out.println("Enter Permanent Address: " + students.get(index).getPermanentAddress());
        System.out.println("Enter Emergency Contact: " + students.get(index).getEmergencyContact());
        System.out.println("\n");


        System.out.println("\nUpdate Student Details: ");
        System.out.print("Enter New Name(leave blank to keep unChanged): ");
        String newStudentName = scanner.nextLine();
        if (!newStudentName.isEmpty()){
            students.get(index).setStudentName(newStudentName);
        }


        System.out.println("\nUpdate Student Details: ");
        System.out.print("Enter New Name(leave blank to keep unChanged): ");
        String newStudentName1 = scanner.nextLine();
        if (!newStudentName1.isEmpty()){
            students.get(index).setStudentName(newStudentName1);
        }


        System.out.print("Enter New StudentId (leave 0 to keep UnChange): ");
        int newStudentId = scanner.nextInt();
        if (newStudentId != 0){
            students.get(index).setStudentId(newStudentId);
        }

        System.out.println("\nStudent Details Updated Successfully!");



    }

    public int findStudentIndex(int studentId) {
        for (int i = 0; i < students.size(); i++){
            if (students.get(i).getStudentId() == studentId){
                return i;
            }
        }
        return  -1;


    }

    // method to display all enrolled students
    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No Student Enrolled yet.");
        } else {
            System.out.println("Enroll Students: ");
            for (Student student : students) {
                System.out.println("Student Name : " + student.getStudentName());
                System.out.println("Student Id  : " + student.getStudentId());
                System.out.println("Student Gender: " + student.getStudentGender());
                System.out.println("Student Age: " + student.getAge());
                System.out.println("Enter PresentAddress: " + student.getPresentAddress());
                System.out.println("Enter Permanent Address: " + student.getPermanentAddress());
                System.out.println("Enter Emergency Contact: " + student.getEmergencyContact());
                System.out.println("\n");
            }
        }

    }






    public void removeStudents() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Student Name that you want to Remove: ");
        String studentName = scanner.nextLine();
        boolean removed = false;
        for (Student student : students){
            if (student.getStudentName().equalsIgnoreCase(studentName)){
                students.remove(student);
                System.out.println("--------------------------Student Removed Successfully!-----------------------");
                removed = true;
                break;
            }
        }
        if (!removed){
            System.out.println("Student not found.");
        }
        System.out.println("\n");


    }



>>>>>>> 4e3ac32 (Modify Project)



    public String getStudentName() {
        return studentName;
    }

<<<<<<< HEAD
=======
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

>>>>>>> 4e3ac32 (Modify Project)
    public int getStudentId() {
        return studentId;
    }

<<<<<<< HEAD
=======
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setStudentGender(String studentGender) {
        this.studentGender = studentGender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPresentAddress(String presentAddress) {
        this.presentAddress = presentAddress;
    }

    public void setPermanentAddress(String permanentAddress) {
        this.permanentAddress = permanentAddress;
    }

    public void setEmergencyContact(String emergencyContact) {
        this.emergencyContact = emergencyContact;
    }

>>>>>>> 4e3ac32 (Modify Project)
    public String getStudentGender() {
        return studentGender;
    }

<<<<<<< HEAD

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
=======
    public int getAge() {
        return age;
    }

    public String getPresentAddress() {
        return presentAddress;
    }

    public String getPermanentAddress() {
        return permanentAddress;
    }

    public String getEmergencyContact() {
        return emergencyContact;
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
        private int staffEnrollNo;
        private int staffContact;
        private String staffPosition;


        public Staff(String staffName,int staffEnrollNo, int staffContact, String staffPosition) {
            this.staffName = staffName;
            this.staffEnrollNo = staffEnrollNo;
            this.staffContact = staffContact;
            this.staffPosition = staffPosition;
        }


        public String getStaffName() {
            return staffName;
        }

        public void setStaffName() {
            this.staffName = staffName;
        }

        public int getStaffEnrollNo() {
            return staffEnrollNo;
        }

        public void setStaffEnrollNo(int staffEnrollNo) {
            this.staffEnrollNo = staffEnrollNo;
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
            Scanner scan1 = new Scanner(System.in);
            Scanner scan2 = new Scanner(System.in);
            Scanner scan3 = new Scanner(System.in);
            System.out.println("Enter Staff Name: ");
            String staffName = scanner.nextLine();
            System.out.println("Enter Staff EnrollNo: ");
            int staffEnrollNo = scan3.nextInt();
            System.out.println("Enter Staff Contact: ");
            int staffContact = scan1.nextInt();
            System.out.println("Enter StaffPosition : ");
            String staffPosition = scan2.nextLine();
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
                Staff staff = new Staff(staffName, staffEnrollNo, staffContact, staffPosition);
                staffs.add(staff);
                System.out.println("--------------------------------Staff enrolled successfully!---------------------------- ");
            }

        }


        // Object to Display all the Staff Enrolled
        public void displayStaffs() {
            if (staffs.isEmpty()) {
                System.out.println("No Staff enrolled yet.");
            } else {
                System.out.println("Enroll Staffs: ");

                for (Staff staff : staffs) {
                    System.out.println("Name: " + staff.getStaffName());
                    System.out.println("StaffEnrollNo: " + staff.getStaffEnrollNo());
                    System.out.println("Staff Contact: " + staff.getStaffContact());
                    System.out.println("Staff Position: " + staff.getStaffPosition());
                }
            }
            System.out.println("\n");


        }


        public void removeStaffs() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter Staff name that You want to Remove: ");
            String staffName = scanner.nextLine();

            boolean removed = false;
            for (Staff staff : staffs) {
                if (staff.getStaffName().equalsIgnoreCase(staffName)) {
                    staffs.remove(staff);
                    System.out.println("--------------------Staff Removed Successfully!-------------------------");
                    removed = true;
                    break;
                }
            }
            if (!removed) {
                System.out.println("Staff not found.");
            }


        }


        public int findStaffIndex(int staffEnrollNo) {
            for (int i = 0; i < staffs.size(); i++) {
                if (staffs.get(i).getStaffEnrollNo() == staffEnrollNo) {
                    return i;
                }
            }
            return -1;


        }


        public void updateStaffDetails() {
            if (staffs.isEmpty()) {
                System.out.println("No Staff Enrolled Yet. ");
                return;
            }
            System.out.println("Enter StaffEnrollNo to Update: ");
            int staffEnrollNo = scanner.nextInt();

            int index = findStaffIndex(staffEnrollNo);
            if (index == -1) {
                System.out.println("Staff not found. ");
                return;


            }
            System.out.println("Current Staff Details: ");
            System.out.println("StaffName: " + staffs.get(index).getStaffName());
            System.out.println("StaffEnrollNo: " + staffs.get(index).getStaffEnrollNo());
            System.out.println("Staff Contact: " + staffs.get(index).getStaffContact());
            System.out.println("Staff Position: " + staffs.get(index).getStaffPosition());
            System.out.println("\n");



            System.out.println("\nUpdate Staff Details: ");
            System.out.println("Enter Staff Position (leave blank to keep unChange): ");
            String newStaffPosition = scanner.nextLine();
            if (!newStaffPosition.isEmpty()){
                staffs.get(index).setStaffPosition(newStaffPosition);
            }



            System.out.println("\nUpdate Staff Details: ");
            System.out.println("Enter Staff Position (leave blank to keep unChange): ");
            String newStaffPosition1 = scanner.nextLine();
            if (!newStaffPosition1.isEmpty()){
                staffs.get(index).setStaffPosition(newStaffPosition1);
            }



            System.out.println("Enter Staff EnrollNo (leave 0 to keep unChange): ");
            int newStaffEnrollNo = scanner.nextInt();
            if (newStaffEnrollNo != 0){
                staffs.get(index).setStaffEnrollNo(newStaffEnrollNo);
            }




            System.out.println("-----------------Staff Updated Successfully!-------------------");
>>>>>>> 4e3ac32 (Modify Project)


        }

    }












