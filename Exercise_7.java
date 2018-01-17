
public class Exercise_7 {

	public static void main(String[] args) {
		System.out.println(oddSum(16));

	}
	
	public static int oddSum(int n)
	{
		if (n == 1)
		{
			return n;
		}
		else if(n % 2 != 0)
		{
			n += oddSum(n-2);
		}
		else
		{
			n += oddSum(n-1);
		}
		return n;
	}

}
