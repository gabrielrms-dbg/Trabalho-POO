package entidades;

import Enum.CategoriaCNH;

public abstract class Cliente {

	private String nome;
	private String telefone;
	private Endereco endereco;
	private String numeroCNH;
	private CategoriaCNH categoriaCNH;
	
	public Cliente(String nome, String telefone, Endereco endereco, String numeroCNH, CategoriaCNH categoriaCNH) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.endereco = endereco;
		this.numeroCNH = numeroCNH;
		this.categoriaCNH = categoriaCNH;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getNumeroCNH() {
		return numeroCNH;
	}

	public void setNumeroCNH(String numeroCNH) {
		this.numeroCNH = numeroCNH;
	}

	public CategoriaCNH getCategoriaCNH() {
		return categoriaCNH;
	}

	public void setCategoriaCNH(CategoriaCNH categoriaCNH) {
		this.categoriaCNH = categoriaCNH;
	}

	public abstract String getDocumento(); // Devolve o documento que identifica o tipo de cliente (CPF ou CNPJ)
	
	public abstract double getPercentualDesconto(); // Devolve o percentual de desconto do cliente
	
}
