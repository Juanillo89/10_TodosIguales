package todosIguales;

import java.util.Scanner;

public class TodosIguales 
{
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		int num2;
		boolean iguales = true;
		System.out.print ("Introduce n�mero:");
		int num1 = sc.nextInt ();
		for (int i = 0 ; i < 9 ; i++) 
		{
			System.out.print ("Introduce n�mero:");
			num2 = sc.nextInt ();
			if (num2 != num1) 
			{
				iguales = false;
			}
		}
		sc.close();
		if (iguales) 
		{
			System.out.println ("Todos los n�meros son iguales.");
		}
		else 
		{
			System.out.println ("Todos los n�meros no son iguales.");
		}
	}
}
