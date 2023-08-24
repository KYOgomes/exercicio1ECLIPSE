import java.util.*;
class SOMA2dog
{
	public static Scanner sc = new Scanner (System.in);
	
	public static void main(String[] args)
	{
		int a, b, resp;
		
		System.out.println("numero 1:");
		a = sc.nextInt();
		
		System.out.println("numero 2:");
		b = sc.nextInt();
		
		resp = a + b;
		
		System.out.println("resultado = " + resp);
	}
}