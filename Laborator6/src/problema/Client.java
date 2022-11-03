package problema;

import java.util.HashSet;
import java.util.Set;


public class Client {

	private String nume;
	private String adresa;
	Set<ContBancar> s=new HashSet<ContBancar>();
	public Client(String nume, String adresa)
	{
		super();
		this.nume=nume;
		this.adresa=adresa;
		
	}
	@Override
	public String toString() {
		return "Client [nume=" + nume + ", adresa=" + adresa + ", s=" + s + "]";
	}
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public String getAdresa() {
		return adresa;
	}
	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}
	public Set<ContBancar> getS() {
		return s;
	}
	public void setS(Set<ContBancar> s) {
		this.s = s;
	}
	
	
}
