package Firma;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) throws IOException {
		String Nume, Post,str;
		float Salariu;
		LocalDate data_angajarii;
		int optiune=0;
    List<Angajat> angajat = new ArrayList<Angajat>();
   Scanner sc = new Scanner(System.in);
   System.out.println("1. Citire din fisier si crearea listei de angajat");
	System.out.println("2. Afisarea colectiei create , folosing referinta la metoda");
	System.out.println("3. Afisarea angajatilor cu Salariu de peste 2500 RON");
	System.out.println("4. Crearea liste de angajati din luna aprilie, care ocupa functii de conducere");
	System.out.println("5. Afisarea angajatilor care nu au functie de conducere in ordine descrescatoare a SalariuLUI");
	System.out.println("6. Extragerea din lista angajatilor o lista de stringuri care contine Numele angajatilor scrise cu majuscule");
	System.out.println("7. Afisarea angajatilor cu Salariuiile mai mici de 3000 RON ");
	System.out.print("Optiunea D-stra:");
	optiune=sc.nextInt();
do
{
	switch(optiune)
	{
	case 1:
		BufferedReader br = new BufferedReader(new FileReader("in.txt"));
		while((str = br.readLine()) !=null)
		{String[] splt = str.split(";");
		Nume = splt[0];
		Post=splt[1];
		Salariu= Float.parseFloat(splt[2]);
		data_angajarii=LocalDate.parse(splt[3]);
		Angajat a = new Angajat(Nume,Post,Salariu,data_angajarii);
		angajat.add(a);
		}
		br.close();
		break;
	case 2:
		angajat.forEach(System.out::println);
		break;
	case 3:
		angajat
		.stream()
		.filter((Angajat) -> Angajat.getSalariu() > 2500)
		.forEach(System.out::println);
		break;
	
	case 4:
		angajat
		.stream()
		.filter((Angajat) -> Angajat.getData_angajarii().getMonthValue()==4)
		.filter((Angajat) -> Angajat.getPost() == "sef" || Angajat.getPost() == "director")
		.forEach(System.out::println);
		break;
	case 5:
		angajat
		.stream()
		.filter((Angajat) -> Angajat.getPost() != "sef" || Angajat.getPost() != "director")
		.forEach(System.out::println);
		break;
	case 6:
		angajat
		.stream()
		.map(Angajat::getNume)
		.map(String::toUpperCase)
		.forEach(System.out::println);
		break;
	case 7:
		angajat
		.stream()
		.filter((Angajat) -> Angajat.getSalariu() < 3000)
		.map((Angajat) -> Angajat.getSalariu())
		.forEach(System.out::println);
		break;
	}

}
while(optiune!=0);
sc.close();
}
}