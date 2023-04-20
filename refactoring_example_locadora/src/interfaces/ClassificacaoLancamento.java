package interfaces;

public abstract class ClassificacaoLancamento extends Classificacao{

    @Override
    public int getCódigoDePreço() {
        return Classificacao.LANCAMENTO;
    }
    
    @Override
    public double getValorDoAluguel(int diasAlugado) {
        return diasAlugado * 3.00;
    }
 
    @Override
    public int getPontosDeAlugadorFrequente(int diasAlugados) {
        return super.getPontosDeAlugadorFrequente(diasAlugados) + 1;
    }
    
}
