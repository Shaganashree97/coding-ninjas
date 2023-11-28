// I used ternary operator to print largest of 3 numbers

import java.util.* ;
import java.io.*; 
class Solution {
	
	public static void main(String args[]) {
		
		// Write code here
		
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int l = (a>b && a>c)? a: (b>a && b>c)? b:c;

		System.out.println(l);

	}
}
