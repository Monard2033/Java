package problema;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

public class ContBancar implements Operatiuni {
	public String numarCont;
	public float suma;
	private String moneda;
	private LocalDate data_deschiderii;
	private LocalDate data_ultimei_operatiuni;
	private float suma_ac;
	
	

	@Override
	public int hashCode() {
		return Objects.hash(data_deschiderii, data_ultimei_operatiuni, moneda, numarCont, suma, suma_ac);
	}

	@Override
	public String toString() {
		return "ContBancar [numarCont=" + numarCont + ", suma=" + suma + ", moneda=" + moneda + ", data_deschiderii="
				+ data_deschiderii + ", data_ultimei_operatiuni=" + data_ultimei_operatiuni + ", suma_ac=" + suma_ac
				+ "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ContBancar other = (ContBancar) obj;
		return Objects.equals(data_deschiderii, other.data_deschiderii)
				&& Objects.equals(data_ultimei_operatiuni, other.data_ultimei_operatiuni)
				&& Objects.equals(moneda, other.moneda) && Objects.equals(numarCont, other.numarCont)
				&& Float.floatToIntBits(suma) == Float.floatToIntBits(other.suma)
				&& Float.floatToIntBits(suma_ac) == Float.floatToIntBits(other.suma_ac);
	}
    
	
	@Override
	public float calculeaza_dobanda() 
	{
		float dob = 0;
		long days = ChronoUnit.DAYS.between(data_ultimei_operatiuni, LocalDate.now());
		if(moneda.equals("RON")) {
			if(suma < 500) {
				dob = (float) (0.3*days);
			}
			else {
				dob = (float) (0.8*days);
			}
		}
		else {
			dob = (float) (0.1*days);
		}
		return dob;
	}

	@Override
	public float actualizare_suma() 
	{
		this.data_ultimei_operatiuni = LocalDate.now();
		return (suma + calculeaza_dobanda());
	}

	@Override
	public void depunere(float suma) {
		this.suma += suma;
		this.data_ultimei_operatiuni = LocalDate.now();
	}

	@Override
	public void extragere(float suma) {
		this.suma -= suma;
		this.data_ultimei_operatiuni = LocalDate.now();
	}

	public String getNumarCont() {
		return numarCont;
	}

	public void setNumarCont(String numarCont) {
		this.numarCont = numarCont;
	}
	
	
	

	
}
