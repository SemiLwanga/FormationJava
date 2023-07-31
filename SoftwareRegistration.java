package javaformation;

public class SoftwareRegistration 
{
	public SoftwareRegistration(int expiration)
	{
		if (nNumberOfRegistrations > 0)
		{
			this.nExpirationYear = expiration;
			nNumberOfRegistrations--;
			
			System.out.println("Logiciel valide (expiration : "+ this.nExpirationYear + ")");
			System.out.println("Enregistrements restants : " + this.nNumberOfRegistrations);
		}
		else
		{
			System.out.println("Maximum de validations effectuees !");
		}	
	}
	public int getExpirationYear()
	{
		return this.nExpirationYear;
	}
	
	public static int getNumberOfRegistrations()
	{
		return nNumberOfRegistrations;
	}
	
	private static int nNumberOfRegistrations = 5;
	private int nExpirationYear;  
	
}
