package abstrata;

public abstract class Pessoa {
	
	private String nome;
	
	private String sobrenome;
	
	public void imprimirNomeSobrenome() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Sobrenome: " + this.sobrenome);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	
}
