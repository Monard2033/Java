package sub1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		List<Vapor> vapoare = new ArrayList<Vapor>();
		
		BufferedReader buf = new BufferedReader(new InputStreamReader(new FileInputStream("in.txt")));
		String linie = buf.readLine();
		while(linie!=null)
		{
			String[] atribute = linie.split(";");
			String nume = atribute[0];
			int membri = Integer.parseInt(atribute[1]);
			LocalDate data = LocalDate.parse(atribute[2]);
			Viteza viteza = Viteza.valueOf(atribute[3]);
			String tip = atribute[4];
			
			if(tip.equals("VasCroaziera")) {
				int piscine = Integer.parseInt(atribute[5]);
				int rest = Integer.parseInt(atribute[6]);
				VasCroaziera vasC = new VasCroaziera(nume,membri,data,viteza, piscine,rest);
				vapoare.add(vasC);
			}
			else {
				int cont = Integer.parseInt(atribute[5]);
				VasMarfa vasM = new VasMarfa(nume, membri,data,viteza,cont);
				vapoare.add(vasM);
			}
			
			linie = buf.readLine();
		}
		vapoare.forEach(System.out::println);
		buf.close();
		
		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		
		boolean valid = true;
		
		do {
			valid = true;
		try {
		System.out.println("Piscine: ");
		int n = Integer.parseInt(buff.readLine());
		System.out.println("Ultimii cati ani: ");
		int m = Integer.parseInt(buff.readLine());
		vapoare
		.stream()
		.filter(a->a.getClass().getName().equals("sub1.VasCroaziera"))
		.filter(a->a.AniLansare()<m)
		.filter(a->a.getViteza().equals(Viteza.MARE))
		.map(a->(VasCroaziera)a)
		.filter(a->a.getNr_piscine()>n)
		.forEach(System.out::println);
		}
		catch(NumberFormatException e) {
			System.out.println("Incorrect value " + e.getMessage().toLowerCase());
			valid=false;
		}
		}while(!valid);
		
		
		
		vapoare
		.stream()
		.filter(a->a.getClass().getName().equals("sub1.VasMarfa"))
		.map(a->(VasMarfa)a)
		.sorted((a,b)->(a.getNr_containere()<b.getNr_containere()) == true ? 1 : -1 )
		.map(Vapor::getNume)
		.forEach(System.out::println);
		
		buff.close();
	}

}
