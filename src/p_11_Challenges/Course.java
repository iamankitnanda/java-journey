public class Course {
    static int maxCapacity = 100;
    String courseName;
    int enrollments;

    Course(String courseName) {
        this.courseName = courseName;
        this.enrollments = 0;
    }

    String[] enrolledStudents = new String[maxCapacity];

    static void setMaxCapacity(int maxCapacity) {
        Course.maxCapacity = maxCapacity;
    }

    void enrollStudent(String studentName) {
        enrolledStudents[enrollments] = studentName;
        enrollments++;
    }

    void unenrollStudent(String studentName) {
        System.out.println("Student removed");
        enrollments--;
    }

    // Main method for testing
    public static void main(String[] args) {
        // Create course object
        Course javaCourse = new Course("Java Programming");

        // Enroll students
        javaCourse.enrollStudent("Ankit");
        javaCourse.enrollStudent("Rohan");

        // Unenroll a student
        javaCourse.unenrollStudent("Rohan");

        // Display enrollments count
        System.out.println("Total enrollments in " + javaCourse.courseName + ": " + javaCourse.enrollments);
    }
}



