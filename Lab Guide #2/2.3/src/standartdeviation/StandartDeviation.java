/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package standartdeviation;

/**
 *
 * @author yavuz
 */
public class StandartDeviation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arr = {2, 10, 89, 37, 6, 12, 45, 4, 68, 8, 12};
        int sum = 0;
        double temp = 0d;
        double avrg;
        double standardDeviation;
        System.out.println("Orjinal Array");
        for(int i = 0 ; i < arr.length ; i++)
        {
            System.out.printf("%d ", arr[i]);
            sum += arr[i];
        }
        
        java.util.Arrays.sort(arr);
        
        System.out.println("Sorted Array");
        for(int i = 0 ; i < arr.length ; i++)
            System.out.printf("%d ", arr[i]);
        
        avrg = (double)sum / arr.length;
        for(int i = 0 ; i < arr.length ; i++)
        {
            temp += Math.pow((arr[i] - avrg), 2.0);
        }
        
        standardDeviation = Math.sqrt(temp/arr.length);
        
        System.out.println("\nStandard Deviation is " + standardDeviation);
        
    }
    
}
