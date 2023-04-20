package locadora;

import interfaces.Alugavel;

public class Aluguel {
	   private int diasAlugado;
	   private Alugavel item;
	 
	   public Aluguel(Alugavel item, int diasAlugado) {
	      this.item = item;
	      this.diasAlugado = diasAlugado;
	   }
	 
	   public Alugavel getDVD() {
	      return item;
	   }
	 
	   public int getDiasAlugado() {
	      return diasAlugado;
	   }

		public double getValorDeAluguel() {
			return this.item.getValorDoAluguel(diasAlugado);
		}

		public double getPontosDeAlugadorFrequente() {
			return this.item.getPontosDeAlugadorFrequente(diasAlugado);
		}



		
}
