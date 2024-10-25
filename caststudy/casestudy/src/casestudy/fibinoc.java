package casestudy;
import java.util.*;

public class fibinoc {

	public static void main(String[] args) {
		Scanner fab = new Scanner(System.in);
		System.out.println("enter a number:");
		int n= fab.nextInt();
		 int a=0,b=1;
		 
		 if(n>=a) {
			 System.out.println(a);
		 }
		 if(n>=b) {
			 System.out.println(b);
		 }
		 while (true) {
		 int x=a+b;
		 
		 if(x>n) {
			 break;
			 
		 }
		 System.out.println(x);
		 a=b;
		 b=x;
		 
		}

	}

}
