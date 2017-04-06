// program to find areas of circle, square, rectangle, triangle with method overloading

import java.util.*;

class function_overloading {

    public double area(double side) {
        double sqarea = side * side;
        return sqarea;
    }
    
    public void area(Scanner sobj) {
        double radius  = sobj.nextDouble();
        double ciarea = 3.14 * radius * radius;
        System.out.println(ciarea);
    }
    
    public double area(int length, int breadth) {
        double rearea = length * breadth;
        return rearea;
    }
    
    public void area(double length, double height) {
        double trarea = 0.5 * length * height;
        System.out.println(trarea);
    }
    
    public static void main(String[] args) {
    function_overloading obj = new function_overloading();
    Scanner sobj = new Scanner(System.in);
    System.out.println("Enter choice\n1. Circle\n2. Square\n3.Rectangle\n4.Triangle\n");
    int choice = sobj.nextInt();
    switch(choice) {
        case 1:
            obj.area(sobj);
            break;
         
        case 2:
            System.out.println(obj.area(5.0));
            break;
          
        case 3:
            System.out.println(obj.area(5,8));
            break;
            
        case 4:
            obj.area(10.0,5.0);
            break;
        
        default:
            System.out.println("Oops!!");
    	}
    }
}
