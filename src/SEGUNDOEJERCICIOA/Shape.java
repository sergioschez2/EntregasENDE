/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEGUNDOEJERCICIOA;

/**
 *
 * @author Sergio
 */
public class Shape {
    public static final int SQUARE = 1;
    public static final int CIRCLE = 2;
    public static final int RIGHT_TRIANGLE = 3;
    private final int shapeType;
    private final double size;
    public Shape(int shapeType, double size) {
    this.shapeType = shapeType;
    this.size = size;
}

public double area() {
    switch (shapeType) {
    case SQUARE: return size*size;
    case CIRCLE: return Math.PI*size*size/4.0;
    case RIGHT_TRIANGLE: return size*size/2.0;
}
    return 0;
} }
