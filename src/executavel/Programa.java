package executavel;

import java.time.LocalDate;

import Enum.CategoriaCNH;
import Enum.StatusVeiculo;
import entidades.Carro;
import entidades.Cliente;
import entidades.ClientePessoaFisica;
import entidades.ClientePessoaJuridica;
import entidades.Endereco;
import entidades.Moto;
import entidades.Utilitarios;
import entidades.Veiculo;

public class Programa {

	public static void main(String[] args) {
		// Teste criacção de veículos:
		
		Veiculo carro = new Carro("ABC1D23", "Honda", "Civic", 2020, 300.00, StatusVeiculo.DISPONIVEL, 5000, 4, true, true);
		Veiculo moto = new Moto("EFG1H23", "Honda", "Biz", 2015, 100.00, StatusVeiculo.DISPONIVEL, 10000, 125);
		Veiculo van = new Utilitarios("IJK1L23", "Mercedes", "Sprinter", 2022, 500.00, StatusVeiculo.ALUGADO, 7000, 1500);

		
		// Teste criação de clientes:
		
		Cliente ana = new ClientePessoaFisica("Lionel Messi", "71 99999-9999", new Endereco("BA", "Salvador", "Rua Certinho", 100), "12345678900", CategoriaCNH.B, "111.222.333-44", LocalDate.of(1995, 3, 12));
		Cliente empresa = new ClientePessoaJuridica("Cristiano Ronaldo", "71 8888-8888", new Endereco("BA", "Salvador", "Rua Erradinho", 200), "98765432100", CategoriaCNH.AB, "12.345.678/9101-11", "Siuuuu Ltda");

	}

}
