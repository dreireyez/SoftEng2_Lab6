// This implementation of the Student class focuses only on student data. 
// Borrowing resources is handled by a separate class linking the student to the resource to be borrowed. 
public class Student {
    private String name;
    private String studentId;

    // Constructor
    public Student(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getStudentId() {
        return studentId;
    }

    // Setters are not used because a constructor has already been implemented.
}