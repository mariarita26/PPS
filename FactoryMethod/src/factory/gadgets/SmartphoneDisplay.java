package factory.gadgets;

import factory.method.StandardDisplay;

public class SmartphoneDisplay extends StandardDisplay {

    private String features = null;

    public SmartphoneDisplay(double inches) {
        super(inches);
    }

    @Override
    public void assemble() {
        System.out.println("Montando display para SMARTPHONE");
        features = getPolegadas() + "\" Super Retina XDR OLED Display 2532 X 1170 pixels resolution for iPhone 14";
    }

    public String toString() {
        return features;
    }

}
