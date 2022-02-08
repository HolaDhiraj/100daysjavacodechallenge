/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code100Programs;

/**
 *
 * @author Dhiraj Bhattarai
 */
import java.io.*;
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
import java.util.Scanner;
public class Day3 {
    public static void main(String[] args){
        System.out.println("Day 3");
        



            //System.out.println(new java.util.Date());



//1. BufferReader 
       
        /*
        
        try{ 
        int a, b, output;
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter the first number:");
        a = Integer.parseInt(br.readLine());
        
        System.out.println("Enter the Second number:");
        b = Integer.parseInt(br.readLine());
        
        output = a + b;
        
        System.out.println("Addition: " + output );
       }
       catch(Exception ex){
           ex.printStackTrace();
       }
        
        
        */
        
        
        
        
        
        
        
         // 2. Scanner
        
        Scanner sc = new Scanner(System.in);
        
        float a, b;
        System.out.println("Enter the first Number: ");
        a = sc.nextInt();
        System.out.println("Enter the Second Number: ");
        b = sc.nextInt();
        
        float add = a + b; 
        float sub = a-b;
        float mul = a*b;
        float div = a/b;
        
        System.out.println("Addition: " + add);
        System.out.println("subtraction: " + sub);
        System.out.println("Multiplication: " + mul);
        System.out.println("Division: " + div);
        
        
    }
}
