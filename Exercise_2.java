import java.util.Scanner;
public class Exercise_2 {

	private static Scanner in;

	public static void main(String[] args) {
		int dividend = readInt("Give me a dividend");
		int divisor = readInt("Give me a divisor.");
		if(isDivisible(dividend, divisor))
		{
			System.out.println("They are divisible!");
		}
		else
		{
			System.out.println("They are not divisible");
		}
		

	}
	
	public static boolean isDivisible(int n, int m)
	{
		if (n % m == 0){
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	public static int readInt(String s)
	{
		System.out.println(s);
		in = new Scanner(System.in);
		return in.nextInt();
	}

}
