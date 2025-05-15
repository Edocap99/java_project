package rubrica;
import java.util.Scanner;


public class main {

	public static void main(String[] args) {
		Rubrica rubrica = new Rubrica();
		Scanner scanner =  new Scanner(System.in);
		int scelta;
		
		do {
			System.out.println("\n--- Menu Rubrica ----");
			System.out.println("1. Aggiungi contatto");
			System.out.println("2. Mostra tutti i contatti");
			System.out.println("0. Esci");
			System.out.println("Scelta: ");
			scelta = scanner.nextInt();
			scanner.nextLine();
			
			switch (scelta) {
			case 1:
				System.out.print("Nome: ");
				String nome = scanner.nextLine();
				System.out.print("Telefono: ");
				String telefono = scanner.nextLine();
				System.out.print("Cognome: ");
				String cognome = scanner.nextLine();
				
				rubrica.aggiungiContatto(nome, telefono, cognome);
				break;
				
			case 2:
				rubrica.mostraContatti();
				break;
				
			case 0:
				System.out.println("Uscita..");
				break;
				
				default:
					System.out.println("Scelta non valida.");
			}
			
			
			
		}while(scelta != 0);
		scanner.close();


	}

}
