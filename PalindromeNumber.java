
public class PalindromeNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 462;
		int temp,b=0,c=a;
		String y="hg";
		
		for(int i=0;i<3;i++)
		{
			temp=c%10;
			b = b*10+temp;
			c=c/10;
		
		}
		if(a==b)
		{System.out.println("Its apalindrome number");}
		else
		{
			System.out.println("Its not palindrome");
		}
	}

}
