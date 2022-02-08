/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code100Programs;

/**
 *
 * @author Dhiraj Bhattarai
 */
public class Day5 {
    public static void main(String[] args){
        
        Box b = new Box();
        b.setDate(5, 4, 3);
        int area = b.findArea();
        System.out.println("Area of Box is = " + area);
        
        int volume = b.findVol();
        System.out.println("Volume of Box is " + volume);
        
    }
}
class Box{
    
    private int l;
    private int b;
    private int h;
    public void setDate(int x, int y, int z){
        l = x ; b= y; h = z;
    }
    
    public int findArea(){
        return l*b;
        
    }
    
    public int findVol(){
        return l*b*h;
    }
}