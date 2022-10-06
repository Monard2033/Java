package parabola;

public class Parabola {

	private double a,b,c,x,y;
	public Parabola(double a,double b,double c)
	{
		this.a=a*a;
		this.b=b;
		this.c=c;
	}
	public Parabola(Parabola p)
	{
		a=p.a;
		b=p.b;
		c=p.c;
		x=p.x;
		y=p.y;
	}

	public void afisare()
	{
		System.out.println("f(x)="+this.a+"x^2"+"+"+this.b+"y"+"+"+this.c);
	}
	public void CalcVarf()
	{
		x=-b/(2*a);
		y=(-b+4*a*c)/(4*a);
		System.out.println("Coordonatele Varfului Parabolei este ("+x+","+y+")");
	}
	public static void Mij(Parabola p1,Parabola p2)
	{
		double x1,y1;
		x1= (p1.x+p2.x)/2;
		y1=(p1.y+p2.y)/2;
		System.out.println("Coordonatele mijlocului primei parabole sunt ("+x1+","+y1+")");
	}
}
