package javaformation;

public class While {

	public static void main(String[] args) 
	{
		int i = 1;
		
		while(i != 11) 
		{
			System.out.println(i);
			
			if(i==5)
				break;
			
			i++;
		}
	}
}
