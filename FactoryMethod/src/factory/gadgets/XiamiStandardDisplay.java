package factory.gadgets;

import factory.method.StandardDisplay;

import java.util.concurrent.TimeUnit;

public class XiamiStandardDisplay extends StandardDisplay {

    public XiamiStandardDisplay(double polegadas) {
        super(polegadas);
    }

    @Override
    public void assemble() {
        System.out.println("Montando o display de um XIAOMI NORMAL");
        caracteristicas = getPolegadas() + "\" Liquid Retina Display 2388 x 1668 pixels resolution for XIAOMI PRO Antireflective";
        System.out.println(caracteristicas);
    }

    public String toString() {
        return caracteristicas;
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


}
