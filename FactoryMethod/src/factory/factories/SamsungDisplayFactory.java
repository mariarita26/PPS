package factory.factories;

import factory.gadgets.SamsungFoldableDisplay;
import factory.gadgets.SamsungStandardDisplay;
import factory.method.Display;
import factory.method.FoldableDisplay;
import factory.method.StandardDisplay;

public class SamsungDisplayFactory extends Display {

    @Override
    public FoldableDisplay createFoldableDisplay(Double polegadas) {
        return new SamsungFoldableDisplay(polegadas);
    }

    @Override
    public StandardDisplay createStandardDisplay(Double polegadas) {
        return new SamsungStandardDisplay(polegadas);
    }
}
