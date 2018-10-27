
package pkg3.pkg3;

public class Movie {
    private String title;
    private int year;
    private double rating;
    
    public Movie() {
       
    }
   
    public Movie(String title, int year, double rating) {
        this.title = title;
        this.year = year;
        this.rating = rating;
    }

    public Movie(String title, int year) {
        this.title = title;
        this.year = year;
    }

    public Movie(String title) {
        this.title = title;
    }
    
    public void display() {
        System.out.println(this.getTitle() + ", " + this.getYear() +  ", "  + this.getRating() +  " points");
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public double getRating() {
        return rating;
    }
    
    
}
