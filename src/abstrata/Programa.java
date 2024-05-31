package abstrata;

public class Programa {

	public static void main(String[] args) {

		PessoaFisica pessoaF = new PessoaFisica();
		
		pessoaF.setNome("Fernando");
		pessoaF.setSobrenome("Gonçalves");
		pessoaF.setCpf(1423543631);
		pessoaF.imprimirNomeSobrenome();
		pessoaF.imprimirCpf();
		
		System.out.println();
		
		PessoaJuridica pessoaJ = new PessoaJuridica();
		
		pessoaJ.setNome("Arouca");
		pessoaJ.setSobrenome("Alves");
		pessoaJ.setCnpj(325325062);
		pessoaJ.imprimirNomeSobrenome();
		pessoaJ.imprimirCnpj();
		
		
	}

}
