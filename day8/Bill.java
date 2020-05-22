package day8;

import java.io.PrintWriter;
import java.util.Scanner;

public class Bill {
public static void main(String[] args) throws Exception {
		
		StringBuffer bill =new StringBuffer();
		StringBuffer starline =new StringBuffer();
		Scanner sc =new Scanner(System.in);
		
		for(int i=0;i<80;i++)
		{
			starline.append("-");
		}
		
		bill.append(starline);
		bill.append("\n");

		bill.append(String.format("|%33s",""));
		bill.append(String.format("%11.11s","Invoice Tax"));
		bill.append(String.format("%34s|",""));
		
	    bill.append("\n");
		bill.append(starline);
		
		bill.append("\n");
		System.out.println("Enter Comp Name 1:");
		String compname1=sc.nextLine();
		System.out.println("Enter Comp Name 2:");
		String compname2=sc.nextLine();
		bill.append(String.format("|%-40s",compname1));
		bill.append(String.format("|%-37s|",compname2));
		
		bill.append("\n");
		System.out.println("Enter Comp address 1:");
		String compaddr1=sc.nextLine();
		System.out.println("Enter Comp address 2:");
		String compaddr2=sc.nextLine();
		bill.append(String.format("|%-40s",compaddr1));
		bill.append(String.format("|%-37s|",compaddr2));
		
		bill.append("\n");
		System.out.println("Enter Telephone 1:");
		String tele1=sc.nextLine();
		System.out.println("Enter Telephone 2:");
		String tele2=sc.nextLine();
		bill.append(String.format("|%-40s",tele1));
		bill.append(String.format("|%-37s|",tele2));
		
		bill.append("\n");
		System.out.println("Enter GST 1:");
		String gst1=sc.nextLine();
		System.out.println("Enter GST 2:");
		String gst2=sc.nextLine();
		bill.append(String.format("|%-40s",gst1));
		bill.append(String.format("|%-37s|",gst2));
		
		bill.append("\n");
		System.out.println("Enter FSSAI 1:");
		String fssai1=sc.nextLine();
		System.out.println("Enter FSSAI 2:");
		String fssai2=sc.nextLine();
		bill.append(String.format("|%-40s",fssai1));
		bill.append(String.format("|%-37s|",fssai2));
		
		bill.append("\n");
		bill.append(starline);
		bill.append("\n");

		System.out.println("Enter INV no:");
		String invno=sc.nextLine();
		bill.append(String.format("|INVNO:%-20.20s",invno));
		System.out.println("Enter INV date:");
		String date=sc.nextLine();
		bill.append(String.format("DATE:%-21.21s",date));
		System.out.println("Enter Salesman name:");
		String man=sc.nextLine();
		bill.append(String.format("MAN:%-22.22s|",man));
		
		bill.append("\n");
		bill.append(String.format("|%-26.66s","PO no:"));
		bill.append(String.format("%-52.66s|","PO date:"));
		
		
		bill.append("\n");
		bill.append(starline);
		bill.append("\n");
		
		
		bill.append(String.format("|%8.8s","CODE"));
		bill.append(String.format("|%8.8s","DESC"));
		bill.append(String.format("|%8.8s","MRP"));
		bill.append(String.format("|%8.8s","BOX"));
		bill.append(String.format("|%8.8s","RATE"));
		bill.append(String.format("|%8.8s","SCHEME"));
		bill.append(String.format("|%8.8s","GST"));
		bill.append(String.format("|%8.8s","GST Amt"));
		bill.append(String.format("|%6.6s|","NET Amt"));
		bill.append("\n");
		
		bill.append(starline);
		
		System.out.println("Enter the no:");
		Integer n = sc.nextInt();
		
		//float grt=0;
		float totalgst=0;
		float grosstotal=0;
		float finalgst=0;
		for(int i=0;i<n;i++)
		{
		    bill.append("\n");
		
		   
		   sc.nextLine();
		    System.out.println("Enter The Code:");
		   // sc.nextLine();
			String code=sc.nextLine();
			bill.append(String.format("|%8.8s",code));
			System.out.println("Enter desc:");
			//sc.nextLine();
			String desc=sc.nextLine();
			bill.append(String.format("|%8.8s",desc));
			//sc.nextLine();
			
			System.out.println("Enter MRP:");
			Float mrp=sc.nextFloat();
			bill.append(String.format("|%8.8s",mrp));
			
			System.out.println("Enter Box:");
		    float box=sc.nextFloat();
			bill.append(String.format("|%8.8s",box));
			
			System.out.println("Enter Rate:");
			float rate=sc.nextFloat();
			bill.append(String.format("|%8.8s",rate));
			
			System.out.println("Enter Scheme:");
			sc.nextLine();
			String scm=sc.nextLine();
			bill.append(String.format("|%8.8s",scm));
			
			System.out.println("Enter GST:");
			Float gst=sc.nextFloat();
			bill.append(String.format("|%8.8s",gst));
		 	
			float gamt=((gst/100)*rate)*box;
			bill.append(String.format("|%8.8s",gamt));
			
		
			Float namt=gamt+(rate*box);
			bill.append(String.format("|%6.6s|",namt));
		
			grosstotal=grosstotal + mrp;
			totalgst=totalgst+gamt;
			finalgst=finalgst+namt;
		}
		
		for(int i=0;i<=4;i++)
		{
			bill.append("\n");
			bill.append(String.format("|%8.8s",""));
			bill.append(String.format("|%8.8s",""));
			bill.append(String.format("|%8.8s",""));
			bill.append(String.format("|%8.8s",""));
			bill.append(String.format("|%8.8s",""));
			bill.append(String.format("|%8.8s",""));
			bill.append(String.format("|%8.8s",""));
			bill.append(String.format("|%8.8s",""));
			bill.append(String.format("|%6.6s|",""));
			
			
			
		}
		
		bill.append("\n");	
		bill.append(starline);
		bill.append("\n");	
		bill.append(String.format("|%8.8s","CGST"));
		bill.append(String.format("|%8.8s","2.5"));
		bill.append(String.format("|%8.8s","0.00"));
		bill.append(String.format("|%8.8s","6%"));
		bill.append(String.format("|%8.8s","0.00"));
		bill.append(String.format("|%8.8s","9%"));
		bill.append(String.format("|%8.8s","0.00"));
		bill.append(String.format("|%8.8s","0.00"));
		bill.append(String.format("|%6.6s|","0.00"));
		bill.append("\n");
		bill.append(String.format("|%8.8s","SGST"));
		bill.append(String.format("|%8.8s","2.5"));
		bill.append(String.format("|%8.8s","0.00"));
		bill.append(String.format("|%8.8s","6%"));
		bill.append(String.format("|%8.8s","0.00"));
		bill.append(String.format("|%8.8s","9%"));
		bill.append(String.format("|%8.8s","0.00"));
		bill.append(String.format("|%8.8s","0.00"));
		bill.append(String.format("|%6.6s|","0.00"));
		bill.append("\n");
		bill.append(starline);
		
		
		bill.append("\n");
	    bill.append(String.format("|%-10.10s","Gross tot:"));
		bill.append(String.format("%8.8s|",grosstotal));
		bill.append(String.format("%-15.15s","total less:"));
		bill.append(String.format("%4.4s|","0.00"));
		bill.append(String.format("%-10.10s","Total GST:"));
		bill.append(String.format("%9.9s|",totalgst));
		bill.append(String.format("%-10.10s","final GST:"));
		bill.append(String.format("%9.9s|",finalgst));
		
		bill.append("\n");
		
		bill.append(String.format("|%-10.10s","Toatl Sch:"));
	    bill.append(String.format("%8.8s|","0.00"));
		bill.append(String.format("%-9.9s","Disc Amt:"));
		bill.append(String.format("%10.10s|","0.00"));
		bill.append(String.format("%-10.10s","Total Add:"));
		bill.append(String.format("%9.9s|","0.00"));
		bill.append(String.format("%-8.8s","TOT/QNT:"));
		bill.append(String.format("%11.11s|","0.00"));
		bill.append("\n");
		
		bill.append(starline);
	    bill.append("\n");
		
		
	/*	PrintWriter pw =new PrintWriter("Sagarbill.txt");
		pw.println(bill);
		pw.close();*/
		
		System.out.println(bill);
	
		
	}


}
