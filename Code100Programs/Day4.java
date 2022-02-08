/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code100Programs;

import java.util.Scanner;

/**
 *
 * @author Dhiraj Bhattarai
 */
public class Day4 {
    public static void main(String[] args){
        
        SwapFirst sw = new SwapFirst(10, 5);
        System.out.println("Before Swapping x =" + sw.n1+ "\t" + "b =" + sw.n2);
        
        SwapSecond sw1 = new SwapSecond();
        sw1.Swap(sw);
        System.out.println("After Swapping x =" + sw.n1+ "\t" + "b =" + sw.n2);
        
        /*
        int a, b, temp;
        Scanner sc = new Scanner(System.in); 
        System.out.println("Day4");
        System.out.println("First Number:");
        a = sc.nextInt();
        System.out.println("Second Number:");
        b = sc.nextInt();
        
        System.out.println("Before Swapping x =" + a+ "\t" + "b =" + b);
        
        //before Swapping
        
        temp = a;
        a = b;
        b =temp;
        
        System.out.println("After Swapping x =" + a+ "\t" + "b =" + b);
        */
        
    }
}
class SwapFirst{
    int n1, n2, a, b;
    SwapFirst(int a , int b){
        n1 = a;
        n2 = b;
    }
}
class SwapSecond{
    void Swap(SwapFirst s){
        int output = s.n1;
        s.n1 = s.n2;
        s.n2 = output;
    }
}