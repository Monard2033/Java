package Problema_Trenuri;

import java.time.LocalDate;

public class Tren implements Comparable<Tren> { 
	private int numar_tren, numar_vagoane;
	private LocalDate data_ultimei_revizii;
	public Tren(int numar_tren, int numar_vagoane, LocalDate data_ultimei_revizii) {
		this.numar_tren = numar_tren;
		this.numar_vagoane = numar_vagoane;
		this.data_ultimei_revizii = data_ultimei_revizii;
	}
	public int getNumar_tren() {
		return numar_tren;
	}
	public void setNumar_tren(int numar_tren) {
		this.numar_tren = numar_tren;
	}
	public int getNumar_vagoane() {
		return numar_vagoane;
	}
	public void setNumar_vagoane(int numar_vagoane) {
		this.numar_vagoane = numar_vagoane;
	}
	public LocalDate getData_ultimei_revizii() {
		return data_ultimei_revizii;
	}
	public void setData_ultimei_revizii(LocalDate data_ultimei_revizii) {
		this.data_ultimei_revizii = data_ultimei_revizii;
	}
	@Override
	public String toString() {
		return "Tren [numar_tren=" + numar_tren + ", numar_vagoane=" + numar_vagoane + ", data_ultimei_revizii="
				+ data_ultimei_revizii + "] ";
	}
	@Override
	public int compareTo(Tren t)
	{
		if (this.numar_tren>t.getNumar_tren())
			return 1;
		else if (this.numar_tren<t.getNumar_tren())
			return -1;
		return 0;
	}
}
