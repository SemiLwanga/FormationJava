package javaformation;

/*

==      égal à
===     égal et de même type que
!=      différent de
<       strictement inférieur à
<=      inférieur ou égal à
>       strictement supérieur à
>=      supérieue ou égal à

&&      Et
||      Ou

*/

public class Conditions 
{
	public static void main(String[] args) 
	{
        int value = 17;
        
        if (value < 0)
        {
            System.out.println("value < 0");
            if (value == -25)
                System.out.println("value = -25");
        }
            
        else if (value > 0 && value < 15)
            System.out.println("value est positif et < 15");
        
        else if (value == 24 || value == 12)
            System.out.println("Affirmatif");
        
        else if (value > 15)
            System.out.println("value est > 15");
        
        else
            System.out.println("value vaut 15");
	}
}
