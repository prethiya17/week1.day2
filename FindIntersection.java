package week1.day2;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// * a) Declare An array for {3,2,11,4,6,7};	
		int[] a1={3,2,11,4,6,7};
		 // b) Declare another array for {1,2,8,4,9,7};
		int[] a2= {1,2,8,4,9,7};
		// c) Declare for loop iterator from 0 to array length
		for(int i=0;i<a1.length;i++)
		{
			//d) Declare a nested for another array from 0 to array length
			for(int j=0;j<a2.length;j++) {
				if(a1[i]==a2[j])
				{
					System.out.println("The numbers in common:"+""+a1[i]);
					break;
				}
			}
			//break;
		}

	}

}
