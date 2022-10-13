package cnp;

import java.util.Scanner;

public class cnp {

	public static void main(String[] args) throws CNPEronat 
	{
		Persoana []p = new Persoana[2];

		for(int i=0;i<=p.length;i++)
		{
			
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce Numele:");
		String nume=sc.nextLine();
		System.out.println();
		System.out.println("Introduceti CNP-ul:");
		String cnp=sc.nextLine();
		p[i]=new Persoana(nume,cnp);
		}
		System.out.println("Numele persoanei este: "+p[0].Nume);
		System.out.println("CNP-ul persoanei este: "+p[0].CNP);
		p[0].getVarsta();
	}

}
