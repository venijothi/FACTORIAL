# FACTORIAL
package oxygen.com;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("enter the number");
int n=s.nextInt();
int fact=1;
for(int i=1;i<=n;i++)
{
	fact=fact*i;
}
	System.out.print("the factorial of a number is:");
	System.out.println(fact);
	}
}


OUTPUT:
enter the number
5
the factorial of a number is:120
