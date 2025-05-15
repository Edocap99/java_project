package rubrica;
import java.util.ArrayList;

public class Rubrica {
	private ArrayList<contatto> contatti;
	
	public Rubrica() {
		contatti = new ArrayList<>();
	}
	
	public void aggiungiContatto(String nome, String telefono, String cognome) {
		contatto c = new contatto (nome,telefono,cognome);
		contatti.add(c);
	}
	
	public void mostraContatti() {
		if(contatti.isEmpty()) {
			System.out.println("La rubrica è vuota.");
		}else {
		for (contatto c: contatti) {
			System.out.println(c);
		  }
		}
	}

}
