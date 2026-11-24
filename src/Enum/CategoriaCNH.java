package Enum;

public enum CategoriaCNH {
	A, //Moto
	B, //Carro e Utilitários
	AB; //Ambos
	
	public boolean permite(CategoriaCNH exigida) {
		return this == AB || this == exigida;
		//Informa se esta categoria(a 'exigida') permite dirigir um veiculo
	}

}
