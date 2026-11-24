package entidades;

import Enum.CategoriaCNH;
import Enum.StatusVeiculo;

public class Carro extends Veiculo{
	
	private int nmrPortas;
	private boolean arCondicionado;
	private boolean cambioAutomatico;
	
	public Carro(String placa, String marca, String modelo, int ano, double valorDiaria, StatusVeiculo statusVeiculo, int quilometragem, int nmrPortas, boolean arCondicionado, boolean cambioAutomatico) {
		super(placa, marca, modelo, ano, valorDiaria, statusVeiculo, quilometragem);
		
		this.nmrPortas = nmrPortas;
		this.arCondicionado = arCondicionado;
		this.cambioAutomatico = cambioAutomatico;
	}

	public int getNmrPortas() {
		return nmrPortas;
	}

	public void setNmrPortas(int nmrPortas) {
		this.nmrPortas = nmrPortas;
	}

	public boolean isArCondicionado() {
		return arCondicionado;
	}

	public void setArCondicionado(boolean arCondicionado) {
		this.arCondicionado = arCondicionado;
	}

	public boolean isCambioAutomatico() {
		return cambioAutomatico;
	}

	public void setCambioAutomatico(boolean cambioAutomatico) {
		this.cambioAutomatico = cambioAutomatico;
	}
	
	@Override 
	public CategoriaCNH getCategoriaExigida() {
		return CategoriaCNH.B;
	}
	
	@Override
	public double calcularValorLocacao(int dias) {
		
		double valorTotal = getValorDiaria() * dias;
		if (dias >= 7) {
			valorTotal = valorTotal*0.9; //desconto de 10% para quantidade de dias igual ou maior a 7
		}
		
		return valorTotal;		
	}
	
}
