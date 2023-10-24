public class Student {
    public static void main(String[] args) {
        // Student's Bio Information
        String firstName = "Cedric";
        String middleName = "Justin";
        String lastName = "Alcoseba";
        String suffix = "None";

        // Displaying the Student's Bio Information
        System.out.println("First Name: " + firstName);
        System.out.println("Middle Name: " + middleName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Suffix: " + suffix);

        // Generating and displaying the Full Name
        String fullName = firstName + " " + middleName + " " + lastName;
        System.out.println("Full Name: " + fullName);
    }
}