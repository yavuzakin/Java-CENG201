
package labguide4;


public class Luggage {
    
    private int luggage_ID;
    private String belongsTo;
    private int weight_kilo;
    private double capacity_lt;
    private static int lastUsedId = 500;

    public Luggage(String belongsTo, int weight_kilo, double capacity_lt) {
        this.belongsTo = belongsTo;
        this.weight_kilo = weight_kilo;
        this.capacity_lt = capacity_lt;
        this.luggage_ID = lastUsedId++;
    }

    public int getLuggage_ID() {
        return luggage_ID;
    }

    public String getBelongsTo() {
        return belongsTo;
    }

    public int getWeight_kilo() {
        return weight_kilo;
    }

    public double getCapacity_lt() {
        return capacity_lt;
    }

    @Override
    public String toString() {
        return "Luggage ID : " + luggage_ID + "\nBelongs to : " + belongsTo + "\nWeight of the Luggage : " + weight_kilo + "\nCapacity of the Luggage :" + capacity_lt + " liters";
    }   
    
}
