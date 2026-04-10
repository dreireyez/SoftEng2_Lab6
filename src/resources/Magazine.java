public class Magazine implements LibraryResource {
    private String title;

    public Magazine(String title) {
        this.title = title;
    }
    
    @Override
    public void borrow() {
        System.out.println("[Library System] Borrowing: " + title);
    }
    
}
