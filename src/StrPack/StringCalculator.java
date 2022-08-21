package StrPack;
import java.util.StringTokenizer;
import java.util.*;

public class StringCalculator {

	public int add(String numbers) 
	{
		if(numbers.isEmpty()) {
			return 0;
		}
		else if(numbers.length() ==1) {
			return Integer.parseInt(numbers);
		}
		else if(numbers.charAt(0)=='1' || numbers.charAt(0)=='0') {
			return OddEvenAdd(numbers);
		}
		else {
			return alphaNumericSum(numbers);
		}
	}
	
	
	private int alphaNumericSum(String num) 
	{
		if(num.contains("-"))
		{
			ArrayList<Integer> negativeNums = new ArrayList<>();
			String[] addnums = num.split("[,\n;]+");
		
			String str="";
			int val;
			 for (String n : addnums) {
		            val = Integer.parseInt(n);
		            if (val < 0) {
		            	negativeNums.add(val);
		                str += (String.valueOf(val) + " ");
		            }
			}  
			 NegativeException.throwNegativeException(str);
			 return 0;
		}
		else
		{
		
		String digit = num.replaceAll("[^0-9]"," ");
		String alpha = num.replaceAll("[^a-z]","");
		
		int sum1=0;
		int sum2=0;
		
		StringTokenizer st = new StringTokenizer(digit);

		while (st.hasMoreTokens()) {  
			int n = 0;
			n = Integer.parseInt(st.nextToken());
			
			if(n > 1000) {
				continue;
			}
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
	}

	public int OddEvenAdd(String num)
	{
		char choice=num.charAt(0);
		
		String digit = num.replaceAll("[^0-9]","");
		char chArr[] = digit.toCharArray();
		
	
			int sum=0;
		    if(choice=='0')
		    {
		        for(int i=1;i<chArr.length;i=i+2)
		        {
		            System.out.print(chArr[i]);
		            String str = String.valueOf(chArr[i]);
		            sum += Integer.parseInt(str);
		        }
		     
		    }
		    if(choice=='1')
		    {
		        for(int i=2;i<chArr.length;i=i+2)
		        {
		            System.out.print(chArr[i]);
		            String str = String.valueOf(chArr[i]);
		            sum += Integer.parseInt(str);
		        }
		    
		    }	
		    
		    return sum;
	}
	
	
	
}