public class Steel
{
	public static void main(String args[])
	{
		double hardness = 60,carbon = 0.9,tensile_strength = 6000;
		if(hardness > 50)
		{	if(carbon < 0.7)
			{	if(tensile_strength >5600)
					System.out.println("grade is 10");
				else
					System.out.println("grade is 9");
			}
			else
				System.out.println("grade is 6");
		
		}
		else if(carbon < 0.7)
		{
			if(tensile_strength >5600)
				System.out.println("grade is 8");
		}
		else if(tensile_strength >5600)
			System.out.println("grade is 7");
		else
			System.out.println("gr is 5");
		
	}
}
