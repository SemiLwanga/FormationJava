package javaformation;

public class Methodes 
{
	public static void main(String[] args) 
	{
		String msg = say("Hello !");
		System.out.println(msg);
	}
	 
	public static String say(String msg)
	{
		System.out.println(msg);
		return msg;
	}
}