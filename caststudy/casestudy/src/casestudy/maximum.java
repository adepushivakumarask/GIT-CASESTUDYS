package casestudy;

public class maximum {

	public static void main(String[] args) {
		//  first let take an array
		int[]val= new int[] {54,23,67,21,3};
		//let we assume value max
		int max=val[0];
		//try loop 
		for (int i=0;i<val.length;i++) {
			if (val[i]>max)
			max=val[i];
			
		}
		System.out.println("the maximum value is "+ max);

	}

}
