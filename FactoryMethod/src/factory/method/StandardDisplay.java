package factory.method;

import java.util.concurrent.TimeUnit;

public abstract class StandardDisplay {

    private double polegadas;
    protected String caracteristicas = null;

    public StandardDisplay(double polegadas) {
        this.polegadas = polegadas;
    }

    public double getPolegadas() {
        return polegadas;
    }

    public abstract void assemble( );

    public void qualityTest( StandardDisplay display ) {
        System.out.print("Teste de Qualidade: ");
        for (int i = 1; i < 4; i++) {
            System.out.print(  "[*] ");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(" OK (passed)");

    }

}
