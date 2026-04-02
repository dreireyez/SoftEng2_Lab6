package library;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student {
    private final String name;
    private final BorrowingService borrowingService;
    private final List<LibraryResource> borrowedResources;

    public Student(String name, BorrowingService borrowingService) {
        this.name = name;
        this.borrowingService = borrowingService;
        this.borrowedResources = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    void addBorrowedResource(LibraryResource resource) {
        borrowedResources.add(resource);
    }

    public int getBorrowedResourcesCount() {
        return borrowedResources.size();
    }

    public List<LibraryResource> getBorrowedResources() {
        return Collections.unmodifiableList(borrowedResources);
    }

    public void borrow(LibraryResource resource) {
        borrowingService.borrowResource(this, resource);
    }

    public void returnResource(LibraryResource resource) {
        if (borrowedResources.remove(resource)) {
            resource.returnResource();
        }
    }
}
