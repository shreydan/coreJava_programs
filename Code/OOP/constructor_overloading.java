// constructor overloading example
// program to find area of square, circle, rectangle, triangle

import java.util.*;

class constructor_overloading {

	public constructor_overloading(double radius) {
		double ciarea = 3.14 * radius * radius;
		System.out.println(ciarea);
	}
	
	public constructor_overloading(Scanner sobj) {
		double side = sobj.nextDouble();
		double sqarea = side * side;
		System.out.println(sqarea);
	}
	
	public constructor_overloading(int length, int breadth) {
		int rearea = length * breadth;
		System.out.println(rearea);
	}
	
	public constructor_overloading(double length, double height) {
		double trarea = 0.5 * length * height;
		System.out.println(trarea);
	}

	public static void main(String[] args){
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter choice:\n1.Circle\n2.Square\n3.Rectangle\n4.Triangle");
		
		int choice = sobj.nextInt();
		
		switch (choice) {
		
		case 1:
			constructor_overloading cobj = new constructor_overloading(5.0);
			break;
		
		case 2:
			constructor_overloading sqobj = new constructor_overloading(sobj);
			break;
		
		case 3:
			constructor_overloading reobj = new constructor_overloading(5,8);
			break;
		
		case 4:
			constructor_overloading trobj = new constructor_overloading(5.0,8.0);
			break;
			
		default:
			System.out.println("Oops");
		}
	}
}
