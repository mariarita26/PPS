import locadora.Cliente;
import interfaces.Classificacao;
import locadora.Aluguel;
import locadora.DVD;

public class Locadora {
	public static void main(String[] args) {
		Cliente c1 = new Cliente("Alex Sandro");		 

		c1.adicionaAluguel(new Aluguel(new DVD("O Atirador", Classificacao.NORMAL), 10));
		c1.adicionaAluguel(new Aluguel(new DVD("Luca", Classificacao.INFANTIL), 2));
		c1.adicionaAluguel(new Aluguel(new DVD("O Gato de Botas 2", Classificacao.LANCAMENTO), 30));
		c1.adicionaAluguel(new Aluguel(new DVD("Arremessando Alto", Classificacao.LANCAMENTO), 4));
		c1.adicionaAluguel(new Aluguel(new DVD("Moana", Classificacao.INFANTIL), 10));
		c1.adicionaAluguel(new Aluguel(new DVD("Uma Noite no Museu", Classificacao.NORMAL), 3));

	}
}
