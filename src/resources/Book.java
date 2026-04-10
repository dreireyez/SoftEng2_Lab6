public class Book implements LibraryResource {
    private String title;

    public Book(String title) {
        this.title = title;
    }
    
    @Override
    public void borrow() {
        System.out.println("[Library System] Borrowing: " + title);
    }
}