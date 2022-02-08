/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code100Programs;

/**
 *
 * @author Dhiraj Bhattarai
 */
public class Day6 {
    public static void main(String[] args){
        
        double x = add(2.8, 8);
        System.out.println(x);
        
    }
    // method overloading = same method but differnt parameter 
    
    public static double add(double a, int b){
        System.out.println("First Method:");
        return a+b;
    }
    public static int add(int a, int b){
        System.out.println("Second Method:");
        return a+b;
    }
    
}
