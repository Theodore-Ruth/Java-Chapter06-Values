
public class Exercise_4 {

	public static void main(String[] args) {
		double num1 = 1.0;
		double num2 = 2.0;
		double num3 = 3.0;
		System.out.println(multadd(num1, num2, num3));
		
		double cosine = Math.cos(Math.PI / 4);
		double half = 0.5;
		double sine = Math.sin(Math.PI / 4);
		System.out.println(multadd(cosine, half, sine));
		
		double base = 1.0;
		double log10 = Math.log(10);
		double log20 = Math.log(20);
		System.out.println(multadd(base, log10, log20));
		
		double x = 4;
		System.out.println(expsum(x));

	}
	
	public static double multadd(double num1, double num2, double num3)
	{
		return num1 * num2 + num3;
	}
	
	public static double expsum(double x)
	{
		double exp = Math.exp(-x);
		double sqrtEXP = Math.sqrt(1.0 - exp);
		return multadd(x, exp, sqrtEXP);
	}

}
