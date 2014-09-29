//jaouad Ezzaher
import java.util.Scanner;

public class QuarterBack {

	
	
	Scanner data_input= new Scanner(System.in);

	public static void main(String[] args) {
	
		
		double Completions;
		double yrds;
		double attems;
		int Blocks;
		int TouchDown;
		
		Scanner data_input = new Scanner(System.in);
		
		System.out.print("Number of touchdowns: ");
		TouchDown = data_input.nextInt();
		
		System.out.print("Number of Blocks: ");
		Blocks = data_input.nextInt();
		
		System.out.print("Number of attepmts: ");
		attems = data_input.nextInt();
		
		System.out.print("Number of yards: ");
		yrds = data_input.nextDouble();
		
		System.out.print("Number of completions: ");
		Completions = data_input.nextInt();
		
		
		float a;
		a = (float) ((((Completions/attems) * 100) - 30) * 0.05);
		System.out.println(a);
		
		float b;
		b = (float) (((yrds/attems) - 3) * .25);
		System.out.println(b);
		
		float c;
		c = (float) (((TouchDown/attems) * 100) * 0.2);
		System.out.println(c);
		
		float d;
		d = (float) (2.375 - (((Blocks/attems) * 100) * 0.25));
		System.out.println(d);
		
		
		
		
		
		double Total_rate;
		
		Total_rate = ((a + b + c + d) / 6) * 100;
		System.out.println(a+b+c+d);
		System.out.println((a + b + c + d) / 6);
		
		System.out.println("The quarter back overall ratings is: " + Total_rate);
		
	
		
	}		

}
