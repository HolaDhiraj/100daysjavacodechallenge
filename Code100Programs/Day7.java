/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code100Programs;

/**
 *
 * @author Dhiraj Bhattarai
 */
public class Day7 {
    public static void main(String[] args){
         // method overriding =  declear  the method in subclass which is already present in parent class
         //First f = new First();
         //f.Add();
         Second sc = new Second();
         sc.Add();
         
         
    }
}
class First{
    void Add(){
        int a= 10;
        int b = 5;
        int sum = a+b;
        System.out.println("Addition of two number is: " + sum);
    }
}
class Second extends First{
    @Override
    void Add(){
        int a= 10;
        int b = 5;
        int c = 5;
        int sum = a+b+c;
        System.out.println("Addition of Three number is: " +sum);
    }
}