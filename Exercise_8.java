
public class Exercise_8 {

	public static void main(String[] args) {
		System.out.println(ack(3, 3));

	}
	
	public static int ack(int m, int n)
	{
		if (m == 0)
		{
			return n+1;
		}
		else if (m > 0 && n == 0)
		{
			return ack(m-1, 1);
		}
		else if (m > 0 && n > 0)
		{
			return ack(m-1, ack(m, n-1));
		}
		return 0;
	}

}
