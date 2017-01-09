import java.util.Scanner;

public class Sess7_Assigmnt1 {
	public static void main(String[] args) {
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of the integer: ");
		i=sc.nextInt();
		String s1 = String.valueOf(i);
		System.out.println("Integer to String using valueOf() method: " + s1);
	}
}
/*
******************************************************************************
Output:
Enter the value of the integer: 
13
Integer to String using valueOf() method: 13
******************************************************************************
*/