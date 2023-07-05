/*
Чтение чисел
*/

import java.util.Scanner;
public class Solution0215
{
	public static void main(String[] args)
	{
		Scanner console = new Scanner (System.in);
		System.out.print("Введите число 1: ");
		int a = console.nextInt();
		System.out.print("Введите число 2: ");
		int b = console.nextInt();
		System.out.print("Введите число 3: ");
		int c = console.nextInt();
		
		System.out.println();
		
		System.out.println("Среднее арифметическое равно " + (a + b + c)/3);
		
		console.close();
	}
}
