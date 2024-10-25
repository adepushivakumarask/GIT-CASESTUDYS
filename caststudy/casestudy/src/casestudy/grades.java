package casestudy;
import java.util.*;

public class grades {

	public static void main(String[] args) {
		int marks[] = new int[5]; // array
        int i;

        
        float total=0, avg;
        Scanner scanner = new Scanner(System.in);
		
        
        for(i=0; i<5; i++) { 
           System.out.print("Enter Marks of Subject:" );
           marks[i] = scanner.nextInt();
           total = total + marks[i];
        }
        scanner.close();
        // average here
        avg = total/5;
        System.out.print("The student Grade is: ");
        if(avg>=90)
        {
            System.out.print("A");
        }
        else if(avg>=80)
        {
           System.out.print("B");
        } 
        else if(avg>=70)
        {
            System.out.print("C");
        }
        
        else if(avg>=60)
        {
            System.out.print("D");
        }
        
        
        else
        {
            System.out.print("F");
        }
    }

		

	

	}


