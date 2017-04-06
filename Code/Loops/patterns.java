// patterns

class patterns {

	public void rt1() {
		System.out.println("\n\n");
		for(int i=1;i<=5;i++) {
			for (int j=1; j<=i; j++)
				System.out.print(j);
			System.out.println();
		}
	}
	
	public void rt2() {
		System.out.println("\n\n");
		for(int i=1;i<=5;i++) {
			for (int j=1; j<=i; j++)
				System.out.print(i);
			System.out.println();
		}
	}
	
	public void rt3() {
		System.out.println("\n\n");
		for(int i=1;i<=5;i++) {
			for (int j=1; j<=i; j++)
				System.out.print("*");
			System.out.println();
		}
	}
	
	public void rt4() {
		System.out.println("\n\n");
		for(int i=1;i<=5;i++) {
			for (int j=1; j<=i; j++) {
				if (j%2==0)
				System.out.print("1");
				else
					System.out.print("0");
				}
			System.out.println();
		}
	}
	
	public void rti1() {
		System.out.println("\n\n");
		for(int i=1;i<=5;i++) {
			for (int j=5; j>=i; j--)
				System.out.print(j);
			System.out.println();
		}
	}
	
	public void rti2() {
		System.out.println("\n\n");
		for(int i=1;i<=5;i++) {
			for (int j=5; j>=i; j--)
				System.out.print(i);
			System.out.println();
		}
	}
	
	public void rti3() {
		System.out.println("\n\n");
		for(int i=1;i<=5;i++) {
			for (int j=5; j>=i; j--)
				System.out.print("*");
			System.out.println();
		}
	}
	
	
	public void rti4() {
		System.out.println("\n\n");
		for(int i=1;i<=5;i++) {
			for (int j=5; j>=i; j--) {
				if (j%2==0)
				System.out.print("1");
				else
					System.out.print("0");
				}
			System.out.println();
		}
	}
	
	public void tr() {
		System.out.println("\n\n");
		for(int i = 1; i <= 5; i++) {
			for(int s = 5; s>=i+1;s--) 
				System.out.print(" ");
			for(int j = 1; j<=i;j++)
				System.out.print("@ ");
			System.out.println();
		}
	}
	
	public void tri() {
		System.out.println("\n\n");
		for(int i = 1; i <= 5; i++) {
			for(int s = 1; s<i;s++) 
				System.out.print(" ");
			for(int j = 5; j>=i;j--)
				System.out.print("@ ");
			System.out.println();
		}
	}
	
	public void tr2() {
		System.out.println("\n\n");
		for(int i = 1; i <= 5; i++) {
			for(int s = 5; s>=i+1;s--) 
				System.out.print(" ");
			for(int j = 1; j<=i;j++)
				System.out.print("@");
			for(int k = 1; k<i;k++)
				System.out.print("@");
			System.out.println();
		}
	}
	
	public void tr2i() {
		System.out.println("\n\n");
		for(int i = 1; i <= 5; i++) {
			for(int s = 2; s<=i;s++) 
				System.out.print(" ");
			for(int j = 5; j>=i;j--)
				System.out.print("@");
			for(int k = 5; k>i;k--)
				System.out.print("@");
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		patterns obj = new patterns();
		obj.rt1();
		obj.rt2();
		obj.rt3();
		obj.rt4();
		obj.rti1();
		obj.rti2();
		obj.rti3();
		obj.rti4();
		obj.tr();
		obj.tri();
		obj.tr2();
		obj.tr2i();
	}
}
