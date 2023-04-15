package factory.gadgets;


import factory.method.StandardDisplay;

public class TabletDisplay extends StandardDisplay {

    public TabletDisplay(double inches) {
        super(inches);
    }

    @Override
    public void assemble() {
        System.out.println("Montando o display de um TABLET");
        caracteristicas = getPolegadas() + "\" Liquid Retina Display 2388 x 1668 pixels resolution for iPad PRO";
    }

    public String toString() {
        return caracteristicas;
    }

}
