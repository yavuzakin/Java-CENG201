
package labguide4;


public class LuggageList {
    
    public static final int MAX_COUNT = 5;
    public static final int MAX_KILOS = 50;
    private static Luggage[] myLuggages = new Luggage[MAX_COUNT];
    private static int total_kilo = 0;
    private static int total_LuggageCount = 0;
    
    
    public static boolean addLuggage(Luggage l)
    {
        if(total_LuggageCount < MAX_COUNT && total_kilo < MAX_KILOS)
        {
            myLuggages[total_LuggageCount++] = l;
            total_kilo = l.getWeight_kilo();
            return true;
        }
        return false;
    }
    
    public static boolean removeLuggage(String ID)
    {
        for (int i = 0; i < total_LuggageCount; i++)
        {
            if(myLuggages[i].getLuggage_ID() == Integer.parseInt(ID))
            {
                System.out.println("The Luggage belonging to: " + myLuggages[i].getBelongsTo() + " is removed.");
                myLuggages[i] = myLuggages[total_LuggageCount - 1];
                myLuggages[total_LuggageCount - 1] = null;
                total_LuggageCount--;
                return true;
            }
        }
        return false;
    }
    
    public static Luggage getLuggage(String belongsTo)
    {
        for (int i = 0; i < total_LuggageCount; i++)
        {
            if(myLuggages[i].getBelongsTo().equalsIgnoreCase(belongsTo))
            {
                System.out.println("Here is the luggage you were looking for...");
                System.out.println(myLuggages[i].toString());
                return myLuggages[i];
            }
        }
        return null;
    }
    
    public static Luggage[] getAll()
    {
        return myLuggages;
    }
    
    public static Luggage getHighestCapacityLuggage()
    {
        int highestIndex = 0;
        for (int i = 0; i < total_LuggageCount; i++)
        {
            if(myLuggages[i].getCapacity_lt() > myLuggages[highestIndex].getCapacity_lt())
            {
                highestIndex = i;
                System.out.println("The luggage belonging to: " + myLuggages[highestIndex].getBelongsTo() + " has the highest capacity of " + myLuggages[highestIndex].getCapacity_lt());
            }
        }
        return myLuggages[highestIndex];
    }
    
    public static void display()
    {
        for (int i = 0; i < total_LuggageCount; i++)
        {
            System.out.println(myLuggages[i].toString());
        }
    }
}
