import java.util.Scanner;

public class Student {
    private int studentId;
    private String firstName;
    private String middleName;
    private String lastName;
    private String suffix;
    private int age;
    private String yearLevel;
    private String phoneNumber;
    private String email;
    private String courseName;
    private String courseCode;
    private String departmentName;

    public Student(int studentId, String firstName, String middleName, String lastName, String suffix, int age,
                  String yearLevel, String phoneNumber, String email, String courseName, String courseCode, String departmentName) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.suffix = suffix;
        this.age = age;
        this.yearLevel = yearLevel;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.departmentName = departmentName;
    }

    public static Student createStudent() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter student ID number: ");
        int studentId = scanner.nextInt();

        System.out.println("Enter first name: ");
        String firstName = scanner.nextLine();

        System.out.println("Enter middle name: ");
        String middleName = scanner.nextLine();

        System.out.println("Enter last name: ");
        String lastName = scanner.nextLine();

        System.out.println("Enter suffix: ");
        String suffix = scanner.nextLine();

        System.out.println("Enter age: ");
        int age = scanner.nextInt();

        System.out.println("Enter year level: ");
        String yearLevel = scanner.nextLine();

        System.out.println("Enter phone number: ");
        String phoneNumber = scanner.nextLine();

        System.out.println("Enter email: ");
        String email = scanner.nextLine();

        System.out.println("Enter course name: ");
        String courseName = scanner.nextLine();

        System.out.println("Enter course code: ");
        String courseCode = scanner.nextLine();

        System.out.println("Enter department name: ");
        String departmentName = scanner.nextLine();

        return new Student(studentId, firstName, middleName, lastName, suffix, age, yearLevel, phoneNumber, email, courseName,
                courseCode, departmentName);
    }

    public void printStudentInfo() {
        System.out.println("Student ID No.: " + studentId);
        System.out.println("First Name: " + firstName);
        System.out.println("Middle Name: " + middleName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Suffix: " + suffix);
        System.out.println("Age: " + age);
        System.out.println("Year Level: " + yearLevel);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Email: " + email);
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Code: " + courseCode);
        System.out.println("Department Name: " + departmentName);
    }

    public static void main(String[] args) {
        Student student = createStudent();
        student.printStudentInfo();
    }
}