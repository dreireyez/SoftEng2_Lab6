package library;

public abstract class AbstractLibraryResource implements LibraryResource {
    private final String title;
    private String borrower;

    protected AbstractLibraryResource(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public boolean isBorrowed() {
        return borrower != null;
    }

    @Override
    public String getBorrower() {
        return borrower;
    }

    @Override
    public void borrow(String borrower) {
        if (isBorrowed()) {
            throw new IllegalStateException("Resource is already borrowed by " + this.borrower);
        }
        this.borrower = borrower;
    }

    @Override
    public void returnResource() {
        borrower = null;
    }

    @Override
    public String getDescription() {
        return String.format("%s: %s", getType(), getTitle());
    }
}
