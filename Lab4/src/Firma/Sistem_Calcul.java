package Firma;

public class Sistem_Calcul extends Echipament {

	enum Tip_sis {
		instalWin,
		instalLinux
	}
	protected String tip_mon;
	protected int vit_proc;
	protected int c_hdd;
	protected Tip_sis sis_oper;
	
	public Sistem_Calcul(String denumire, int nr_inv, int pret, String zona_mag, Stare stare,String tip_mon,int vit_proc,int c_hdd,Tip_sis sist_oper ) {
		super(denumire, nr_inv, pret, zona_mag, stare);
	 this.tip_mon=tip_mon;
	 this.vit_proc=vit_proc;
     this.c_hdd=c_hdd;
     this.sis_oper=sist_oper;
	}

	@Override
	public String toString() {
		return "Sistem_Calcul [tip_mon=" + tip_mon + ", vit_proc=" + vit_proc + ", c_hdd=" + c_hdd + ", sis_oper="
				+ sis_oper + "]";
	}

}
