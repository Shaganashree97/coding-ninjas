import java.util.* ;
import java.io.*; 
class Solution {
	
	public static void main(String args[]) {
		
		// Write code here

		Scanner ip = new Scanner(System.in);
		
		int principalAmount = ip.nextInt();
		float rateOfInterest = ip.nextFloat();
		int timePeriod = ip.nextInt();

		System.out.println((int)(principalAmount*rateOfInterest*timePeriod/100));
		
	}
}
