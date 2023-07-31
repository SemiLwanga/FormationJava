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
			System.out.println("Enregistrement restant : " + this.nNumberOfRegistrations);
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
	
	private static int nNumberOfRegistrations = 5;
	private int nExpirationYear;  
	
}
