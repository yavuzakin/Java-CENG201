package labguide4;

import java.util.Scanner;

public class Cargo {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String x;
        int y;
        String z;
        double capacity;
        
        for (int i = 0; i < 5; i++)
        {
            System.out.println("Luggage no."  + (i+1) + ":");
            System.out.println("Belongs to : ");
            x = sc.nextLine();
            System.out.println("Enter weight in kilos : ");
            y = sc.nextInt();
            z = sc.nextLine();
            System.out.println("Enter capacity like Width:Height:Length");
            z = sc.nextLine();
            String[] full = z.split(":");
            capacity = 1;
            for (int j = 0; j < 3; j++)
            {
                capacity *= Double.parseDouble(full[j]);
            }
            
            Luggage l = new Luggage(x, y, capacity / 1000);
            
            if(LuggageList.addLuggage(l))
            {
                System.out.println("The luggage belonging to: " + l.getBelongsTo() + " is added to the list.");
            }
            else
            {
                System.out.println("Error: Max size of (kilo or/and count) is reached! Cannot add any more luggage!");
            }
        }
        
        System.out.println("---------------------------------------");
        System.out.println("Here is a list of the luggages (using toString() method of list object)...");
        LuggageList.display();
        
        System.out.println("---------------------------------------");
        System.out.println("Which luggage would you like to delete?");
        System.out.println("Enter an ID:");
        x = sc.nextLine();
        LuggageList.removeLuggage(x);
        LuggageList.display();
        
        System.out.println("---------------------------------------");
        System.out.println("Whose luggage would you like to search?");
        x = sc.nextLine();
        LuggageList.getLuggage(x);
        
        System.out.println("---------------------------------------");
        LuggageList.getHighestCapacityLuggage();
   
    }
    
}
