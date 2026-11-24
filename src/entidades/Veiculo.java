package entidades;

import Enum.CategoriaCNH;
import Enum.StatusVeiculo;

public abstract class Veiculo {
	
	private String placa;
	private String marca;
	private String modelo;
	private int ano;
	private double valorDiaria;
	private StatusVeiculo statusVeiculo;
	private int quilometragem;
	
	public Veiculo(String placa, String marca, String modelo, int ano, double valorDiaria, StatusVeiculo statusVeiculo, int quilometragem) {
		super();
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.valorDiaria = valorDiaria;
		this.statusVeiculo = statusVeiculo;
		this.quilometragem = quilometragem;
	}

	public String getPlaca() {
		return placa;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public int getAno() {
		return ano;
	}

	public double getValorDiaria() {
		return valorDiaria;
	}

	public StatusVeiculo getStatusVeiculo() {
		return statusVeiculo;
	}

	public int getQuilometragem() {
		return quilometragem;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public void setValorDiaria(double valorDiaria) {
		this.valorDiaria = valorDiaria;
	}

	public void setQuilometragem(int quilometragem) {
		this.quilometragem = quilometragem;
	}
	
	public abstract double calcularValorLocacao(int dias);
	
	public abstract CategoriaCNH getCategoriaExigida();
}
