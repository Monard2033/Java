package Problema_Trenuri;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class MainApp {

	public static void main(String[] args) {
		Set <Tren> trenuri=new TreeSet <Tren>();
		int x=0, ok=0;
		Scanner sc=new Scanner(System.in);
		BufferedReader flux_in;
		try 
		{
			flux_in=new BufferedReader (new FileReader("input.txt"));
			String sir;
			String[] valori;
			while ((sir=flux_in.readLine())!=null)
			{
				valori=sir.split(" ");
				Tren t;
				if (valori[0].equals("Accelerat"))
				{
					t=new Accelerat(Integer.valueOf(valori[1]), Integer.valueOf(valori[2]), LocalDate.parse(valori[3]), Integer.valueOf(valori[4]), Boolean.valueOf(valori[5]));
					trenuri.add(t);
				}
				else if (valori[0].equals("Marfar"))
				{
					t=new Marfar(Integer.valueOf(valori[1]), Integer.valueOf(valori[2]), LocalDate.parse(valori[3]), valori[4]);
					trenuri.add(t);
				}
			}
			flux_in.close();
		}
		catch (FileNotFoundException e)
		{
			System.out.println(e.toString());
		}
		catch (IOException e)
		{
			System.out.println(e.toString());
		}
		trenuri.forEach(System.out::println);
		do
		{
			System.out.print("Introduceti X= ");
			try
			{
				x=sc.nextInt();
				ok=1; //se executa doar daca nu a fost aruncata exceptia
			}
			catch(InputMismatchException e)
			{
				sc.next();
				System.out.println("Nr introdus incorect !");
			}
		}while(ok==0);
		for(Tren t:trenuri)
		{
			if (t instanceof Accelerat)
				if (((Accelerat) t).getNumar_de_locuri()>x)
					System.out.println(t);
		}
		sc.close();
	}
}
