package StrPack;

public class StringCalculator {

	public int add(String numbers)
	{
		String[] num  = numbers.split(",");

		if(numbers.isEmpty()) {
			return 0;
		}
		else if(numbers.length() ==1) {
			return Integer.parseInt(numbers);
		}
		else
		{
			//return Integer.parseInt(num[0]) + Integer.parseInt(num[1]);
			return getSum(num);
		}
	}
	
	private int getSum(String[] num)
	{
		int sum = 0;
		
		for(String n: num )
		{
			sum += Integer.parseInt(n);
		}
		return sum;
	}
}
