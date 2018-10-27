/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometricshapes;

import java.util.Scanner;

/**
 *
 * @author yavuz
 */
public class GeometricShapes {

    /**
     * @param args the command line arguments
     */
    
    static void menu()
    {
        
        System.out.printf("  MENU\n");
        System.out.println("-----------");
        System.out.println("1. Rectangle");
        System.out.println("2. Square");
        System.out.println("3. Circle");
        System.out.println("4. Exit");
      
    }
    
    static double rect_area(int a, int b)
    {
        double area;
        area = a * b;
        return area;
    }
    
    static int rect_peri(int a, int b)
    {
        int peri;
        peri = 2*a + 2*b;
        return peri;
    }
    
    static int sq_area(int a)
    {
        int area;
        area = a*a;
        return area;
    }
    
    static int sq_peri(int a)
    {
        int peri;
        peri = 4 * a;
        return peri;
    }
    
    static double circ_area(int radi)
    {
        double area;
        area = 3.14 * radi * radi;
        return area;
    }
    
    static double circ_peri(int radi)
    {
        double peri;
        peri = 2 * 3.14 * radi;
        return peri;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner choice = new Scanner(System.in);
        Scanner choice2 = new Scanner(System.in);
        Scanner side = new Scanner(System.in);
  
        int side1;
        int side2;
        menu();
        System.out.println("Enter your choice:");
        int chc = choice.nextInt();
        while(chc != 4)
        {
            System.out.println("Which operation do you want to calculate For Area (A), For Perimeter (P)");
            String chc2 = choice2.next();
            if(chc == 1)
            {
                System.out.println("Enter two sides of rectangle:");
                side1 = side.nextInt();
                side2 = side.nextInt();
                if(chc2.equals("A"))
                {
                    System.out.println("Area of rectangle is " + rect_area(side1, side2));
                }
                else if(chc2.equals("P"))
                {
                    System.out.println("Perimeter of Rectangle is " + rect_peri(side1, side2));
                } 
                
            }
            else if(chc == 2)
            {
                System.out.println("Enter the side of square:");
                side1 = side.nextInt();
                if(chc2.equals("A"))
                {
                    System.out.println("Area of square is " + sq_area(side1));
                }
                else if(chc2.equals("P"))
                {
                    System.out.println("Perimeter of square is " + sq_peri(side1));
                }
            }
            else if(chc == 3)
            {
                System.out.println("Enter the radius of a circle:");
                side1 = side.nextInt();
                if(chc2.equals("A"))
                {
                    System.out.println("Area of circle is " + circ_area(side1));
                }
                else if(chc2.equals("P"))
                {
                    System.out.println("Perimeter of circle is " + circ_peri(side1));
                }
            }
            menu();
            chc = choice.nextInt();
        }
    }
    
}
