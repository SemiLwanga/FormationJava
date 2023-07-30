package javaformation;

public class Switch 
{
	public static void main(String[] args) 
	{
		String choice = "n";
		switch(choice)
		{
			case "y":
				/* if (choice == "y") */
				System.out.println("OUI");
				break;
			case "n":
				/* if (choice == "n") */
				System.out.println("NON");
				break;
			
			default:
				/* choise != "y" && choice != "n" */
				System.out.println("Ni Oui ni Non");
				break;
		}
	}
}
