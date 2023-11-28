// 

import java.util.* ;
import java.io.*; 
class Solution {
	
	public static void main(String args[]) {
		
		// Write code here
		
		Scanner sc = new Scanner(System.in);

		int basic = sc.nextInt();
		char grade = sc.next().charAt(0);
		int allow = 0;

		if ((int)grade >= 65 && (int)grade <= 90)
		{
			if (grade == 'A')
			{
				allow = 1700;
			}
			else if (grade == 'B')
			{
				allow = 1500;
			}
			else
			{
				allow = 1300;
			}
		}

		float Total_Salary = basic + 0.2f*basic + 0.5f*basic + allow - 0.11f*basic;

		System.out.println(Math.round(Total_Salary));

	}
}
