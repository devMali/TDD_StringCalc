package StrPack;
import java.util.StringTokenizer;

public class StringCalculator {

	public int add(String numbers)
	{
		if(numbers.isEmpty()) {
			return 0;
		}
		else if(numbers.length() ==1) {
			return Integer.parseInt(numbers);
		}
		else if(numbers.contains("b"))
		{
			return alphaNumericSum(numbers);
		}
		else {
			String [] num = numbers.split(",");
			return getSumgt1000(num);
		}
	}
	
	
	private int alphaNumericSum(String num)
	{
		String digit = num.replaceAll("[^0-9]"," ");
		String alpha = num.replaceAll("[^a-z]","");
		
		int sum1=0;
		int sum2=0;
		
		StringTokenizer st = new StringTokenizer(digit);
		
		while (st.hasMoreTokens()) {  
			int n = 0;
			n = Integer.parseInt(st.nextToken());
			sum1 += n;
	     }  
		
		char[] cnum  = alpha.toCharArray();
        int ch;
		
        for(char s : cnum)
        {
            ch = Character.getNumericValue(s);
			ch=ch-9;
			sum2 +=ch;
        }
        
		return sum1+sum2;
	}
	
	private int getSumgt1000(String[] num)
	{
		int sum=0;
		int val;
		for(String curr: num)
		{
			val=Integer.parseInt(curr);
			if(val > 1000) {
				continue;
			}
			sum+=val;
				
		}
		return sum;
	}
	
	
}

