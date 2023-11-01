/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classlearning;

import java.awt.Point;

/**
 *
 * @author Administrator
 */
public class Circle {
    private Point center;
    private double radius;
    Circle(){}
    Circle(Point center,double radius){
        this.center=center;
        this.radius=radius;
    }
    double getPerimeter(){
        return 2*Math.PI*this.radius;
    }
    double getArea(){
        return Math.PI*this.radius*this.radius;
    }
    public void setCenter(Point center){
        this.center=center;
    }
     public void setRadius(double center){
        this.radius=radius;
    }
    
}
