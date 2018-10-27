
package pkg3.additional;


public class Director {
    private String name;
    private int numberOfFilms;
    private int oscars;
    private String info;
    
    public Director() {
        this.name = "Alejandro González Iñárritu";
        this.numberOfFilms = 16;
        this.oscars = 7;
        this.info = "is well known with the movies like: Birdman, The Revenant";
    }

    public Director(String name, int numberOfFilms, int oscars, String info) {
        this.name = name;
        this.numberOfFilms = numberOfFilms;
        this.oscars = oscars;
        this.info = info;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfFilms() {
        return numberOfFilms;
    }

    public int getOscars() {
        return oscars;
    }

    public String getInfo() {
        return info;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void display() {
        System.out.println("Director Information");
        System.out.println("--------------------");
        System.out.println("Name : " + this.getName());
        System.out.println("Number of Films : " + this.getNumberOfFilms());
        System.out.println("Oscar Wins and Nominees : " + this.getOscars());
    }
    
    public int earnings() {
        if((this.getNumberOfFilms() / this.getOscars()) < 5)
            return 10000000;
        else if((this.getNumberOfFilms() / this.getOscars()) >= 5 && (this.getNumberOfFilms() / this.getOscars()) <10 )
            return 5000000;
        else if((this.getNumberOfFilms() / this.getOscars()) >= 10 && (this.getNumberOfFilms() / this.getOscars()) <15)
            return 1000000;
        else
            return 500000;
    }
}
