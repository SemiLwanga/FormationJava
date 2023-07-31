package javaformation;

public class SoftwareRegistration 
{
	/* 
	 	[ACCESSEURS]
	 		getters : accès à un attribut (lecture)
	 		setters : modification d'un attribut
	*/
	public SoftwareRegistration(int expiration)
	{
		this.nExpirationYear = expiration;
		System.out.println("Enregistrement du produit, valide jusqu'en " + this.nExpirationYear);
	}
	
	public int getExpirationYear()
	{
		return this.nExpirationYear;
	}
	
	public void setExpirationYear(int expiration)
	{
		this.nExpirationYear = expiration;
	}
	
	private int nExpirationYear;
	
}
