package library;

public interface BorrowingRule {
    boolean canBorrow(Student student, LibraryResource resource);
    String getDenialReason(Student student, LibraryResource resource);
}
