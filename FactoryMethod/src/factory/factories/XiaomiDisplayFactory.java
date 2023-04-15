package factory.factories;

import factory.factories.StandardDisplayFactory;
import factory.gadgets.SamsungFoldableDisplay;
import factory.gadgets.XiamiStandardDisplay;
import factory.gadgets.XiaomiFoldableDisplay;
import factory.method.Display;
import factory.method.FoldableDisplay;
import factory.method.StandardDisplay;

public class XiaomiDisplayFactory extends Display {

    @Override
    public FoldableDisplay createFoldableDisplay(Double polegadas) {
        return new XiaomiFoldableDisplay(polegadas);
    }

    @Override
    public StandardDisplay createStandardDisplay(Double polegadas) {
        return new XiamiStandardDisplay(polegadas);
    }
}
