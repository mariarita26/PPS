package factory.gadgets;

import factory.method.FoldableDisplay;
import factory.method.StandardDisplay;

import java.util.concurrent.TimeUnit;

public class SamsungFoldableDisplay extends FoldableDisplay {
    public SamsungFoldableDisplay(double polegadas) {
        super(polegadas);
    }

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

    @Override
    public void assemble() {
        System.out.println("Montando o display de um SAMSUNG DOBRÁVEL");
        caracteristicas = getPolegadas() + "\" Liquid Retina Display 2300 x 1656 pixels resolution for SAMSUNG DOBRAVEL Antireflective";
        System.out.println(caracteristicas);
    }

}
