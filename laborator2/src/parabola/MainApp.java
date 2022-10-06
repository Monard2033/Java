package parabola;

public class MainApp {

	public static void main(String[] args)
	{
		Parabola p = new Parabola(2,3,9);
		Parabola p1 = new Parabola(2,1,9);
		p.afisare();
		p.CalcVarf();
		Parabola.Mij(p, p1);
	}

}
