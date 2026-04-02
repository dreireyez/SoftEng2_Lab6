package library;

public class LibraryResourceFactory implements ResourceFactory {

    @Override
    public LibraryResource createResource(ResourceType type, String title) {
        switch (type) {
            case BOOK:
                return new Book(title);
            case JOURNAL:
                return new Journal(title);
            case THESIS:
                return new Thesis(title);
            case CAPSTONE:
                return new Capstone(title);
            case NEWSPAPER:
                return new Newspaper(title);
            case INTERNET_ACCESS:
                return new InternetAccess(title);
            case AUDIO_BOOK:
                return new AudioBook(title);
            case E_JOURNAL:
                return new EJournal(title);
            default:
                throw new IllegalArgumentException("Unsupported resource type: " + type);
        }
    }

    private static class Book extends AbstractLibraryResource {
        Book(String title) {
            super(title);
        }

        @Override
        public ResourceType getType() {
            return ResourceType.BOOK;
        }
    }

    private static class Journal extends AbstractLibraryResource {
        Journal(String title) {
            super(title);
        }

        @Override
        public ResourceType getType() {
            return ResourceType.JOURNAL;
        }
    }

    private static class Thesis extends AbstractLibraryResource {
        Thesis(String title) {
            super(title);
        }

        @Override
        public ResourceType getType() {
            return ResourceType.THESIS;
        }
    }

    private static class Capstone extends AbstractLibraryResource {
        Capstone(String title) {
            super(title);
        }

        @Override
        public ResourceType getType() {
            return ResourceType.CAPSTONE;
        }
    }

    private static class Newspaper extends AbstractLibraryResource {
        Newspaper(String title) {
            super(title);
        }

        @Override
        public ResourceType getType() {
            return ResourceType.NEWSPAPER;
        }
    }

    private static class InternetAccess extends AbstractLibraryResource {
        InternetAccess(String title) {
            super(title);
        }

        @Override
        public ResourceType getType() {
            return ResourceType.INTERNET_ACCESS;
        }

        @Override
        public String getDescription() {
            return String.format("%s (access portal): %s", getType(), getTitle());
        }
    }

    private static class AudioBook extends AbstractLibraryResource {
        AudioBook(String title) {
            super(title);
        }

        @Override
        public ResourceType getType() {
            return ResourceType.AUDIO_BOOK;
        }
    }

    private static class EJournal extends AbstractLibraryResource {
        EJournal(String title) {
            super(title);
        }

        @Override
        public ResourceType getType() {
            return ResourceType.E_JOURNAL;
        }
    }
}
