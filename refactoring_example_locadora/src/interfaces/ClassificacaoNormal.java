package interfaces;

public abstract class ClassificacaoNormal extends Classificacao{
    
    @Override
    public int getCódigoDePreço(){
        return Classificacao.NORMAL;
    }
    
    @Override
    public double getValorDoAluguel(int diasAlugado) {
        double valor = 2.0;

        if (diasAlugado > 2) {
            valor += (diasAlugado - 2) * 1.5;
        }

        return valor;
    }
    
}
