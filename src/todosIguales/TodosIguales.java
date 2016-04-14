package todosIguales;

import java.util.Scanner;

public class TodosIguales 
{
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		int num2;
		boolean iguales = true;
		System.out.print ("Introduce número:");
		int num1 = sc.nextInt ();
		for (int i = 0 ; i < 9 ; i++) 
		{
			System.out.print ("Introduce número:");
			num2 = sc.nextInt ();
			if (num2 != num1) 
			{
				iguales = false;
			}
		}
		sc.close();
		if (iguales) 
		{
			System.out.println ("Todos los números son iguales.");
		}
		else 
		{
			System.out.println ("Todos los números no son iguales.");
		}
	}
}
