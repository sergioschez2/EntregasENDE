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
public class Square extends Shape{
    public Square(double size) {
    super(size);
}
    public double area() {
    double size = getSize() ;
    return size*size;
}
}
