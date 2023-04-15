package factory.gadgets;

import factory.method.StandardDisplay;

import java.util.concurrent.TimeUnit;

public class SamsungStandardDisplay extends StandardDisplay {

    public SamsungStandardDisplay(double polegadas) {
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
        System.out.println("Montando o display de um SAMSUNG NORMAL");
        caracteristicas = getPolegadas() + "\" Liquid Retina Display 2388 x 1668 pixels resolution for SAMSUNG PRO Antireflective";
        System.out.println(caracteristicas);
    }

    public String toString() {
        return caracteristicas;
    }
}
