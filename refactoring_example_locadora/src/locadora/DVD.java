package locadora;

import interfaces.Alugavel;
import interfaces.Classificacao;
import interfaces.ClassificacaoInfantil;
import interfaces.ClassificacaoLancamento;
import interfaces.ClassificacaoNormal;

public class DVD implements Alugavel{

	  private String título;

	  private Classificacao classificacao;

	  public DVD(String título, int codigoDePreco) {
	    this.título = título;
	    this.setCodigoDePreco(codigoDePreco);
	  }
	 
	  public String getTítulo() {
	    return título;
	  }
	 
	public void setCodigoDePreco(int codigoDePreco) {
        switch (codigoDePreco) {
            case 0 -> this.classificacao = new ClassificacaoNormal();
            case 1 -> this.classificacao = new ClassificacaoLancamento();
            case 2 -> this.classificacao = new ClassificacaoInfantil();
        }
    }

	public double getValorDoAluguel(int diasAlugado) {
        return this.classificacao.getValorDoAluguel(diasAlugado);
    } 

	public int getPontosDeAlugadorFrequente(int diasAlugado) {
		return this.classificacao.getPontosDeAlugadorFrequente(diasAlugado);
	}
}
