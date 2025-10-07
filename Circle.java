 
package com.mycompany.democircle2;

 
public class Circle {
    private double radius;
    private String color;
    
    boolean testSecondObj(Circle c1){
        return(radius==c1.radius && color==c1.color );
    }
    public Circle(double r, String c){
        this.radius=r;
        this.color=c;
    }
            
}
