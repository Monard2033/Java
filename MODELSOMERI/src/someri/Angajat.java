package someri;

public class Angajat extends Persoana {

	protected int salar;
	protected int vechime;
	public Angajat(String nume, int varsta, Studii stud,int salar, int vechime) {
		super(nume, varsta, stud);
		// TODO Auto-generated constructor stub
		this.salar=salar;
		this.vechime=vechime;
	}
	public int getSalar() {
		return salar;
	}
	public void setSalar(int salar) {
		this.salar = salar;
	}
	public int getVechime() {
		return vechime;
	}
	public void setVechime(int vechime) {
		this.vechime = vechime;
	}
	
	@Override
	public String toString() {
		return super.toString()+" Angajat [salar=" + salar + ", vechime=" + vechime + "]";
	}
	
	
	
	
}
