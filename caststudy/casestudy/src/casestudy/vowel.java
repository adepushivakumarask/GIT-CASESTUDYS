package casestudy;
import java.util.*;

public class vowel {

	public static void main(String[] args) {
		Scanner cont = new Scanner(System.in);
		
		  System.out.println("Enter a string : ");
		  
        String input = cont.nextLine();
        int count=0;
        
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            
            input = input.toLowerCase();
            
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            {
                count++;
            }
        }
        System.out.println(" vowels count is  : " + count );

	}

}
