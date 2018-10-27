
package pkg3.additional;

public class Additional {

    public static void main(String[] args) {
        
        Director d1 = new Director();
        d1.setName("Evren Aykac");
        d1.display();
        System.out.println(d1.getName() + " " + d1.getInfo() + ", earns "+d1.earnings() + "$ per film");
        
        System.out.printf("\n");
        Director d2 = new Director("Steven Speilberg", 161, 17, "is well known with Schindler’s List and Saving Private Ryan");
        d2.display();
        System.out.println(d2.getName() + " " + d2.getInfo() + ", earns "+d2.earnings() + "$ per film");
    }
    
}
