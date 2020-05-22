package day8;

public class Main {

	public static void main(String args[]) {
		
		Singleton s = Singleton.singleton1();
		System.out.println(s);
		
		Singleton s1 = Singleton.singleton1();
		System.out.println(s1);	
	}
}
