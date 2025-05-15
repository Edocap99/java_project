package rubrica;

public class contatto {
	private String nome;
	private String cognome;
	private String telefono;
	
	public contatto(String nome, String telefono, String cognome) {
		this.nome = nome;
		this.telefono = telefono;
		this.cognome = cognome;
	}
	
	public String getNome() {
		return nome;
	}
	
    public String getCognome() {
		return cognome;
	}
	
	public String getTelefono() {
		return telefono;
	}
	
	@Override
	public String toString() {
		return "Nome: " + nome + "Cognome: " + cognome + " Telefono " + telefono;
	}

}
