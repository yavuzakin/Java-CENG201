
package pkg3.pkg1;


public class Book {
    private String title;
    private int publishYear;
    private double price;
    
    Book() {
        this.title = "NoBookTitle";
        this.publishYear = 0;
        this.price = 0.0;
    }

    public Book(String title, int publishYear, double price) {
        this.title = title;
        this.publishYear = publishYear;
        this.price = price;
    }

    public Book(String title, int publishYear) {
        this.title = title;
        this.publishYear = publishYear;
    }

    public Book(String title) {
        this.title = title;
    }
   
    public void display()
    {
        System.out.println(this.getTitle() + ", " + this.getPublishYear() +  ", "  + this.getPrice() +  " TL");
    }
    public String getTitle() {
        return title;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public double getPrice() {
        return price;
    }
    
}
