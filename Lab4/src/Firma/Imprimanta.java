package Firma;

public class Imprimanta extends Echipament {

	protected int dpi, p_car;

	enum Tip_print {
		color, alb_negru
	}

	protected Tip_print tip_print;

	public Imprimanta(String denumire, int nr_inv, int pret, String zona_mag,Stare stare,int dpi,int p_car,Tip_print tip_print) {
		super(denumire, nr_inv, pret, zona_mag, stare);
		this.dpi = dpi;
		this.p_car = p_car;
		this.tip_print = tip_print;
	}

	@Override
	public String toString() {
		return super.toString() + "Imprimanta [dpi=" + dpi + ", p_car=" + p_car + ", tip_print=" + tip_print + "]";
	}

}
