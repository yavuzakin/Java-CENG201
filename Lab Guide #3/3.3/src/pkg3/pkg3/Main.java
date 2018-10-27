
package pkg3.pkg3;


public class Main {

    public static void main(String[] args) {
        Movie m = new Movie();
        
        Movie m1 = new Movie("La La Land", 2016, 8.5);
        Movie m2 = new Movie("The Godfather" , 1972, 9.2);
        Movie m3 = new Movie();
        Movie m4 = new Movie("Night on Earth", 1991);
        
        System.out.println("***************");
        System.out.println("Movies' Info");
        m1.display();
        m2.display();
        m3.display();
        m4.display();
    }
    
}
