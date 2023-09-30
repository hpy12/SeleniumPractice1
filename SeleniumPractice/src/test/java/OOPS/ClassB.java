package OOPS;

public class ClassB extends ClassA {

	public void b1() {
		System.out.println("B1 method in classB");
	}

	public void b2() {
		System.out.println("B2 method in classB");
	}

	public void b3() {
		System.out.println("B3 method in classB");
	}
	public static void main(String[] args) {
		ClassA obj =new ClassB();
		obj.a1();
		obj.a2();
		obj.a3();

	}

}
