 

package com.mycompany.democircle2;

 
public class DemoCircle2 {

    public static void main(String[] args) {
         Circle c1= new Circle(10,"RED");
         Circle c2= new Circle(10,"RED");
         
         System.out.println("The values are equal "+c2.testSecondObj(c1));
    }
}
