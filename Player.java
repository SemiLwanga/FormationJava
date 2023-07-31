package javaformation;

public class Player 
{
	public Player()
	{
		this.nName = "Inconnu";
		this.nLevel = 2;
		System.out.println(this.nName + " - " + this.nLevel);

	}
	
	public Player(String name)
	{
		this.nName = name; 
		this.nLevel = 2; 
		System.out.println(this.nName + " - " + this.nLevel);

	}
	
	public Player(String name, int level)
	{
		this.nName = name;
		this.nLevel = level;
		System.out.println(this.nName + " - " + this.nLevel);
	}
	
	private String nName;
	private int nLevel;
}
