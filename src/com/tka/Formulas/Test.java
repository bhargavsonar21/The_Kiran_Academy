package com.tka.Formulas;

public class Test {

	public static void main(String[] args) {
		
		CalAreaCircle obj = new CalAreaCircle();
		double Area_Circle = obj.calAreaCircle(5.5);
		System.out.println("Area Of Circle: "+Area_Circle);
		
		CalAreaSquare obj1 = new CalAreaSquare();
		double Area_Square = obj1.calAreaOfSquare(5);
		System.out.println("Area of Square: "+Area_Square);
		
		CalAreaTriangle obj2 = new CalAreaTriangle();
		double Area_Triangle = obj2.calAreaOfTriangle(5f,7f);
		System.out.println("Area of a Triangle: "+Area_Triangle);

	}

}
