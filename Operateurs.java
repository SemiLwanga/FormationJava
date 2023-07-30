package javaformation;

/*
[Notes]
= Affectation
+ concatenation

+ - * / % ()
== === != < <= > >=  : Comparaison

+= -= *= /= %=  ---> A = A + x    : Incrementation et Decrementation
                     A += x
                     A = A - x
                     A -= x
++ --
        [Nota] : Pour l'incrémentation ou decrémentation de 1,
                 On utilise:  A++ : post-incrémentation
                              ++A : pré-incrémentation

                              A-- : post-decrémentation
                              --A : pré-decrémentation
*/

public class Operateurs 
{
	public static void main(String[] args) 
	{
        int age = 24; // age <- 24
        int result = age;
        System.out.println("Tu as " + age + " ans");
        System.out.println(result);

        int calcul = (5 + 6) * 2;
        System.out.println(calcul);

        boolean myvar  = false;
        System.out.println(myvar);

        boolean yourvar = !myvar;
        System.out.println(yourvar);

        int  goldCoins = 0;
        System.out.println(goldCoins);

        goldCoins = goldCoins + 10; // Gain de 10 pièces d'or
        System.out.println(goldCoins);

        goldCoins = goldCoins + 100; //Gain de 100 pièces d'or
        System.out.println(goldCoins);

        int nb1 = 1;
        int nb2 = nb1++; // post-incrémentation --> nb2 = nb1 puis nb1 += 1
        System.out.println(nb1);
        System.out.println(nb2);

        int nb3 = 1;
        int nb4 = ++nb3; // pré-incrémentation  --> nb3 += 1 puis nb4 = nb3
        System.out.println(nb3);
        System.out.println(nb4);

        boolean answer = 70 < 50;
        System.out.println(answer);
	}
}
