/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEGUNDOEJERCICIOB;

/**
 *
 * @author Sergio
 */
public class Right_Triangule extends Shape{
    public Right_Triangule(double size) {
    super(size);
}
    public double area() {
    double size = getSize() ;
    return size*size/2;
    }  
}
