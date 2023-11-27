import java.util.Scanner;

class Solution {
	
	public static void main(String args[]) {
		
		// Write code here
		
		Scanner sc = new Scanner(System.in);

		String name = sc.nextLine();
		byte age = sc.nextByte();

		System.out.printf("The name of the person is %s and the age is %d.", name, age);
		
	}
}
