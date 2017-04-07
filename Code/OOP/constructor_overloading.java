// constructor overloading example

class constructor_overloading {
	
	public constructor_overloading() {
		System.out.println("default constructor");
	}
	
	public constructor_overloading(double a) {
		System.out.println(a);
	}
	
	public constructor_overloading(int b, int c) {
		System.out.println(b+" "+c);
	}
	
	public constructor_overloading(double d, double e) {
		System.out.println(d+" "+e);
	}

	public static void main(String[] args){
		constructor_overloading obj1 = new constructor_overloading();
		constructor_overloading obj2 = new constructor_overloading(5.0);
		constructor_overloading obj3 = new constructor_overloading(1,2);
		constructor_overloading obj4 = new constructor_overloading(1.2,2.3);
	}
}
