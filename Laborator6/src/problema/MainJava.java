package problema;

import java.util.Optional;
import java.util.Scanner;
import java.util.Vector;

public class MainJava 
{

	public static void main(String[] args)
	{
		Vector<Banca> banci = new Vector<Banca>();
		int opt;
		Scanner scanner = new Scanner(System.in);
			System.out.println("1.Adaugarea unei banci.");
			System.out.println("2.Adaugarea unui client.");
			System.out.println("3.Adaugarea unui cont.");
			System.out.println("4.Afisare.");
			System.out.println("5.Afisarea denumirii bancilor si numarul de clienti.");
			System.out.println("6.Afisarea clientilor unei banci.");
			System.out.println("7.Afisarea conturilor unui client la o banca specificata.");
			System.out.println("8.Afisarea conturilor unui client indiferent de banca.");
			System.out.println("9.Depunerea unei sume intr-un cont.");
			System.out.println("10.Extragerea unei sume dintr-un cont.");
			System.out.println("11.Transfer de bani intre doua conturi.");
			do {
			System.out.print("Alegeti optiunea: ");
			opt = scanner.nextInt();
			switch (opt) {
			case 0:
				return;
			case 1: {
				String nume_banca;
				System.out.println("Introduceti numele bancii:");
				nume_banca = scanner.next();
				banci.add(new Banca(nume_banca));
			}

			break;
			case 2: 
			{
				String nume_client, adresa_client, banca_client;
				System.out.print("Introduceti numele clientului: ");
				nume_client = scanner.next();
				System.out.print("Introduceti adresa clientului: ");
				adresa_client = scanner.next();
				System.out.print("Introduceti banca clientului: ");
				banca_client = scanner.next();
				banci.stream()
				.filter(x -> banca_client.equals(x.getDenumire()))
				.findFirst()
				.get()
				.addClient(new Client(nume_client,adresa_client));
			}

			break;
			case 3: 
			{
				String nume_banca, nume_client, numar_cont, moneda;
				System.out.println("Introduceti numele bancii: ");
				nume_banca = scanner.next();
				System.out.println("Introduceti numele clientului: ");
				nume_client = scanner.next();
				System.out.println("Introduceti numarul de cont:");
				numar_cont = scanner.next();
				System.out.println("Introduceti moneda(RON/EURO)");
				moneda = scanner.next();
			}
			break;
			case 4:
				banci.stream().forEach(System.out::println);
				break;
			case 5:
				String den;
			    banci.stream().forEach(System.out::println);
				den = scanner.next();
				banci.stream()
				.filter(x -> x.getDenumire().equals(den))
				.findFirst()
				.map(Banca::getClienti)
				.toString();
				Optional<Banca> optional = banci.stream()
						.filter(x -> x.getDenumire().equals(den))
						.findFirst();
				if(optional.isPresent()) 
				{
					optional.get().getClienti().forEach(System.out::println);
				}
				break;
			case 6:
				break;
			case 7:
				break;
			case 8:
				break;
			case 9:
				break;
			case 10:
				break;
			case 11:
				break;
			default:
				System.out.println("Optiune gresita.");
			}
		} while (opt != 0);
		scanner.close();
	}
	
}
