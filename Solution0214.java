/*
Чтение и преобразование строк
*/

import java.util.Scanner;
public class Solution0214
{
	public static void main(String[] args) 
	{
		Scanner console = new Scanner (System.in);
		System.out.print("Введите строку 1: ");
		String str1 = console.nextLine();
		System.out.print("Введите строку 2: ");
		String str2 = console.nextLine();
		System.out.print("Введите строку 3: ");
		String str3 = console.nextLine();
		System.out.println();
		
		System.out.println(str3);
		System.out.println(str2.toUpperCase());
		System.out.println(str1.toLowerCase());
		
		console.close();
	}
}
