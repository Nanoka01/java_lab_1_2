package lab4;

class Book {
    public String title;
    public String author;
    public String publisher;
    public int yearPublished;
    public double price;
    public boolean isAvailable;

    // Method to print details
    public void printDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publisher: " + publisher);
        System.out.println("Year Published: " + yearPublished);
        System.out.println("Price: $" + price);
        System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
    }

    // Method to update the price
    public void updatePrice(double newPrice) {
        this.price = newPrice;
    }

    // Method to mark the book as unavailable
    public void markAsUnavailable() {
        this.isAvailable = false;
    }

    // Method to mark the book as available
    public void markAsAvailable() {
        this.isAvailable = true;
    }

    // Method to check if the book is published after a specific year
    public boolean isPublishedAfter(int year) {
        return this.yearPublished > year;
    }
}
