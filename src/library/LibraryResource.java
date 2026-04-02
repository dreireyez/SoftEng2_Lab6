package library;

public interface LibraryResource {
    String getTitle();
    ResourceType getType();
    boolean isBorrowed();
    String getBorrower();
    void borrow(String borrower);
    void returnResource();
    String getDescription();
}
