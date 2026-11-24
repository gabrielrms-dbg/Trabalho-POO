package entidades;

import Enum.CategoriaCNH;
import Enum.StatusVeiculo;

public class Moto extends Veiculo {

	private int cilindradas;

	public Moto(String placa, String marca, String modelo, int ano, double valorDiaria, StatusVeiculo statusVeiculo, int quilometragem, int cilindradas) {
		
		super(placa, marca, modelo, ano, valorDiaria, statusVeiculo, quilometragem);
		this.cilindradas = cilindradas;
	}

	public int getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(int cilindradas) {
		this.cilindradas = cilindradas;
	}
	
	@Override 
	public CategoriaCNH getCategoriaExigida() {
		return CategoriaCNH.A;
	}
	
	@Override
	public double calcularValorLocacao(int dias) {
		double valorTotal = getValorDiaria() * dias;
		
		if(cilindradas >= 500) {
			valorTotal = valorTotal * 1.20; //acréscimo de 20% para motos mais potentes
		}
		
		return valorTotal;
		
	}
	
	
}
