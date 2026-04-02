package library;

public interface ResourceFactory {
    LibraryResource createResource(ResourceType type, String title);
}
