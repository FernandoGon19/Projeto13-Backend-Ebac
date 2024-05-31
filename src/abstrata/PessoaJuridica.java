package abstrata;

public class PessoaJuridica extends Pessoa{

	private int cnpj;
	
	public void imprimirCnpj() {
		System.out.println("Cnpj: " + cnpj);
	}

	public int getCnpj() {
		return cnpj;
	}

	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}
	
	
}
