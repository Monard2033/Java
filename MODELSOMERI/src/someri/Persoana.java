package someri;

import java.util.Enumeration;

public class Persoana {
	private String nume;
	private int varsta;
	enum Studii {Medii,Superioare};
	Studii stud;
	
	public Persoana(String nume, int varsta, Studii stud) {
		this.nume = nume;
		this.varsta = varsta;
		this.stud = stud;
	}
	
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public int getVarsta() {
		return varsta;
	}
	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}
	public Studii getStud() {
		return stud;
	}
	public void setStud(Studii stud) {
		this.stud = stud;
	}

	@Override
	public String toString() {
		return "Persoana [nume=" + nume + ", varsta=" + varsta + ", stud=" + stud + "]";
	}
	
	
	
}
