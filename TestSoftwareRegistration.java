package javaformation;

public class TestSoftwareRegistration 
{
	public static void main(String[] args) 
	{
		SoftwareRegistration sr = new SoftwareRegistration(2025);
		SoftwareRegistration sr2 = new SoftwareRegistration(2026);

		System.out.println(sr.getExpirationYear());			
		System.out.println(sr2.getExpirationYear());			

	} 
}
