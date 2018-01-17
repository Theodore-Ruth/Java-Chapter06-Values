
public class Exercise_9 {

	public static void main(String[] args) {
		System.out.println(power(2, 4));

	}
	
	public static double power(double x, int n)
	{
		if (n == 0)
		{
			return 1;
		}
		
		else
		{
			x = x * power(x, n - 1);
		}
		return x;
	}

}
