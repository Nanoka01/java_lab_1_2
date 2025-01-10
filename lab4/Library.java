package lab4;


class Library {
    public String libraryName;
    public Book book1;
    public Book book2;
    public Book book3;

    // Constructor
    public Library(String libraryName) {
        this.libraryName = libraryName;
    }

    // Add book to a specific slot
    public void addBook(Book book, int slot) {
        if (slot == 1) book1 = book;
        else if (slot == 2) book2 = book;
        else if (slot == 3) book3 = book;
    }

    // Remove book from a specific slot
    public void removeBook(int slot) {
        if (slot == 1) book1 = null;
        else if (slot == 2) book2 = null;
        else if (slot == 3) book3 = null;
    }

    // Print library details
    public void printLibraryDetails() {
        System.out.println("Library: " + libraryName);
        if (book1 != null) {
            System.out.println("Book in slot 1:");
            book1.printDetails();
        } else {
            System.out.println("No book in slot 1.");
        }
        if (book2 != null) {
            System.out.println("Book in slot 2:");
            book2.printDetails();
        } else {
            System.out.println("No book in slot 2.");
        }
        if (book3 != null) {
            System.out.println("Book in slot 3:");
            book3.printDetails();
        } else {
            System.out.println("No book in slot 3.");
        }
    }

    // Check book availability
    public void checkBookAvailability(int slot) {
        Book book = null;
        if (slot == 1) book = book1;
        else if (slot == 2) book = book2;
        else if (slot == 3) book = book3;

        if (book != null && book.isAvailable) {
            System.out.println("Book in slot " + slot + " is available.");
        } else {
            System.out.println("Book in slot " + slot + " is not available.");
        }
    }

    // Update book price
    public void updateBookPrice(int slot, double newPrice) {
        Book book = null;
        if (slot == 1) book = book1;
        else if (slot == 2) book = book2;
        else if (slot == 3) book = book3;

        if (book != null) {
            book.updatePrice(newPrice);
            System.out.println("Updated price of " + book.title + " in slot " + slot + " to $" + newPrice);
        } else {
            System.out.println("No book in this slot.");
        }
    }

    // Print book details in a slot
    public void printBookDetails(Book book) {
        if (book != null) {
            book.printDetails();
        } else {
            System.out.println("No book in this slot.");
        }
    }
}