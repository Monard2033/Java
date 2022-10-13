package cnp;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Persoana {

	public String Nume, CNP;

	public Persoana(String Nume, String CNP) {
		this.Nume = Nume;
		this.CNP = CNP;
	}

	public String getNume() {
		return Nume;
	}

	public void setNume(String nume) {
		Nume = nume;
	}

	public String getCNP() {
		return CNP;
	}

	public void setCNP(String cNP) {
		CNP = cNP;
	}

	public void getVarsta()
	{
		String k=CNP.substring(0,1);
		String an=CNP.substring(1, 3);
		String luna=CNP.substring(3, 5);
		String zi=CNP.substring(5, 7);
		int categ = Integer.parseInt(k);
		int AN=Integer.parseInt(an);
		int LUNA=Integer.parseInt(luna);
		int ZI=Integer.parseInt(zi);
		if (categ == 1 || categ == 2)
		{
			AN+=1900;
		}
		if(categ == 5 || categ== 6)
		{
			AN+=2000;
		}
		LocalDate data=LocalDate.of(AN, LUNA, ZI);
		long ani=ChronoUnit.YEARS.between(data, LocalDate.now());
		System.out.println(Nume+ "are varsta de "+ani);
	}
}
