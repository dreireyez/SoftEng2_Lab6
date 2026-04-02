package library;

public class TestProgram {
    public static void main(String[] args) {
        ResourceFactory factory = new LibraryResourceFactory();
        BorrowingRule rule = new RegularBorrowingRule(5);
        BorrowingService borrowingService = new LibraryBorrowingService(rule);

        Student student = new Student("Jordan Reyes", borrowingService);

        LibraryResource book = factory.createResource(ResourceType.BOOK, "Design Patterns in Java");
        LibraryResource journal = factory.createResource(ResourceType.JOURNAL, "Software Engineering Review");
        LibraryResource thesis = factory.createResource(ResourceType.THESIS, "AI-Assisted Learning Systems");
        LibraryResource capstone = factory.createResource(ResourceType.CAPSTONE, "Smart Campus Integration");
        LibraryResource newspaper = factory.createResource(ResourceType.NEWSPAPER, "Campus Chronicle");
        LibraryResource internetAccess = factory.createResource(ResourceType.INTERNET_ACCESS, "NEU Research Portal");
        LibraryResource audioBook = factory.createResource(ResourceType.AUDIO_BOOK, "Clean Code Audio Edition");
        LibraryResource eJournal = factory.createResource(ResourceType.E_JOURNAL, "Digital Library Quarterly");

        borrowResource(student, book);
        borrowResource(student, journal);
        borrowResource(student, thesis);
        borrowResource(student, capstone);
        borrowResource(student, newspaper);

        System.out.println();
        System.out.println("Borrowed resources for " + student.getName() + ":");
        student.getBorrowedResources().forEach(resource ->
            System.out.println("- " + resource.getDescription() + " by " + resource.getBorrower())
        );

        System.out.println();
        System.out.println("Attempting to borrow an already borrowed resource...");
        try {
            student.borrow(book);
        } catch (IllegalStateException exception) {
            System.out.println("Expected failure: " + exception.getMessage());
        }

        System.out.println();
        System.out.println("Attempting to borrow more than allowed resources...");
        borrowResource(student, internetAccess);
        borrowResource(student, audioBook);
        try {
            student.borrow(eJournal);
        } catch (IllegalStateException exception) {
            System.out.println("Expected failure: " + exception.getMessage());
        }
    }

    private static void borrowResource(Student student, LibraryResource resource) {
        try {
            student.borrow(resource);
            System.out.println("Borrowed " + resource.getDescription());
        } catch (IllegalStateException exception) {
            System.out.println("Failed to borrow " + resource.getDescription() + ": " + exception.getMessage());
        }
    }
}
