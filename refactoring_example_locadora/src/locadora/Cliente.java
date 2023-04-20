package locadora;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Cliente {
	private String nome;
	private List<Aluguel> dvdsAlugados = new ArrayList<Aluguel>();
	private List<Aluguel> alugueis = new ArrayList<>();

	public Cliente(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void adicionaAluguel(Aluguel aluguel) {
		dvdsAlugados.add(aluguel);
	}


	// public String extratoHTML() {
	// 	final String fimDeLinha = System.getProperty("line.separator");

	// 	Iterator<Aluguel> alugueis = dvdsAlugados.iterator();
	// 	String resultado = "<H1>Registro de Alugueis de <EM>" + getNome() + "</EM></H1><P>" + fimDeLinha;
		
	// 	while(alugueis.hasNext()) {
	// 		Aluguel cada = alugueis.next();
	// 		// mostra valores para este aluguel
	// 		resultado += cada.getDVD().getTítulo() + ": R$ " +

	// 		cada.valorDeUmAluguel() + "<BR>"+ fimDeLinha;
	// 	} 

	// 	// adiciona rodapé
	// 	resultado += "<P>Valor total pago: <EM>R$ " + getValorTotal() +
	// 	"</EM>"+ fimDeLinha;
	// 	resultado += "<P>Voce acumulou <EM>" + getPontosTotaisDeAlugadorFrequente() + " pontos </EM> de alugador frequente";

	// 	return resultado;
	// }
	
	
	public double getValorTotal() {
		Iterator<Aluguel> alugueis = this.alugueis.iterator();
		double valorTotal = 0.0;

		while (alugueis.hasNext()) {
			Aluguel aluguel = alugueis.next();

			valorTotal += aluguel.getValorDeAluguel();
		}
		return valorTotal;
	}

	public int getPontosTotaisDeAlugadorFrequente() {
		Iterator<Aluguel> alugueis = this.alugueis.iterator();
		int pontosTotaisDeAlugadorFrequente = 0;

		while(alugueis.hasNext()) {
			Aluguel aluguel = alugueis.next();

			pontosTotaisDeAlugadorFrequente += aluguel.getPontosDeAlugadorFrequente();
		}
		return pontosTotaisDeAlugadorFrequente;
	}

}