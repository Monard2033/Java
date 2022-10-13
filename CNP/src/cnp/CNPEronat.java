package cnp;

public class CNPEronat extends Exception {
	private String mesaj;
    public void CNPeronat(String mesaj)
    {
	   this.mesaj=mesaj;
    }
    public void LungimeEronata() {
    	System.out.println("CNP-ul trebu sa aiba 13 cifre");
    }
    public void datanasterii()
    {
    	System.out.println("Data nasterii a fost introdusa gresit");
    }
}
