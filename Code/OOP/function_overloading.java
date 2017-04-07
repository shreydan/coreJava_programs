// function overloading example

class function_overloading {

    public void hello() {
        System.out.println("look ma, no parameters");
    }
    
    public void hello(double a, double b) {
        System.out.println(a+" "+b);
    }
    
    public double hello(double c) {
        return c;
    }
    public int hello(int d, int e) {
        return d+e;
    }
    
    public static void main(String[] args) {
    	
    	function_overloading obj = new function_overloading();
    	obj.hello();
    	obj.hello(1.0,2.0);
    	obj.hello(3.0);
    	obj.hello(4,5);
   
    }
}
