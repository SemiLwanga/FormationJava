package javaformation;

public class TestSoftwareRegistration 
{
	public static void main(String[] args) 
	{
		System.out.println("ENREGISTREMENT : " + SoftwareRegistration.getNumberOfRegistrations());

		SoftwareRegistration sr = new SoftwareRegistration(2020);
		System.out.println("ENREGISTREMENT : " + SoftwareRegistration.getNumberOfRegistrations());

		SoftwareRegistration sr2 = new SoftwareRegistration(2023);
		System.out.println("ENREGISTREMENT : " + SoftwareRegistration.getNumberOfRegistrations());

		SoftwareRegistration sr3 = new SoftwareRegistration(2025);
		System.out.println("ENREGISTREMENT : " + SoftwareRegistration.getNumberOfRegistrations());
	}  
}
