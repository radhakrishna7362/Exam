package viarants;

import java.util.Scanner;

public class variants {
	
	static int Espresso=50;
	static int Cappacino=75;
	static int Mocha=80;
	static int Latte=85;
	static int Hazlenut=15;
	static int Marshmallows=20;
	static int Caramel=25;
	static int RegularSugar=0;
	static int RawSugar=1;
	static int Honey=15;
	static int SugarFreeEqual=20;
	static Scanner sc=new Scanner(System.in);
	public static int sweetner() {
		int b=0;
		while(true)
		{
			System.out.println("Select the required sweetner");
			System.out.println("1-RegularSugar");
			System.out.println("2-RawSugar");
			System.out.println("3-Honey");
			System.out.println("4-SugarFreeEqual");
			System.out.println("5-Thats all for me");
			int ch=sc.nextInt();
			if(ch==5)
				break;
			System.out.println("Enter number of Servings");
			int sr=sc.nextInt();
			if(ch==1)
				b=b+sr*RegularSugar;
			else if(ch==2)
				b=b+sr*RawSugar;
			else if(ch==3)
				b=b+sr*Honey;
			else if(ch==4)
				b=b+sr*SugarFreeEqual;
		}
		return b;
	}
	
	public static int varieties() {
		int b=0;
		System.out.println("Select the variety you want");
		System.out.println("1-Cappacino");
		System.out.println("2-Mocha");
		System.out.println("3-Latte");
		System.out.println("4-Don't want anything");
		int ch=sc.nextInt();
		if(ch==1)
			b=Cappacino;
		else if(ch==2)
			b=Mocha;
		else if(ch==3)
			b=Latte;
		return b;
	}
	
	public static int flavours() {
		int b=0;
		while(true) {
			System.out.println("Select the flavours you want");
			System.out.println("1-Hazlenut");
			System.out.println("2-Marshmallows");
			System.out.println("3-Caramel");
			System.out.println("4-Thats all for me");
			int ch=sc.nextInt();
			if(ch==4)
				break;
			if(ch==1)
				b=b+Hazlenut;
			else if(ch==2)
				b=b+Marshmallows;
			else if(ch==3)
				b=b+Caramel;
		}
		return b;
	}
}
