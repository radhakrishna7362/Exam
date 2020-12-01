package insem;

import viarants.variants;
import java.util.*;
public class scoop
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{	
		int a=50,b=0;
		System.out.println("Our base coffee is Espresso at Rs.50");
		System.out.println("We have some more additional variants for you If u want to continue type yes or else no");
		String ch=sc.next();
		if(ch.equalsIgnoreCase("yes")) {
			System.out.println("Want any varieties 1-Cappacino 2-Mocha 3-Latte");
			System.out.println("If u want to continue type yes or else no");
			String c=sc.next();
			if(c.equalsIgnoreCase("yes")) {
				b=b+variants.varieties();
				System.out.println("Want any flavours 1-Hazlenut 2-Marshmallows 3-Caramel");
				System.out.println("If u want to continue type yes or else no");
				String cho=sc.next();
				if(cho.equalsIgnoreCase("yes")) {
					b=b+variants.flavours();
					System.out.println("Want any sweetners 1-RegularSugar 2-RawSugar 3-Honey 4-SugarFreeEqual");
					System.out.println("If u want to continue type yes or else no");
					String choi=sc.next();
					if(choi.equalsIgnoreCase("yes")) {
						b=b+variants.sweetner();
						int total=a+b;
						System.out.println("Thanks for visiting Total cost for the Coffee is "+total);
					}
					else if(choi.equalsIgnoreCase("no")) {
						int total=a+b;
						System.out.println("Thanks for visitng Total cost for the Coffee is "+total);
					}
				}
				else if(cho.equalsIgnoreCase("no")) {
					System.out.println("Want any sweetners 1-RegularSugar 2-RawSugar 3-Honey 4-SugarFreeEqual");
					System.out.println("If u want to continue type yes or else no");
					String choice=sc.next();
					if(choice.equalsIgnoreCase("yes")) {
						b=b+variants.sweetner();
						int total=a+b;
						System.out.println("Thanks for visiting Total cost for the Coffee is "+total);
					}
					else if(choice.equalsIgnoreCase("no")) {
						int total=a+b;
						System.out.println("Thanks for visiting Total cost for the Coffee is "+total);
					}
				}
			}
			else if(c.equalsIgnoreCase("no")){
				System.out.println("Want any flavours 1-Hazlenut 2-Marshmallows 3-Caramel");
				System.out.println("If u want to continue type yes or else no");
				String x=sc.next();
				if(x.equalsIgnoreCase("yes")) {
					b=b+variants.flavours();
					System.out.println("Want any sweetners 1-RegularSugar 2-RawSugar 3-Honey 4-SugarFreeEqual");
					System.out.println("If u want to continue type yes or else no");
					String y=sc.next();
					if(y.equalsIgnoreCase("yes")) {
						b=b+variants.sweetner();
						int total=a+b;
						System.out.println("Thanks for visiting Total cost for the Coffee is "+total);
					}
					else if(y.equalsIgnoreCase("no")) {
						int total=a+b;
						System.out.println("Thanks for visiting Total cost for the Coffee is "+total);
					}
				}
				else if(x.equalsIgnoreCase("no")) {
					System.out.println("Want any sweetners 1-RegularSugar 2-RawSugar 3-Honey 4-SugarFreeEqual");
					System.out.println("If u want to continue type yes or else no");
					String z=sc.next();
					if(z.equalsIgnoreCase("yes")) {
						b=b+variants.sweetner();
						int total=a+b;
						System.out.println("Thanks for visiting Total cost for the Coffee is "+total);
					}
					else if(z.equalsIgnoreCase("no")) {
						int total=a+b;
						System.out.println("Thanks for visiting Total cost for the Coffee is "+total);
					}
				}
			}
		}
		else if(ch.equalsIgnoreCase("no")) {
			int total=a+b;
			System.out.println("Thanks for visiting Total cost for the Coffee is "+total);
		}
	}
}