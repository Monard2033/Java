package Firma;

import java.time.LocalDate;

public class Angajat {
 protected String Nume,Post;
 float salariu;
 protected LocalDate data_angajarii;
public Angajat(String nume, String post, float Salariu, LocalDate data_angajarii) {
	super();
	Nume = nume;
	Post = post;
	salariu=Salariu;
	this.data_angajarii = data_angajarii;
}
public String getNume() {
	return Nume;
}
public void setNume(String nume) {
	Nume = nume;
}

public float getSalariu() {
	return salariu;
}
public void setSalariu(float salariu) {
	this.salariu = salariu;
}
public String getPost() {
	return Post;
}
public void setPost(String post) {
	Post = post;
}

public LocalDate getData_angajarii() {
	return data_angajarii;
}
public void setData_angajarii(LocalDate data_angajarii) {
	this.data_angajarii = data_angajarii;
}
@Override
public String toString() {
	return "Angajat [Nume=" + Nume + ", Post=" + Post + ", Salariu=" + salariu + ", data_angajarii=" + data_angajarii
			+ "]";
}

}
