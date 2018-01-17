import java.util.Scanner;
public class Exercise_3 {

	private static Scanner in;

	public static void main(String[] args) {
		int hypotenuse = readInt("Hypotenuse (Longest Side): ");
		int side1 = readInt("First side: ");
		int side2 = readInt("Second side: ");
		
		if(isTriangle(hypotenuse, side1, side2))
		{
			System.out.println("It can be a triangle!");
		}
		else
		{
			System.out.println("It can't be a triangle");
		}
	}
	
	public static boolean isTriangle(int h, int s1, int s2)
	{
		if(h < s1 + s2 && h >=s1 && h >= s2)
		{
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
