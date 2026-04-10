public class TestProgram {
    public static void main(String[] args) {
        Student student = new Student("Djem Andreif Reyes", "23-13151-846");
        LibraryResource cleanCode = new Book("Clean Code");
        LibraryResource aiJournal = new Journal("AI Research Journal Vol. 5");
        LibraryResource techMagazine = new Magazine("Tech Monthly - September Edition");
        
        LibraryManager library = new LibraryManager();
        library.processCheckout(student, cleanCode);
        library.processCheckout(student, aiJournal);
        library.processCheckout(student, techMagazine);
    }
}