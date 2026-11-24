package entidades;

import Enum.CategoriaCNH;

public class ClientePessoaJuridica extends Cliente {
	
	private final String cnpj;
	private String razaoSocial;
	
	public ClientePessoaJuridica(String nome, String telefone, Endereco endereco, String numeroCNH, CategoriaCNH categoriaCNH, String cnpj, String razaoSocial) {
		super(nome, telefone, endereco, numeroCNH, categoriaCNH);
		
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}
	
	@Override
	public String getDocumento() {
		return cnpj;
	}
	
	@Override
	public double getPercentualDesconto() {
		return 0.10; // Pessoa jurídica tem 10% de desconto
	}
	
}
