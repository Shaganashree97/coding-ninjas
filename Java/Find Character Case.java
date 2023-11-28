//  

import java.util.Scanner;
class Solution {
	
	public static void main(String args[]) {
		
		// Write code here

		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
    
    // Here next().charAt(0) --> can read 1 char as input
    
		int num = (int)ch;

		if (num>=65 && num<=90)
		{
			System.out.println(1);
		}
		else if (num >= 97 && num <= 122)
		{
			System.out.println(0);
		}
		else
		{
			System.out.println(-1);
		}
		
	}
}
