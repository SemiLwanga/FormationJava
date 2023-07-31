package javaformation;

public class Player 
{
	public Player()
	{
		this.nName = "Jason";
		this.nLevel = 2;
		System.out.println(this.nName + " - " + this.nLevel);

	}
	
	public void attack()
	{
		System.out.println(this.nName + " attaque une cible !");	
	}
	 
	private String nName;
	private int nLevel;
}
