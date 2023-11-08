public class Discount
{
	public static void main(String args[])
	{
		int price = 15000;
		double product_discount,final_price;
		if(price >10000)
		{
			product_discount = 50/100.0*price;
			final_price = price - product_discount;
			System.out.println("Eligible to dicount of 50% and your final price is "+final_price);
		}
		else if(price >8000)
		{
			product_discount = 30/100.0*price;
			final_price = price - product_discount;
			System.out.println("Eligible to dicount of 30% and your final price is "+final_price);
		}
		else if(price >2000)
		{
			product_discount = 10/100.0*price;
			final_price = price - product_discount;
			System.out.println("Eligible to dicount of 10% and your final price is "+final_price);
		}
		else if(price >1000)
		{
			product_discount = 5/100.0*price;
			final_price = price - product_discount;
			System.out.println("Eligible to dicount of 5% and your final price is "+final_price);
		}
		else 
		{
			
			System.out.println("you are not  to dicount buy anything above 1000 rupees ");
		}
		
	}
}