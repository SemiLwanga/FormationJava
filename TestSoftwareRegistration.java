package javaformation;

public class TestSoftwareRegistration 
{
	public static void main(String[] args) 
	{
		SoftwareRegistration sr = new SoftwareRegistration(2020);
		
		sr.setExpirationYear(2050);
		System.out.println(sr.getExpirationYear());			
	} 
}
