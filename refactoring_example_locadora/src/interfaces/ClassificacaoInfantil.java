package interfaces;

public abstract class ClassificacaoInfantil extends Classificacao{

    @Override
    public int getCódigoDePreço() {
        return Classificacao.INFANTIL;
    }
    
    @Override
    public double getValorDoAluguel(int diasAlugado) {
        double valor = 1.5;

        if (diasAlugado > 3) {
            valor += (diasAlugado - 3) * 1.5;
        }

        return valor;
    }
    
}
