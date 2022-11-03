package problema;

import java.util.ArrayList;
import java.util.List;

public class Banca {

	
	private String denumire_banca;
	private List<Client> clienti = new ArrayList<Client>();
	static int nrClient = 0;

	public Banca(String denumire_banca) 
	{
		super();
		this.denumire_banca = denumire_banca;
	}

	public void addClient(Client c)
	{
		clienti.add(c);
	}

	public String getDenumire() 
	{
		return denumire_banca;
	}

	public void setDenumireBanca(String denumire_banca) 
	{
		this.denumire_banca = denumire_banca;
	}

	public List<Client> getClienti() 
	{
		return clienti;
	}

	@Override
	public String toString() 
	{
		return "Numele bancii:" + denumire_banca + ", " + " numele clientului " + clienti;
	}
}
