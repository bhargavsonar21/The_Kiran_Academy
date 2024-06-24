package com.tka.HomeWorkFormulas;

public class Test {
	public static void main(String[] args)
	{
		System.out.println("*********** Area ************");
		
		CalAreaRectangle obj1 = new CalAreaRectangle();
		double Area_Rectangle = obj1.calAreaOfRectangle(10,20);
		System.out.println("Area of Rectangle: "+Area_Rectangle);
		
		
		CalAreaTrapezoid obj2 = new CalAreaTrapezoid();
		double Area_Trapezoid = obj2.CalAreaOfTrapezoid(10, 20,5);
		System.out.println("Area OF Trapezoid: "+Area_Trapezoid);
		
		CalAreaSphere obj3 = new CalAreaSphere();
		double Area_Sphere = obj3.CalAreaOfSphere(20);
		System.out.println("Area of the Sphere: "+Area_Sphere);
		
		System.out.println("*********** Perimeter ************");
		
		CalPerimeterSquare obj4 = new CalPerimeterSquare();
		double Perimeter_Square = obj4.calPerimeterOfSquare(10);
		System.out.println("Perimeter of the Square: "+Perimeter_Square);
		
		CalPerimeterRectangle obj5 = new CalPerimeterRectangle();
		double Perimeter_Rectangle = obj5.CalPerimeterOfRectangle(10, 20);
		System.out.println("Perimeter of the Rectangle: "+Perimeter_Rectangle);
		
		CalPerimeterCircle obj6 = new CalPerimeterCircle();
		double Perimeter_Circle = obj6.CalPerimeterOfCircle(10);
		System.out.println("Perimeter of the Rectangle: "+Perimeter_Circle);
		
		System.out.println("*********** Surface Area ************");
		
		CalSurfaceAreaCube obj7 = new CalSurfaceAreaCube();
		double Surface_Cube = obj7.CalPerimeterOfCube(10);
		System.out.println("Surface Area of the Cube: "+Surface_Cube);
		
		CalSurfaceAreaCylinder obj8 = new CalSurfaceAreaCylinder();
		double Surface_Cylinder = obj8.CalPerimeterOfCylinder(10,5);
		System.out.println("Surface Area of the Cylinder: "+Surface_Cylinder);
		
		CalSurfaceAreaCone obj9 = new CalSurfaceAreaCone();
		double Surface_Cone = obj9.CalPerimeterOfCone(10,5);
		System.out.println("Surface Area of the Cone: "+Surface_Cone);
		
		CalSurfaceAreaSphere obj10 = new CalSurfaceAreaSphere();
		double Surface_Sphere = obj10.CalPerimeterOfSphere(10);
		System.out.println("Surface Area of the Sphere: "+Surface_Sphere);
		
		CalAreaCuboid obj15 = new CalAreaCuboid();
		double Surface_Area = obj15.calAreaOfCuboid(10, 20, 30);
		System.out.println("Suface Area of Cuboid: "+Surface_Area);
		
		System.out.println("*********** Volume ************");
		
		CalVolumeCylinder obj11 = new CalVolumeCylinder();
		double Volume_Cylinder = obj11.CalVolumeOfCylinder(10,10);
		System.out.println("Volume of Cylinder: "+Volume_Cylinder);
		
		CalVolumeCone obj12 = new CalVolumeCone();
		double Volume_Cone = obj12.CalVolumeOfCone(10,10);
		System.out.println("Volume of Cone: "+Volume_Cone);
		
		CalVolumeSphere obj13 = new CalVolumeSphere();
		double Volume_Sphere = obj13.CalVolumeOfSphere(10);
		System.out.println("Volume of Sphere: "+Volume_Sphere);
		
		
		
		System.out.println("*********** Interest ************");
		
		CalSimInterest obj14 = new CalSimInterest();
		double Simple_Interest = obj14.CalSimpleInterest(20000,13,5);
		System.out.println("Simple Interest: "+Simple_Interest);
		
		PythaGorasTheoram obj16 = new PythaGorasTheoram();
		System.out.println(obj16.pythagorasthrorem(10, 10));
		
		
		
	}
}
