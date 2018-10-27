
package pkg3.pkg1;

public class Main {

    public static void main(String[] args) {
         Book b1 = new Book();
         b1.display();
         
         Book b2 = new Book("The Java Tutorial");
         Book b3 = new Book("Accounting Principles", 2005, 135.8);
         Book b4 = new Book("Algorithms in C", 2008, 45.5);
         
         b2.display();
         b3.display();
         b4.display();
         
    }
    
}
