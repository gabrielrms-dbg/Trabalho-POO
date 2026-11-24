package entidades;

import Enum.CategoriaCNH;
import Enum.StatusVeiculo;

public class Utilitarios extends Veiculo{
	
	private int capacidadeKg;
	
	public Utilitarios(String placa, String marca, String modelo, int ano, double valorDiaria, StatusVeiculo statusVeiculo, int quilometragem, int capacidadeKg) {
		super(placa, marca, modelo, ano, valorDiaria, statusVeiculo, quilometragem);
		
		this.capacidadeKg = capacidadeKg;
	}

	public int getCapacidadeKg() {
		return capacidadeKg;
	}

	public void setCapacidadeKg(int capacidadeKg) {
		this.capacidadeKg = capacidadeKg;
	}
	
	@Override 
	public CategoriaCNH getCategoriaExigida() {
		return CategoriaCNH.B;
	}
	
	@Override
	public double calcularValorLocacao (int dias) {
		double valorBase = getValorDiaria() * dias;
		double valorTaxa = 0.0;
		
		// Capacidade > 1500kg acréscimo de 30%; Capacidade > 700Kg acréscimo de 15%
		if (capacidadeKg > 1500) {
			valorTaxa = valorBase * 0.30;
		} else if (capacidadeKg > 700) {
			valorTaxa = valorBase * 0.15;
		}
		
		return valorBase + valorTaxa;
	}
	
}
