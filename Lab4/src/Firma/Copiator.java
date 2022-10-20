package Firma;

public class Copiator extends Echipament {

	enum Format{
		FormA4,
		FormA3
	}
	protected int p_ton;
	protected Format form;
	public Copiator(String denumire, int nr_inv, int pret, String zona_mag, Stare stare, int p_ton, Format form) {
		super(denumire, nr_inv, pret, zona_mag, stare);
			this.p_ton=p_ton;
			this.form=form;
	}
	@Override
	public String toString() {
		return super.toString() + "Copiator [p_ton=" + p_ton + ", form=" + form + "]";
	}
	

}
