package day8;

public class Singleton {

	private static Singleton dataMember;
	
	private Singleton(){
		
	}
	
	public static Singleton singleton1() {
		
		if(dataMember == null)
		   dataMember = new Singleton();
		
		return dataMember;
	}
	
	
}
