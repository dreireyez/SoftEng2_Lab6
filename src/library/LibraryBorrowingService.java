package library;

public class LibraryBorrowingService implements BorrowingService {
    private final BorrowingRule borrowingRule;

    public LibraryBorrowingService(BorrowingRule borrowingRule) {
        this.borrowingRule = borrowingRule;
    }

    @Override
    public void borrowResource(Student student, LibraryResource resource) {
        if (!borrowingRule.canBorrow(student, resource)) {
            throw new IllegalStateException(borrowingRule.getDenialReason(student, resource));
        }

        resource.borrow(student.getName());
        student.addBorrowedResource(resource);
    }
}
