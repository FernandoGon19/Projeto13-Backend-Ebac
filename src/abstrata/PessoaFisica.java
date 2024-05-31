package abstrata;

public class PessoaFisica extends Pessoa {

	private int cpf;

	public void imprimirCpf() {
		System.out.println("Cpf: " + this.cpf);
	}
	
	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
}
