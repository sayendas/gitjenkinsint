package day8;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class Main1 {

	public static void main(String args[]) {
		int ch=1;
		List<Object> l= new ArrayList<>();
    while(ch==1) 
    {
    	Employee e=new Employee();
	    System.out.println("Enter your name");
	    Scanner sc = new Scanner(System.in);
	    String ab=sc.next();
        e.setName(ab);
	    String w= e.getName();
	    Object s=w;	
	    l.add(s);
	    System.out.println("Press 1 to continue or 0 to quit");
	    ch=sc.nextInt();
	    if(ch==0) {
	    	System.out.println(l);
	    }
	}
	
	
	
	
	}
}
