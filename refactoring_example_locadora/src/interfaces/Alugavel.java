package interfaces;

public interface Alugavel {

    public String getTítulo();
    
    public double getValorDoAluguel(int diasAlugado);

    public int getPontosDeAlugadorFrequente(int diasAlugado);
    
}
