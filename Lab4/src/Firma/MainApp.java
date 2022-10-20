package Firma;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
      int optiune= sc.nextInt();
      List<Echipament> echipamente=new ArrayList<Echipament>();
      
		do {
		switch(optiune) 
		{
		case 1:
			System.out.println("Afişarea imprimantelor");
			break;
		case 2:
			System.out.println("Afişarea copiatoarelor");
			break;
		case 3:
			System.out.println("Afişarea sistemelor de calcul");
			break;
		case 4:
			System.out.println("Modificarea stării în care se află un echipament");
			break;
		case 5:
			System.out.println("Setarea unui anumit mod de scriere pentru o imprimantă");
			break;
		case 6:
			System.out.println("Setarea unui format de copiere pentru copiatoare");
			break;
		case 7:
			System.out.println("Instalarea unui anumit sistem de operare pe un sistem de calcul");
			break;
		}
		}
		while(optiune!=0);
		}

}
