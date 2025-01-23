package PROGRAMS;

public class PROGRAM2 {

	public static void main(String args[])
	{
		String str ="qweddre@#$112";
		String alpha="",digit="";
		for(int i=0;i<str.length();i++)
		{
			char b=str.charAt(i);
			if(Character.isAlphabetic(b))
			{
				alpha=alpha+b;
				
					
			}
			else
			{
				digit=digit+b;
			}
			
			
		}
		
		System.out.println(alpha);
		
	}
}
