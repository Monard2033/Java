package someri;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import someri.Persoana.Studii;


public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		List<Persoana> pers = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);

		try {
			BufferedReader buffer = new BufferedReader(new FileReader("src/persoane.txt"));
			String linie;
			while ((linie = buffer.readLine()) != null) {
				String[] aux = linie.split(";");
				String nume = aux[1];
				int varsta = Integer.parseInt(aux[2]);
				Studii stud = Studii.valueOf(aux[3]);
				if (aux[0].equalsIgnoreCase("1")) {
					int salar = Integer.parseInt(aux[4]);
					int vechime = Integer.parseInt(aux[5]);
					pers.add(new Angajat(nume, varsta, stud, salar, vechime));
				} else if (aux[0].equalsIgnoreCase("2")) {
					LocalDate dataIntrareInSomaj;
					dataIntrareInSomaj = LocalDate.parse(aux[4]);
					pers.add(new Somer(nume, varsta, stud, dataIntrareInSomaj));
				}
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		pers.forEach(System.out::println);

		//
		int ok = 0, m = 0, n = 0;
		do {
			System.out.println("Introduceti vechimea: ");
			try {

				n = scanner.nextInt();
				// m=scanner.nextInt();
				ok = 1;

			} catch (InputMismatchException e) {
				scanner.next();
				System.out.println("Reintroduceti o valoare numerica:");
			}

		} while (ok == 0);

		final int n2 = n;
		pers.stream().filter(p -> p instanceof Angajat && ((Angajat) p).getVechime() > n2).forEach(System.out::println);

		System.out.println("Afisare si Ordonare someri dupa zile de somaj:");
		pers.stream().filter(p1 -> p1 instanceof Somer).sorted((a, b) -> ((LocalDate) ((Somer) a).getDataIntrareInSomaj()).compareTo((LocalDate) ((Somer) b).getDataIntrareInSomaj())).forEach(System.out::println);
		
		System.out.println("Afisare doar nume si Ordonare someri dupa zile de somaj:");
		pers.stream().filter(p1 -> p1 instanceof Somer).sorted((a, b) -> ((LocalDate) ((Somer) a).getDataIntrareInSomaj()).compareTo((LocalDate) ((Somer) b).getDataIntrareInSomaj())).map(p1->p1.getNume()).forEach(System.out::println);

		
		System.out.println("Afisare someri cu >100 zile somaj:");
		int zile=100;
		pers.stream().filter(p2->p2 instanceof Somer &&((Somer) p2).functie()>1).forEach(System.out::println);
		

	}

}
