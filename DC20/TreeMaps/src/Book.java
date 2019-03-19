public class Book {
    private int ID;
    private String name;
    private String author;
    private String publisher;
    private double price;

    Book (int ID, String name, String author, String publisher, double price){
        this.ID = ID;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
    }

    //The treemap will use what is returned in the toString to print by default.
    @Override
    public String toString() {
        return "'"+ name +"' by: " + author + "\n";
    }

    public int getID() {
        return ID;
    }

    public double getPrice() {
        return price;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public String getPublisher() {
        return publisher;
    }

}
