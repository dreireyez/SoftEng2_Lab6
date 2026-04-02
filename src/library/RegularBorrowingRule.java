package library;

public class RegularBorrowingRule implements BorrowingRule {
    private final int maxBorrowedResources;

    public RegularBorrowingRule(int maxBorrowedResources) {
        this.maxBorrowedResources = maxBorrowedResources;
    }

    @Override
    public boolean canBorrow(Student student, LibraryResource resource) {
        if (resource.isBorrowed()) {
            return false;
        }
        if (student.getBorrowedResourcesCount() >= maxBorrowedResources) {
            return false;
        }
        return true;
    }

    @Override
    public String getDenialReason(Student student, LibraryResource resource) {
        if (resource.isBorrowed()) {
            return "Resource is already borrowed.";
        }
        if (student.getBorrowedResourcesCount() >= maxBorrowedResources) {
            return "Student has reached the maximum borrowed resource limit.";
        }
        return "Borrow request denied.";
    }
}
