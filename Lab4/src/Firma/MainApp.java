package Firma;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainApp {

	static void scrie(Object o, String fis) {
		try {
		FileOutputStream f = new FileOutputStream(fis);
		ObjectOutputStream oos = new ObjectOutputStream(f);
		oos.writeObject(o);
		oos.close();
		f.close();
		}
		catch (IOException e) {
		e.printStackTrace();
		}
	}
	static Object citeste(String fis) {
		try {
			FileInputStream f = new FileInputStream(fis);
			ObjectInputStream ois = new ObjectInputStream(f);
			Object o = ois.readObject();
			ois.close();
			f.close();
			return o;
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int optiune = sc.nextInt();
		List<Echipament> echipamente = new ArrayList<Echipament>();

		scrie(echipamente, "echip.txt");
		List<Echipament> q;
		q = (List<Echipament>) citeste("echip.txt");
		for (Echipament p : q)
			System.out.println(p);
		do {
			switch (optiune) {
			case 1:
				System.out.println("Afişarea imprimantelor");
				break;
			case 2:
				System.out.println("Afişarea copiatoarelor");
				break;
			case 3:
				System.out.println("Afişarea sistemelor de calcul");
				break;
			case 4:
				System.out.println("Modificarea stării în care se află un echipament");
				break;
			case 5:
				System.out.println("Setarea unui anumit mod de scriere pentru o imprimantă");
				break;
			case 6:
				System.out.println("Setarea unui format de copiere pentru copiatoare");
				break;
			case 7:
				System.out.println("Instalarea unui anumit sistem de operare pe un sistem de calcul");
				break;
			}
			sc.close();
		} while (optiune != 0);
	}

}
