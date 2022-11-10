package someri;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Somer extends Persoana {

	LocalDate dataIntrareInSomaj;
	public Somer(String nume, int varsta, Studii stud,LocalDate dataIntrareInSomaj) {
		super(nume, varsta, stud);
		// TODO Auto-generated constructor stub
		this.dataIntrareInSomaj=dataIntrareInSomaj;
	}
	
	public LocalDate getDataIntrareInSomaj() {
		return dataIntrareInSomaj;
	}
	public void setDataIntrareInSomaj(LocalDate dataIntrareInSomaj) {
		this.dataIntrareInSomaj = dataIntrareInSomaj;
	}
	
	public long functie() {
		return ChronoUnit.YEARS.between(dataIntrareInSomaj,LocalDate.now());
	}
	

	@Override
	public String toString() {
		return super.toString()+" Somer [dataIntrareInSomaj=" + dataIntrareInSomaj + "]";
	}

	
	
	
}
