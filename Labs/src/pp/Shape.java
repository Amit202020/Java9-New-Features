package pp;

interface Shape {
	
	int a = 10;

	void show();

	public default void display() {
		method4();
		method5();
		System.out.println("default method Inside Shape interface");
	}

	public static void main(String args[]) {
		
		method5();
		System.out.println("static method Inside Shape interface");
	}


	private void method4() {
		System.out.println("private method Inside Shape interface");
	}
	
	private static void method5() {
		System.out.println("private static method Inside Shape interface");
	} 
}