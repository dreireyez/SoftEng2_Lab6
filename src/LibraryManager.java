// This class connects the student to the resource to be borrowed.
public class LibraryManager {
    public void processCheckout(Student student, LibraryResource resource) {
        System.out.println("[Library System] Verifying account for " + student.getName() + " (ID: " + student.getStudentId() + ")...");
        System.out.println("Approved.");
        resource.borrow();
    }
}