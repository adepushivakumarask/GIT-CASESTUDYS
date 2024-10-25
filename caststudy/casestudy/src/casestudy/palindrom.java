package casestudy;

public class palindrom {

	public static void main(String[] args) {
		//try 
		String val="abcdcbaj";
		int i=0, j=val.length()-1;
		
		// using while loop
		
		while(i<j) {
			if(val.charAt(i)!=val.charAt(j));{
			System.out.println("not a palindrom ");
			System.exit(0);
			}
			i++;
			j--;
		}
		System.out.println("its a palindrom");	

	}


}
