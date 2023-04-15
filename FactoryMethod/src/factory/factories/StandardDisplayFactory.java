package factory.factories;

import factory.method.StandardDisplay;

import java.util.concurrent.TimeUnit;

public abstract class StandardDisplayFactory{

    public StandardDisplay create(double inches) {
        StandardDisplay display = createDisplay(inches);
        display.assemble();
        qualityTest(display);
        return display;
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

    protected abstract StandardDisplay createDisplay(double inches);
}
