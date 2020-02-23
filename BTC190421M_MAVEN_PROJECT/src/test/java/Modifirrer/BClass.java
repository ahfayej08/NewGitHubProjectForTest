package Modifirrer;

import org.testng.annotations.Test;

public class BClass extends AClass {
	
//	public static void main(String[] args) {
//		AClass a = new AClass();
//		
//		System.out.println(a.getA());
//		
//		a.setA(20);
//	int i =	a.getA();
//		System.out.println(i);
//		
//	}
	
//	public BClass() {
//
//	int x=	super.getA();
//	
//	
//	
//	}
	@Test
	public void test() {
		BClass b = new BClass();
		int c = b.getA();
		
		System.out.println(c);
		b.setA(12);
		
		System.out.println(b.getA());
		
	}
	
	
	
	
	
}
