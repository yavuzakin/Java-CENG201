/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evenodd;

import java.util.Scanner;

/**
 *
 * @author yavuz
 */
public class EvenOdd {

    static void displayOdd(int[] arr, int odd_size)
    {
       
       System.out.println("Odd Numbers");
       for(int i = 0 ; i < odd_size ; i++)
       {
          if(arr[i] % 2 == 1)
            System.out.println(""+ arr[i]);
       }
    }
    
    static void displayEven(int[] arr, int even_size)
    {
       System.out.println("Even Numbers");
       for(int i = 0 ; i < even_size ; i++)
       {
           if(arr[i] % 2 == 0)
            System.out.println(""+ arr[i]);
       }
        
    }
    
    static int max_odd(int[] arr_odd, int odd_size)
    {
       int max = arr_odd[0];
       for(int i = 1 ; i < odd_size ; i++)
       {
            if(max < arr_odd[i])
            {
                max = arr_odd[i];
            }
       }
       return max;
    }
    
    static int max_even(int[] arr_even, int even_size)
    {
       int max = arr_even[0];
       for(int i = 0 ; i < even_size ; i++)
       {
            if(max < arr_even[i])
            {
                max = arr_even[i];
            }
       }
       return max;
    }
    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int number;
       int i = 0;
       int[] arr = new int[10];
       
       System.out.println("Enter number (to stop enter -1)");
       number = sc.nextInt();
       while(number != -1)
       {
           arr[i] = number;
           i++;
           number = sc.nextInt();
       }
       int[] arr_odd = new int[10]; 
       int[] arr_even = new int[10];
       int odd_size = 0;
       int even_size = 0;
       for(int j = 0 ; j < i ; j++)
       {
           if(arr[j] % 2 == 1)
               arr_odd[odd_size++] = arr[j];
           else if(arr[j] % 2 == 0)
               arr_even[even_size++] = arr[j];
       }
       
       displayEven(arr_even, even_size);
       displayOdd(arr_odd, odd_size);
       
       int sum = 0;
       double avrg;
       for(int k = 0 ; k < i ; k++)
         sum += arr[k];
     
       avrg = ((double)sum / i);
       
   
        System.out.println("The sum of numbers is " + sum);
        System.out.println("The average of numbers is " + avrg);
        System.out.println("The maximum of the odd numbers: " + max_odd(arr_odd, odd_size));
        System.out.println("The maximum of the even numbers: " + max_even(arr_even, even_size));
        
    }
    
}
